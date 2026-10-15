# API Test Cases

| ID | Test | Expected |
|---|---|---|
| API-001 | Valid GET | 200 and correct response schema |
| API-002 | Missing resource | Correct 4xx response |
| API-003 | Valid POST | Resource created with expected response |
| API-004 | Missing mandatory field | Validation error |
| API-005 | Invalid token | Authentication error |
| API-006 | Expired token | Request rejected according to security rules |
| API-007 | Invalid data type | Validation error |
| API-008 | Duplicate request | Business rule is enforced |
| API-009 | Unsupported method | Correct method error |
| API-010 | Response time | Meets agreed performance threshold |
