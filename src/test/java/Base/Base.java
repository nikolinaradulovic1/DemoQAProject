package Base;

import Pages.Elements.*;
import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class Base {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public HomePage homePage;
    public TextBox textBox;
    public CheckBox checkBox;
    public RadioButton radioButton;
    public WebTables webTables;
   public Buttons buttons;
   public Links links;

    @BeforeClass
    public void setUp() throws IOException {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        homePage= new HomePage(driver,wdwait);
        textBox=new TextBox(driver,wdwait);
        checkBox=new CheckBox(driver,wdwait);
        radioButton = new RadioButton(driver,wdwait);
        webTables=new WebTables(driver,wdwait);
        buttons= new Buttons(driver,wdwait);
        links= new Links(driver,wdwait);


    }
    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @AfterClass
    public void tearDown() {

      //  driver.close();
      //  driver.quit();
    }
}