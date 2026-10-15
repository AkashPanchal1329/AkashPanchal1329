# Cucumber API Automation

BDD-style API automation using **Java, Cucumber, Rest Assured, TestNG and Maven**.

## Framework highlights

- Feature-driven test design
- Reusable step definitions
- Tags for selective execution
- API request/response validation
- Positive and negative scenarios
- Maven execution
- CI/CD-ready structure

## Example tags

```text
@smoke
@regression
@api
@negative
```

Run a tag:

```bash
mvn test -Dcucumber.filter.tags="@smoke"
```

## Example flow

```text
Feature
  ↓
Scenario
  ↓
Step Definition
  ↓
Rest Assured Request
  ↓
Response Validation
```

This is a demonstration framework and contains no proprietary client code.
