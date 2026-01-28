package utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

    public WebDriver driver;
    Properties prop;

    public void launchBrowser() {

//        prop = PropertyReader.readProperty();

//        String browserName = prop.getProperty("browser");

//        if (browserName.equalsIgnoreCase("chrome")) {

            Map<String, Object> prefs = new HashMap<>();
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);

            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", prefs);
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-infobars");
            options.addArguments("--disable-extensions");
            options.addArguments("--incognito");   
            options.addArguments("--guest");       

            driver = new ChromeDriver(options);

//        } else if (browserName.equalsIgnoreCase("firefox")) {
//
//            driver = new FirefoxDriver();
//
//        } else if (browserName.equalsIgnoreCase("edge")) {
//
//            driver = new EdgeDriver();

//        } 	

        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
    }
}
