# Sample Bug Report

## Title
Search filter remains applied after the user changes project context

## Environment
- Browser: Chrome
- Environment: QA
- Module: Search / Filters

## Preconditions
User is logged in and has access to more than one project.

## Steps
1. Open the search page.
2. Select Project A.
3. Apply a category filter.
4. Change the project to Project B.
5. Observe the filter results.

## Actual Result
Results continue to reflect the previous project/filter context.

## Expected Result
Filters should be refreshed or cleared according to the selected project context.

## Severity
High

## Priority
High

## Impact
Users can receive misleading results and may perform actions against the wrong project context.
