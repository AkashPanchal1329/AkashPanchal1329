# Azure DevOps QA CI/CD

Demonstration of integrating Maven-based QA automation into an Azure DevOps pipeline.

## Pipeline

```text
Checkout
  ↓
Install Java
  ↓
Maven Test
  ↓
Generate Results
  ↓
Publish Test Results
```

## Goals

- Run automated tests consistently
- Fail the pipeline when tests fail
- Preserve test evidence
- Support smoke/regression execution
- Keep secrets outside source control

The pipeline below is a template. Update paths and test commands for your actual framework.
