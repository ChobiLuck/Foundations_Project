package com.automation.poms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Manager {

    private WebDriver driver;

    @FindBy(id="description")
    WebElement descriptionInput;
    
    @FindBy(id="submit") // @FindBy(xpath = ""
    public WebElement confirmSubmit;

    public Manager(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Select a Tester
    public void selectTester() {
        Select testerSelection = new Select(driver.findElement(By.id("fullname")));
        String testerRatDog = "RatDog";
        testerSelection.selectByValue(testerRatDog);
    }

    // Select Date
    public void getDate() {

        WebElement dateBox = driver.findElement(By.xpath("//*[@id='date']"));
        dateBox.sendKeys("07082022");
    }

    // Create a Description
    public void createDescription(String description) {
        this.descriptionInput.sendKeys(description);
    }

    // Confirm and submit
    

    public void confirmSubmit() {

        this.confirmSubmit.click();
    }

// alert pop up and click ok
    public void alertYAY(){
        WebDriverWait waitAlert = new WebDriverWait(driver,10);
            waitAlert.until(ExpectedConditions.alertIsPresent());
        Alert alertAlert = driver.switchTo().alert();
            alertAlert.accept();
}

}
