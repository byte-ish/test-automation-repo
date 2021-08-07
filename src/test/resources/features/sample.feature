@learn
Feature: This is a sample feature

  Scenario: Verify this maps to a step def file
    Given the will to learn
    When we pass a value 23

  @sanity
  Scenario Outline: Verify we are able to pass multiple data set
    Given a set of data with <name> and <age>
    Examples:
      | name | age |
      | Ish  | 29  |
      | Jack | 29  |
