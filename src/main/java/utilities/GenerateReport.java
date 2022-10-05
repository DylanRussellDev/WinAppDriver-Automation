package utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenerateReport {
    public static void GenerateTestNGReport() {

        try {
            // The folder to output the reports to. If the folder does not exist, it will be created.
            File outDirectory = new File("target/~REPORTS");
            List<String> list = new ArrayList<String>();

            // Add formatting
            list.add("target/cucumber-reports/cucumber.json");
            Configuration config = new Configuration(outDirectory, "Tests");
            ReportBuilder repBuild = new ReportBuilder(list, config);

            // Generate the report
            repBuild.generateReports();
        } catch (Exception e) {
            System.out.println("There was a problem generating the report.");
            System.out.println("Error Message: " + e.getMessage());
        } // end try/catch block

    } // end GenerateTestNGReport()
} // end GenerateReport