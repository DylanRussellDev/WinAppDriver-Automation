package utilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Hooks {

    public static Scenario scenario;
    public static WindowsDriver driver;

    public static WindowsDriver notepadSession() {
        return driver;
    }

    @Before
    public void start(Scenario scenObj) throws MalformedURLException {
        scenario = scenObj;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
        capabilities.setCapability("deviceName", "Windows10");
        driver = new WindowsDriver(new URL("http://127.0.0.1:4724"), capabilities);
    } // end setup

    @After
    public void afterScenario() {
        if (scenario.isFailed()) {
            scenario.log("Test Failed");
        } // end if
        driver.quit();
    } // end afterScenario

}