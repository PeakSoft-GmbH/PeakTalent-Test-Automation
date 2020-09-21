package com.peaksoft.tests;

import com.peaksoft.pages.*;
import com.peaksoft.pages.LoginPage;
import com.peaksoft.pages.TalentsPage;
import com.tests.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.lang.Thread;

public class FirstProcessTest extends BaseTest

{

    private String urlInput;
    private String usernameInput;
    private String passwordInput;

    @BeforeTest
    @Parameters({"urlInput", "usernameInput", "passwordInput"})
    public void setupParameters(String urlInput, String usernameInput, String passwordInput)
    {
        this.urlInput = urlInput;
        this.usernameInput = usernameInput;
        this.passwordInput = passwordInput;
    }

    @Test
    public void loginPageTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo(urlInput);

        Thread.sleep(2000);

        loginPage.enterCredentials(usernameInput, passwordInput);
        loginPage.submit();



    }

    @Test(dependsOnMethods = "loginPageTest")
    public void talentsPageTest() throws InterruptedException {
        TalentsPage talentsPage = new TalentsPage(driver);
        driver.navigate().refresh();

        talentsPage.addNeuTalent();

        Thread.sleep(5000);

    }






}
