# Payment Test Scenarios

| ID | Scenario | Expected |
|---|---|---|
| PAY-001 | Valid payment | Transaction succeeds and status is recorded correctly |
| PAY-002 | Invalid payment details | Transaction is rejected with useful feedback |
| PAY-003 | Missing mandatory field | Validation prevents submission |
| PAY-004 | Double-click submit | Duplicate transaction is prevented |
| PAY-005 | Service/network interruption | User receives safe error handling |
| PAY-006 | Transaction status refresh | Latest valid status is displayed |
| PAY-007 | Refund request | Refund follows configured business rules |
| PAY-008 | Unauthorized access | Protected transaction data is not exposed |
