package com.deichmann.tests;

import com.deichmann.pages.HerrenArtikelPage;
import com.deichmann.pages.LoginPage;
import com.tests.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BuyProcessTest extends BaseTest

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

        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "loginPageTest")
    public void herrenArtikelPage() throws InterruptedException {
        HerrenArtikelPage herrenArtikelPage = new HerrenArtikelPage(driver);
        Thread.sleep(2000);

        //herrenArtikelPage.selectArtikel();
    }



}
