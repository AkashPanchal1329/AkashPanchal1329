# File Upload Test Cases

| ID | Scenario | Expected Result |
|---|---|---|
| FILE-001 | Upload supported file | File uploads successfully |
| FILE-002 | Upload unsupported extension | Upload is rejected with a useful message |
| FILE-003 | Upload maximum allowed size | File follows configured size rule |
| FILE-004 | Upload file above maximum size | Upload is rejected |
| FILE-005 | Upload duplicate file | Duplicate behavior follows the requirement |
| FILE-006 | Cancel upload | Upload is cancelled without corrupting existing data |
| FILE-007 | Upload with slow network | Progress/error behavior remains usable |
