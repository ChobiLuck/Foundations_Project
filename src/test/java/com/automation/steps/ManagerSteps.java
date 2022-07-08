package com.automation.steps;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.automation.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagerSteps {

    /*
        User agnostic steps below
     */
    @Given("the user is on the manager home page")
    public void the_user_is_on_the_manager_home_page() {
        // Write code here that turns the phrase above into concrete actions
        TestRunner.driver.get("File://C:/Users/mimil/Desktop/220531-JWA-main/Automation/bugcatcherautomation/src/test/resources/web-pages/managerP.html");
    }

    @When("the user selects a tester")
    public void the_user_selects_a_tester() {
       Select dropdown = new Select(TestRunner.driver.findElement(By.id("fullname")));
       dropdown.selectByValue("RatDog");
    }

    @When("the user selects a date")
    public void the_user_selects_a_date() {
        // here we are only capturing current date, which you can use for your automated scripts

        // driver here is undefined
        WebElement dateBox = TestRunner.driver.findElement(By.xpath("//*[@id='date']"));
        dateBox.sendKeys("07082022");    
    }

    @When("the user enter in the Defect in the description")
    public void the_user_enter_in_the_Defect_in_the_description() {
        // Write code here that turns the phrase above into concrete actions
        // WebElement description = TestRunner.driver.findElement(By.xpath("//*[@id='description']"));
        // description.sendKeys("There are too many lasers on the toy. Not Doggo Friendly.");
        TestRunner.manager.createDescription("There are too many lasers on the toy. Not Doggo Friendly.");
    }

    @When("the user click the submit button to create the defect")
    public void the_user_click_the_submit_button_to_create_the_defect() {
        // Write code here that turns the phrase above into concrete actions
         TestRunner.manager.confirmSubmit();
    }
    
    @Then("the defect is assigned and a alert pop up will confirm the assignment")
    public void the_defect_is_assigned_and_a_alert_pop_up_will_confirm_the_assignment() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = TestRunner.driver.switchTo().alert();
        Assert.assertEquals("The defect has been assigned to Rat Dog", alert.getText());
       alert.accept();
    }
}
