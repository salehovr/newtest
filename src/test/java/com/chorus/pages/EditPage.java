package com.chorus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditPage extends BasePage{

    public static final By PAGE_NAME = By.xpath("//input[@placeholder=\"Untitled Page\"]");
    public static final By PAGE_CONTENT = By.xpath("//div[contains(@class, 'ProseMirror')]");
    public static final By PAGE_BOLD_BTN = By.xpath("//span[@aria-label=\"Bold\"]");
    public static final By PAGE_ITALIC_BTN = By.xpath("//span[@aria-label=\"Italic\"]");
    public static final By PAGE_UNDERLINE_BTN = By.xpath("//span[@aria-label=\"Underline\"]");
    public static final By PAGE_STRIKETHROUGH_BTN = By.xpath("//span[@aria-label=\"Strikethrough\"]");
    public static final By PAGE_PUBLISH_BTN = By.xpath("//span[text()='Publish Page']");

    @FindBy(xpath = "//div[@class='sc-19c3eel-0 gkxHKz']")
    public WebElement contentArea;

    @FindBy(xpath= "//div[contains(@class, 'ProseMirror')]")
    public WebElement someTextInContentArea;

    @FindBy(xpath= "//span[text()='Body Text']")
    public WebElement textStylesMenu;
}
