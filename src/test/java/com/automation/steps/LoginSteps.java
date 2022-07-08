package com.automation.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    /*
        User agnostic steps below
     */

    @Given("the employee is on the login page")
    public void the_employee_is_on_the_login_page() {
        // when telling selenium to get a local file you have to add File:// to the start of the url
        TestRunner.driver.get("File://C:/Users/mimil/Desktop/220531-JWA-main/Automation/bugcatcherautomation/src/test/resources/web-pages/MainLP.html");
    }

    /*
        Manager steps below
     */

    @When("the manager enters their correct username")
    public void the_manager_enters_their_correct_username() {
        TestRunner.login.enterUsername("BIGRatDog");
    }

    @When("the manager enters their correct password")
    public void the_manager_enters_their_correct_password() {
        TestRunner.login.enterPassword("password");
    }

    @When("the employee clicks the login button")
    public void the_employee_clicks_the_login_button() {
        TestRunner.login.clickButton();
    }

    // THIS will take the manager to the MANAGER home page
    @Then("the manager should be logged in to the manager home page")
    public void the_manager_should_be_logged_in_to_the_manager_home_page() {
        // this method checks that my simulated manager has actually ended up on the manager page
        TestRunner.wait.until(ExpectedConditions.titleIs("Manager Home Page"));
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Manager Home Page", title);
    }

    /*
        Tester steps below
     */
    
    @When("the tester enters their correct username")
    public void the_tester_enters_their_correct_username() {
        TestRunner.login.enterUsername("RatDog");
    }

    @When("the tester enters their correct password")
    public void the_tester_enters_their_correct_password() {
        TestRunner.login.enterPassword("password");
    }

    @When("the tester clicks the login button")
    public void the_tester_clicks_the_login_button() {
        TestRunner.login.clickButton();
    }
    
    @Then("the tester should be logged in to the tester home page")
    public void the_tester_should_be_logged_in_to_the_tester_home_page() {
        TestRunner.wait.until(ExpectedConditions.titleIs("Tester Home Page"));
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Tester Home Page", title);
    }
    



    
}
