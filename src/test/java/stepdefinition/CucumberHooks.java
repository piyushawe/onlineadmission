package stepdefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

import static utility.AppDriver.driver;
import static utility.AppDriver.getCurrentDriver;

public class CucumberHooks {

    @Before
    public void launchBrowser() throws IOException {
        driver = getCurrentDriver();
    }

    @After
    public void afterScenario(Scenario scenario) throws IOException {
        //VerifyErrorUtility errorUtility = new VerifyErrorUtility();
        if (scenario.isFailed()) {
            //errorUtility.verifyPageError();
            //utility.takeScreenshot();
        }
    }

    @After
    public void closeBrowser() throws IOException {
        //driver.quit();
        driver = null;
    }
}
