package runners;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IExecutionListener;
import utilities.GenerateReport;

public class TestNGListener implements IExecutionListener {

    public void onExecutionStart() {
        System.out.println("************ TEST EXECUTION STARTED ************\n");
    } // end onExecutionStart()

    public void onExecutionFinish() {
        System.out.println("GENERATING THE REPORT...\n");
        GenerateReport.GenerateTestNGReport();
        openTestReport();
        System.out.println("************ TEST EXECUTION FINISHED ************\n");
    } // end onExecutionFinish()

    // Open the report after execution finishes
    public static void openTestReport() {
        String strFile = System.getProperty("user.dir") + "\\target\\~REPORT\\cucumber-html-reports\\overview-features.html";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(strFile);
        driver.manage().window().maximize();
    } // end openTestReport

}
