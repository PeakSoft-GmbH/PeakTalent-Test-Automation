package com.deichmann.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutLoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(css = ".button")
    private WebElement alsGastFortfahren;

    public CheckOutLoginPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void selectAlsGastFortfahren()
    {
        this.wait.until(ExpectedConditions.visibilityOf(this.alsGastFortfahren));
        this.alsGastFortfahren.click();
    }


}
