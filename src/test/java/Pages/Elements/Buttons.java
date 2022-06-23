package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buttons {
    WebDriver driver;
    WebDriverWait wdwait;

    WebElement doubleClickMe;
    WebElement rightClickMe;
    WebElement clickMe;
   WebElement button1;
   WebElement messageDoubleClick;
   WebElement messageRightClick;
   WebElement messageClick;

    public Buttons(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }



    public WebElement getButton1() {
        return driver.findElement(By.id("item-4"));
    }
public void clickOnButtons(){
        getButton1().click();
}

    public WebElement getDoubleClick() {
        return driver.findElement(By.id("doubleClickBtn"));
    }

    public WebElement getRightClick() {
        return driver.findElement(By.id("rightClickBtn"));
    }

    public WebElement getClickMe() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
    }

    public WebElement getMessageDoubleClick() {
        return driver.findElement(By.id("doubleClickMessage"));
    }

    public WebElement getMessageRightClick() {
        return driver.findElement(By.id("rightClickMessage"));
    }

    public WebElement getMessageClick() {
        return driver.findElement(By.id("dynamicClickMessage"));
    }

    public void doubleClickButton(){
    Actions actions = new Actions(driver);
        actions.doubleClick(getDoubleClick()).perform();
}

public void rightClickButton(){
    Actions actions = new Actions(driver);
    actions.contextClick(getRightClick()).perform();
}
public void clickOnButtonClickMe(){
        getClickMe().click();

}
}
