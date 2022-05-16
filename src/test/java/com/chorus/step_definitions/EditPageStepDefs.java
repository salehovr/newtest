package com.chorus.step_definitions;

import com.chorus.pages.EditPage;
import com.chorus.utils.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class EditPageStepDefs {

    WebDriver driver;
    EditPage editPage = new EditPage();
    Actions actions = new Actions(driver);

    @Given("User is on page editor page")
    public void user_is_on_page_editor_page() {
        Assert.assertTrue(driver.getTitle().startsWith("Edit"));
    }

    @When("User adds random text")
    public void user_adds_random_text() {
        editPage.contentArea.click();
        editPage.contentArea.sendKeys("Connect the dots...");

        actions.moveToElement(editPage.someTextInContentArea, 10, 5)
                .clickAndHold()
                .moveByOffset(30, 0)
                .release()
                .perform();
    }

    @When("Selects body text as {string}")
    public void selects_body_text_as(String textStyle) {
        editPage.textStylesMenu.click();
    }

    @Then("User should see {string} as a result")
    public void user_should_see_as_a_result(String string) {

    }
}
