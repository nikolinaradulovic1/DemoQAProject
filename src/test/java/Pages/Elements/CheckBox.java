package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {

    WebDriver driver;
    WebDriverWait wdwait;
    WebElement checkBox;
    WebElement homeCheckbox;
    WebElement message;
    WebElement unchecked;
    WebElement arrow;
    WebElement desktop;

    public CheckBox(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getCheckBox() {
        return driver.findElement(By.xpath("//*[contains(text(), 'Check Box')]"));
    }

    public WebElement getHomeCheckbox() {
        return driver.findElement(By.cssSelector(".rct-icon.rct-icon-uncheck"));
    }

    public WebElement getMessage() {
        return driver.findElement(By.id("result"));
    }

    public WebElement getUnchecked() {
        return driver.findElement(By.cssSelector(".rct-icon.rct-icon-check"));
    }

    public WebElement getArrow() {
        return driver.findElement(By.cssSelector(".rct-collapse.rct-collapse-btn"));
    }

    public WebElement getDesktop() {
        return driver.findElement(By.xpath("//span[@class='rct-title'][1]"));
    }

    public void clickOnCheckBox() {
        getCheckBox().click();
    }

    public void checkHome() {
        getHomeCheckbox().click();
    }

    public void uncheckHome() {
        getUnchecked().click();
    }

    public void openSubelements() {

        getArrow().click();
    }
}
