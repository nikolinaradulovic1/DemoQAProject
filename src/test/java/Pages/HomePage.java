package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class HomePage {
    WebDriver driver;
    WebDriverWait wdwait;

    WebElement elements;
    WebElement forms;
    WebElement alertsFrameWindows;
    WebElement widgets;
    WebElement interactions;
    WebElement bookStoreApplication;
    List<WebElement> lista;

    public HomePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> getLista() {

        return driver.findElements(By.xpath("//div[@class='card-body']//h5"));
    }

    public WebElement getElements() {

        WebElement element = null;
        for (int i = 0; i < getLista().size(); i++) {
            if (getLista().get(i).getText().equals("Elements")) {
                element = getLista().get(i);
                break;

            }
        }
        return element;
    }

    public WebElement getForms() {
        WebElement element = null;
        for (int i = 0; i < getLista().size(); i++) {
            if (getLista().get(i).getText().equals("Forms")) {
                element = getLista().get(i);
                break;

            }
        }
        return element;

    }

    public WebElement getAlertsFrameWindows() {
        WebElement element = null;
        for (int i = 0; i < getLista().size(); i++) {
            if (getLista().get(i).getText().equals("Alerts, Frame & Windows")) {
                element = getLista().get(i);
                break;

            }
        }
        return element;
    }

    public WebElement getWidgets() {
        WebElement element = null;
        for (int i = 0; i < getLista().size(); i++) {
            if (getLista().get(i).getText().equals("Widgets")) {
                element = getLista().get(i);
                break;

            }
        }
        return element;
    }

    public WebElement getInteractions() {
        WebElement element = null;
        for (int i = 0; i < getLista().size(); i++) {
            if (getLista().get(i).getText().equals("Interactions")) {
                element = getLista().get(i);
                break;

            }
        }
        return element;
    }

    public WebElement getBookStoreApplication() {
        WebElement element = null;
        for (int i = 0; i < getLista().size(); i++) {
            if (getLista().get(i).getText().equals("Book Store Application")) {
                element = getLista().get(i);
                break;

            }
        }
        return element;
    }

    public void clickOnElements() {
        getElements().click();
    }

    public void clickOnForms() {
        getForms().click();
    }

    public void clickOnAlerts() {
        getAlertsFrameWindows().click();
    }

    public void clickOnWidget() {
        getWidgets().click();
    }

    public void clickOnInteractions() {
        getInteractions().click();
    }

    public void clickOnBookStore() {
        getBookStoreApplication().click();
    }
}