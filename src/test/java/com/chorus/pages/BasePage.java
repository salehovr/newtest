package com.chorus.pages;

import com.chorus.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    WebDriver driver;

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
        this.driver = driver;
    }
}
