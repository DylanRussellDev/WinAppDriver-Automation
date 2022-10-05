package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {

    public Properties properties;
    BufferedReader reader;

    // try to read the Automation.properties file
    public ReadConfigFile() {
        try {
            String FILEPATH = "./src/test/java/configs/Automation.properties";
            reader = new BufferedReader(new FileReader(FILEPATH));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            } // end inner try catch
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Properties file could not be found");
        } // end outer try catch
    } // end constructor
} // end class