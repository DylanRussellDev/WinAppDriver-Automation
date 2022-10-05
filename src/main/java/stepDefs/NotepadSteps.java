package stepDefs;

import elements.NotepadElements;
import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.CommonMethods;
import utilities.Hooks;

import java.io.IOException;

public class NotepadSteps {

    private static WindowsDriver driver;
    private static Scenario scenario;

    public NotepadSteps() {
        driver = Hooks.notepadSession();
        scenario = Hooks.scenario;
    }

    @Given("the Notepad app is opened in Windows")
    public void the_notepad_app_is_opened_in_windows() throws IOException {
        CommonMethods.screenshot();
    }

    @When("the Help menu item is opened")
    public void the_help_menu_item_is_opened() {
        CommonMethods.click(driver, NotepadElements.btnHelp, "Help button");
    }

    @Then("click About Notepad")
    public void click_about_notepad() throws IOException {
        CommonMethods.click(driver, NotepadElements.btnAboutNotepad, "About Notepad button");
        CommonMethods.screenshot();
    }

    @Then("click the OK button")
    public void click_the_ok_button() {
        CommonMethods.click(driver, NotepadElements.btnOK, "OK button");
    }

}
