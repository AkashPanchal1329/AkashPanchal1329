@api @smoke
Feature: User API

  Scenario: Get an existing user
    When I request user with id 1
    Then the response status should be 200
    And the response should contain user id 1
