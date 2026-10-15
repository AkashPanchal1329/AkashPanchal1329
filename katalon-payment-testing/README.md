# Payment System QA — Sanitized Case Study

## Overview

This repository demonstrates a sanitized QA approach for a payment-system style application. It is based on common payment workflow testing patterns and does **not** contain proprietary client code or real payment data.

## Testing Strategy

### Phase 1 — Manual QA
- Requirement analysis
- Functional testing
- Positive/negative payment scenarios
- Validation and error handling
- Regression testing

### Phase 2 — Automation
Automation was introduced for stable, repeatable workflows.

### Example Coverage

- Payment initiation
- Required-field validation
- Invalid payment details
- Successful transaction state
- Failed transaction state
- Duplicate submission
- Transaction status
- Refund/cancellation workflow
- Error messages
- Session/authentication behavior

## Tools

- Katalon Studio
- Appium
- API testing
- Azure DevOps
- Git

## QA Principle

Automate stable, high-value regression paths while keeping exploratory and usability testing manual.
