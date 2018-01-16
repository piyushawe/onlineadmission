package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class AppDriver {

    public static WebDriver driver;
    private static ReadFile readFile = new ReadFile();
    private static File fileConfig = new File("configuration\\GenericConfig.properties");

    public AppDriver(){
        throw new IllegalStateException();
    }

    public static WebDriver getCurrentDriver() throws IOException {

        if (driver == null) {
            System.setProperty(readFile.readProperty(fileConfig, "chromedriver"), readFile.readProperty(fileConfig, "chromedriverpath"));
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public void getUrl(String url){
        driver.get(url);
    }
}