@calculator
Feature: Calculator
  As a user
  I want to use a calculator to add numbers
  So that I don't need to add myself


  Scenario: Adding 1 + 2
    Given I have a calculator
    When I add 1 and 2
    Then the result should be 3



@add
  Scenario Outline: Add two numbers <num1> & <num2>
    Given I have a calculator
    When I add <num1> and <num2>
    Then the result should be <total>

    Examples:
      | num1 | num2 | total |
      | -2   |  3   |   1   |
      | 10   |  15  |   25  |
      | 99   |  -99 |   0   |
      | -1   |  -10 |   -11 |
      |  5   |   5  |   10  |

@subtract
    Scenario Outline: Be able to subtract numbers
      Given I have a calculator
      When I subtract <num2> from <num1>
      Then the result should be <total>

      Examples:
      | num1 | num2 | total |
      | 5    | 2    | 3     |
      |-10   | -2   | -8    |
      | 5    | 2    | 3     |