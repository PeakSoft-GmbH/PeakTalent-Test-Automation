package com.peaksoft.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TalentsPage {

    private WebDriver driver;
    private WebDriverWait wait;


    @FindBy(id = "add-talent-btn")
    private WebElement neuTalentHinzufuegen;





    public TalentsPage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void addNeuTalent()
    {
        this.wait.until(ExpectedConditions.visibilityOf(this.neuTalentHinzufuegen));
        this.neuTalentHinzufuegen.click();
    }





}
