@tag
Feature: Validate Karate API validation scenario.
  I would like to validate the API response.

  @tag1
  Scenario: Validate my details
    Given I want to request my existing data
    When If my requested data found
    Then return my data with valid response

    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
