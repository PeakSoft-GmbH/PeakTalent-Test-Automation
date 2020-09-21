package com.peaksoft.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;


    @FindBy(id = "inputEmailAddress")
    private WebElement usernameTxt;

    @FindBy(id = "inputPassword")
    private WebElement passowrdTxt;

    @FindBy(id = "login-btn")
    private WebElement loginButton;


    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void goTo(String url)
    {
        driver.get(url);
        this.wait.until(ExpectedConditions.visibilityOf(this.usernameTxt));
        driver.manage().window().maximize();
    }

    public void enterCredentials(String username, String password)
    {
        this.usernameTxt.sendKeys(username);
        this.passowrdTxt.sendKeys(password);
    }

    public void submit()
    {
        this.loginButton.click();
    }

}
