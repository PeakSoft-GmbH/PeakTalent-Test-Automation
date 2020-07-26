package com.deichmann.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HerrenArtikelPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(css = "article.m-product-card-entry:nth-child(1) > a:nth-child(1))")
    private WebElement artikel;

    public HerrenArtikelPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void selectArtikel()
    {
        this.wait.until(ExpectedConditions.visibilityOf(this.artikel));
        this.artikel.click();
    }

}
