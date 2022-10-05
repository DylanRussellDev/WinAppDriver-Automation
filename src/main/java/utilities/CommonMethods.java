package utilities;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

import static org.testng.Assert.fail;

public class CommonMethods {

    private static final ReadConfigFile readFile = new ReadConfigFile();

    public static void setAppPath(String appName) {
        switch (appName) {
            case "Notepad":
 //               capabilities.setCapability(“app”, “C:\\Windows\\System32\\notepad.exe”);
                break;
        } // end switch
    }

    public static void click(WindowsDriver driver, By element, String str) {
        int i = 0;
        while (i < 5) {

            try {
                driver.findElement(element).click();
                break;
            } catch (Exception e) {
                fail("Could not click on element: " + str);
            } // end try catch

            i++;
        } // end while

    } // end click

    public static void screenshot() throws IOException {
        final byte[] screenshot = ((TakesScreenshot) Hooks.driver).getScreenshotAs(OutputType.BYTES);
        Hooks.scenario.attach(screenshot, "image/png", "Screenshot");
    }
}
