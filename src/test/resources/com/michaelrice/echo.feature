#noinspection CucumberUndefinedStep
Feature: Echoing
    The solution should act like a talking parrot.

    Scenario: Echo a string
        Given I have a string such as "michael"
         When I check the string
         Then the string should be "michael"

    Scenario: Echo integers
        Given I have an integer 10
         When I check the integer
         Then the integer should be 10
