package com.deichmann.tests;

import com.deichmann.pages.HerrenArticlePage;
import com.deichmann.pages.LoginPage;
import com.deichmann.pages.SelectedArticlePage;
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
    public void herrenArtikelPageTest() throws InterruptedException {
        HerrenArticlePage herrenArticlePage = new HerrenArticlePage(driver);
        Thread.sleep(2000);

        herrenArticlePage.selectArtikel();
    }

    @Test(dependsOnMethods = "herrenArtikelPageTest")
    public void selectedArticlePageTest() throws InterruptedException {
        SelectedArticlePage selectedArticlePage = new SelectedArticlePage(driver);
        Thread.sleep(2000);

        selectedArticlePage.selectOpenSizeSelector();
//        selectedArticlePage.selectSizeSystem();
        selectedArticlePage.selectSize();
        selectedArticlePage.selectaddToWarenkorb();
    }



}
