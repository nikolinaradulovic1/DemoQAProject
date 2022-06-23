package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBox {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement textBox;
    WebElement name;
    WebElement email;
    WebElement currentAddress;
    WebElement permanentAddress;
    WebElement button;

    public TextBox(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getTextBox() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[1]/span"));
    }

    public WebElement getButton() {
        return driver.findElement(By.id("submit"));
    }

    public void clickOnTextbox() {
        getTextBox().click();
    }

    public void enterName(String fullname) {
        getName().sendKeys(fullname);
    }

    public void enterEmail(String userEmail) {
        getEmail().sendKeys(userEmail);
    }

    public void enterCurrentAddress(String userCurrentAddress) {
        getCurrentAddress().sendKeys(userCurrentAddress);
    }

    public void enterPermanentAddress(String userPermanentAddress) {
        getPermanentAddress().sendKeys(userPermanentAddress);
    }

    public void clickOnSubmit() {
        getButton().click();
    }
}
