package com.automation.poms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Tester {
    private WebDriver driver;

    public Tester(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Select a DEFECT
    public void selectTester() {
        Select testerSelection = new Select(driver.findElement(By.id("defectId")));
        String defectIdOption = "80425";
        testerSelection.selectByValue(80425);
    }

    // click Accept
    @FindBy(id = "accept") // @FindBy(xpath = ""
    public WebElement acceptDefect;

    public void acceptDefect() {

        this.acceptDefect.click();
    }

    // wait for status table to "unhidden"
    public void statusUnhidden() {
        TimeUnit.SECONDS.sleep(3);

    }

    @FindBy(id = "fixed")
    public WebElement selectFixed;

    // sekects the option "fixed" in the Status selection
    // public void selectTester(){
    // Select statusSelect = new Select(driver.findElement(By.id("fixed")));
    // String statusOption = "Fixed";
    // statusSelect.selectByValue(statusOption);

    }
    // click the update button
    @FindBy(id = "submit")  // @FindBy(xpath = ""
    public WebElement updateDefect;

    public void updateDefect() {

        this.updateDefect.click();

        // defect is now updated in api [success]

}
