package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static utility.AppDriver.getCurrentDriver;
import static utility.GenericClass.file;

public class ReadFile {
    private Properties properties = new Properties();

    private FileInputStream readFile(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    public String readProperty(File file, String key) throws IOException {
        String value = null;
        if (file.exists()) {
            properties.load(readFile(file));
            value = properties.getProperty(key);
        }
        return value;
    }

    public WebElement getElement(String element) throws IOException {

        String locator = readProperty(file, element + "type");
        String value = readProperty(file, element);
        WebElement webelement = null;

        if (locator.equalsIgnoreCase("id"))
            webelement = getCurrentDriver().findElement(By.id(value));
        if (locator.equalsIgnoreCase("name"))
            webelement = getCurrentDriver().findElement(By.name(value));
        if (locator.equalsIgnoreCase("xpath"))
            webelement = getCurrentDriver().findElement(By.xpath(value));
        if (locator.equalsIgnoreCase("linktext"))
            webelement = getCurrentDriver().findElement(By.linkText(value));
        if (locator.equalsIgnoreCase("tagname"))
            webelement = getCurrentDriver().findElement(By.tagName(value));
        if (locator.equalsIgnoreCase("cssSelector"))
            webelement = getCurrentDriver().findElement(By.cssSelector(value));
        if (locator.equalsIgnoreCase("classname"))
            webelement = getCurrentDriver().findElement(By.className(value));

        return webelement;
    }

    public List<WebElement> getElements(String element) throws IOException {

        String locator = readProperty(file, element + "type");
        String value = readProperty(file, element);
        List<WebElement> webelement = null;

        if (locator.equals("id"))
            webelement = getCurrentDriver().findElements(By.id(value));
        if (locator.equals("name"))
            webelement = getCurrentDriver().findElements(By.name(value));
        if (locator.equals("xpath"))
            webelement = getCurrentDriver().findElements(By.xpath(value));
        if (locator.equalsIgnoreCase("linktext"))
            webelement = getCurrentDriver().findElements(By.linkText(value));
        if (locator.equalsIgnoreCase("tagname"))
            webelement = getCurrentDriver().findElements(By.tagName(value));
        if (locator.equalsIgnoreCase("cssSelector"))
            webelement = getCurrentDriver().findElements(By.cssSelector(value));
        if (locator.equalsIgnoreCase("classname"))
            webelement = getCurrentDriver().findElements(By.className(value));

        return webelement;
    }
}