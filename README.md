# CDI Code Completion Performance Issue — Reproduction Project

This project reproduces a performance regression introduced in IntelliJ IDEA 2024.2, where the Jakarta EE CDI plugin causes noticeable slowness during code editing in CDI-managed classes.

## What the issue is

When working in a project with a large number of CDI beans, IntelliJ IDEA performs an expensive background scan on every code completion invocation (`Ctrl+Space`). The scan resolves all injection points in the module and checks bean assignability for each one — regardless of whether the current cursor position is an injection point. On large enough projects this scan takes several seconds, during which:

- A loading indicator is visible at the bottom of the completion popup
- The IDE may feel sluggish or unresponsive while background threads are saturated
- The issue reproduces reliably and repeatedly during normal editing

Disabling the **Jakarta EE: Context and Dependency Injection (CDI)** plugin removes the slowness entirely.

## Affected versions

- Reproduces on: 2024.2.x and later (including 2025.1, 2025.3)
- Partially fixed in: 2024.3.3 — the original blocking UI freeze was resolved, but the background scan overhead remains
- Related issue: IDEA-359394

## Project structure

| Module | Contents |
|---|---|
| `cdi-core` | 31 service interfaces, 16 qualifiers, 4-level abstract class hierarchy |
| `cdi-app` | 300+ service implementations, 400 chain beans, 20 heavy producer beans, 60 controllers |

**Scale numbers that drive the slowness:**
- ~750 CDI beans total
- ~422 `@Produces` methods across 20 producer classes
- ~200 injection points in controller classes
- 4-level class hierarchy for type resolution

**Hot path (from JFR snapshot on build 251.23774.435):**
```
DefaultDispatcher-worker-XX  (background thread)
  CdiInjectionUtils.getInjectedBeans(Module, GlobalSearchScope)
    CdiManager.resolveBeanByType(...)
      CdiManager.resolveProducesBeans(...)
        CdiManager.isAssignable(...)   ← ~84,400 type checks per scan
          PsiClassReferenceType.resolve()
```

**Expected behavior:** the CDI plugin should not run injection point resolution when the completion position is not an injection point candidate.

## How to reproduce

1. Open the project in IntelliJ IDEA with the CDI plugin enabled
2. Open `cdi-app/src/main/java/com/example/cdi/controller/DemoController.java`
3. Place the cursor inside the `testCompletionPoint()` method body
4. Type any identifier — e.g. `InstanceOf` — and press `Ctrl+Space`
5. Observe the **loading indicator** in the completion popup (visible for 2–3 seconds)
6. Repeat with the CDI plugin disabled (**Settings → Plugins → disable "CDI"**) to confirm the difference — no loading indicator appears

> **Note:** `InstanceOf` has no CDI relevance. The loading indicator appears regardless of what is typed, confirming the scan fires unconditionally for all completions inside a CDI-managed class.

### Resetting the cache between attempts

Results are cached after the first scan. To force a cold-cache run between attempts:
- Type a space anywhere in the file, then press `Ctrl+Z` to undo
- This increments `PsiModificationTracker` and invalidates the CDI cache

### Most reliable cold-cache state

Close and reopen the project — the first `Ctrl+Space` after project open always hits a cold cache and shows the full delay.

## What makes it slow at scale

The severity scales with the number of CDI beans, injection points, and producer methods in the project. This reproduction project is intentionally sized to make the background overhead measurable. Real-world enterprise projects with hundreds of beans can experience delays of 5–10 seconds.

## Requirements

- Java 17
- Maven 3.8+
- IntelliJ IDEA 2024.2 or later with the CDI plugin enabled
