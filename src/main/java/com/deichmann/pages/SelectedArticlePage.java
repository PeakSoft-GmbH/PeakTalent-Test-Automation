package com.deichmann.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectedArticlePage {


    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(css = ".open-size-selector > summary:nth-child(1)")
    private WebElement openSizeSelector;

    @FindBy(css = ".size-system > li:nth-child(2)")
    private WebElement sizeSystem;

    @FindBy(css = "li.active-element:nth-child(9) > span:nth-child(1)")
    private WebElement size;

    @FindBy(css = "section.actions:nth-child(3) > div:nth-child(1) > form:nth-child(1) > button:nth-child(3)")
    private WebElement addToWarenkorb;

    @FindBy(css = "div.m-modal:nth-child(17) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > m-button:nth-child(2) > button:nth-child(1)")
    private WebElement jetztSicherZurKasse;


    public SelectedArticlePage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void selectOpenSizeSelector()
    {
        this.wait.until(ExpectedConditions.visibilityOf(this.openSizeSelector));
        this.openSizeSelector.click();
    }

    public void selectSizeSystem()
    {
        this.wait.until(ExpectedConditions.visibilityOf(this.sizeSystem));
        this.sizeSystem.click();
    }

    public void selectSize()
    {
       // this.wait.until(ExpectedConditions.visibilityOf(this.size));
        this.size.click();
    }

    public void selectaddToWarenkorb()
    {
        this.wait.until(ExpectedConditions.visibilityOf(this.addToWarenkorb));
        this.addToWarenkorb.click();
    }



}
