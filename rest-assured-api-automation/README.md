# REST Assured API Automation

A demonstration API automation framework using **Java + Rest Assured + TestNG + Maven**.

## What this demonstrates

- REST API validation
- GET/POST/PUT/DELETE patterns
- Request/response validation
- Status code validation
- JSON field assertions
- Authentication-ready structure
- Negative testing
- Reusable request specification
- Maven execution

## Structure

```text
src/test/java/
├── tests/
├── requests/
├── utilities/
└── assertions/

src/test/resources/
└── testdata/
```

## Example coverage

- Valid GET request
- Resource not found
- Valid POST request
- Missing required field
- Invalid authentication
- Response contract validation
- Response time check

## Run

```bash
mvn clean test
```

> This repository uses public/demo endpoints only. Replace configuration values with environment variables for real systems.
