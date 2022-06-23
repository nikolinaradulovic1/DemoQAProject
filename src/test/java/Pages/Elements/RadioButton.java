package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButton {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement radioButton;
    WebElement yes;
    WebElement impressive;
    WebElement radioMessage;

    public RadioButton(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getRadioButton() {
        return driver.findElement(By.xpath("//*[contains(text(), 'Radio Button')]"));
    }

    public WebElement getYes() {
        return driver.findElement(By.xpath("//label[@for='yesRadio']"));
    }

    public WebElement getImpressive() {
        return driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
    }

    public WebElement getRadioMessage() {
        return driver.findElement(By.className("text-success"));
    }

    public void clickOnYes() {
        getYes().click();
    }

    public void clickOnImpressive() {
        getImpressive().click();
    }
}
