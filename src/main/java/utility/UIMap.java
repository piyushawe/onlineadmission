package utility;

import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class UIMap extends GenericClass{

    public UIMap() throws IOException {
        page = this.getClass().getSimpleName();
        file = gm.getFilePath(page);
    }

    public WebElement getMonthPicker() throws IOException {
        return readFile.getElement("monthpicker");
    }

    public WebElement getYearPicker() throws IOException {
        return readFile.getElement("yearpicker");
    }

    public WebElement getDayPicker() throws IOException {
        return readFile.getElement("daypicker");
    }

    public List<WebElement> getCell() throws IOException {
        return readFile.getElements("cell");
    }
}
