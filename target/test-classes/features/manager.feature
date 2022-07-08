Feature: Manager should be able to view the homepage and their tools

    Scenario: As a manager I want to create a new defect

        Given   the user is on the manager home page
        When    the user selects a tester
        When    the user selects a date
        When    the user enter in the Defect in the description
        When    the user click the submit button to create the defect
        Then    the defect is assigned and a alert pop up will confirm the assignment