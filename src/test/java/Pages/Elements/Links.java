package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Links {
    WebDriver driver;
    WebDriverWait wdwait;
WebElement link;
    WebElement home;
    WebElement home4m9Hn;
    WebElement created;
    WebElement noContent;
    WebElement moved;
    WebElement badRequest;
    WebElement unauthorized;
    WebElement forbidden;
    WebElement notFound;
    WebElement message;

    public Links(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getLink() {
        return driver.findElement(By.id("item-5"));
    }

    public WebElement getHome() {
        return driver.findElement(By.id("simpleLink"));
    }

    public WebElement getHome4m9Hn() {
        return driver.findElement(By.id("dynamicLink"));
    }

    public WebElement getCreated() {
        return driver.findElement(By.id("created"));
    }

    public WebElement getNoContent() {
        return driver.findElement(By.id("no-content"));

    }

    public WebElement getMoved() {
        return driver.findElement(By.id("moved"));
    }

    public WebElement getBadRequest() {
        return driver.findElement(By.id("bad-request"));
    }

    public WebElement getUnauthorized() {
        return driver.findElement(By.id("unauthorized"));
    }

    public WebElement getForbidden() {
        return driver.findElement(By.id("forbidden"));
    }

    public WebElement getNotFound() {
        return driver.findElement(By.id("invalid-url"));
    }

    public WebElement getMessage() {
        return driver.findElement(By.id("linkResponse"));
    }

    public void clickOnLink(){
        getLink().click();}
    public void clickOnHome(){
        getHome().click();
    }
    public void clickOnHome4m9Hn(){
        getHome4m9Hn().click();
    }
    public void clickOnCreated(){getCreated().click();}
    public void clickOnNoContent(){getNoContent().click();}
    public void clickOnMoved(){getMoved().click();}
    public void clickOnBadRequest(){getBadRequest().click();}
    public void clickOnUnauthorized(){getUnauthorized().click();}
    public void clickOnForbidden(){getForbidden().click();}
    public void clickOnNotFound(){getNotFound().click();}
}


