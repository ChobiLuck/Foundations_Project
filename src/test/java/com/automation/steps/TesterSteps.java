package com.automation.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterSteps {
    @Given("is on the tester page and see the assigned defect")
    public void is_on_the_tester_page_and_see_the_assigned_defect() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.driver.get("File://C:/Users/mimil/Desktop/220531-JWA-main/Automation/bugcatcherautomation/src/test/resources/web-pages/TesterP.html");
    }

    @When("the user can select a assigned defect")
    public void the_user_can_select_a_assigned_defect() {
        // Write code here that turns the phrase above into concrete actions
        Select dropdown = new Select(TestRunner.driver.findElement(By.id("defectId")));
        dropdown.selectByValue(80425);
    }

    @When("the user can click on the Accept button")
    public void the_user_can_click_on_the_Accept_button() {
        TestRunner.driver.clickButton("Accept");
    }

    @When("the status is now viewable after the defect was accepted")
    public void the_status_is_now_viewable_after_the_defect_was_accepted() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.wait.until(ExpectedConditions.hiddenStatus("theStatus"));
    }

    @When("the user can now select one of the action options")
    public void the_user_can_now_select_one_of_the_action_options() {
        // Write code here that turns the phrase above into concrete actions
        Select dropdown = new Select(TestRunner.driver.getElementById("theStatus1"));
        dropdown.selectByVisibleText(text:"fixed");
    }

    @When("the user click the Update button")
    public void the_user_click_the_Update_button() {
        
        // Write code here that turns the phrase above into concrete actions
        TestRunner.submit.clickButton();
    }

    @Then("the defect should be accepted and updated")
    public void the_defect_should_be_accepted_and_updated() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
