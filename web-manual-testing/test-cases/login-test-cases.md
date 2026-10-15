# Login Test Cases

| ID | Scenario | Expected Result |
|---|---|---|
| LOGIN-001 | Valid username and password | User is authenticated and redirected to the expected landing page |
| LOGIN-002 | Invalid password | Clear validation message is displayed and authentication is rejected |
| LOGIN-003 | Blank username | Required-field validation is displayed |
| LOGIN-004 | Blank password | Required-field validation is displayed |
| LOGIN-005 | Invalid username format | Input validation is displayed |
| LOGIN-006 | Multiple failed attempts | Security/rate-limit behavior follows the requirement |
| LOGIN-007 | Logout then browser Back | Protected page is not accessible without authentication |
| LOGIN-008 | Session timeout | User is redirected to authentication when the session expires |
