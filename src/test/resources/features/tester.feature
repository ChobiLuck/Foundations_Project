Feature: Tester should be able to see their homepage and tools

        Scenario: As a tester I want work on the defects
        
            Given   is on the tester page and see the assigned defect
            When    the user can select a assigned defect
            When    the user can click on the Accept button
            When    the status is now viewable after the defect was accepted
            When    the user can now select one of the action options
            When    the user click the Update button
            Then    the defect should be accepted and updated