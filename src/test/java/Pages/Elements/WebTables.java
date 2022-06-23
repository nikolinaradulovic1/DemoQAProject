package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebTables {
    WebDriver driver;
    WebDriverWait wdwait;
   WebElement webTables;
   WebElement search;
   WebElement cierra;
   WebElement addButton;
   WebElement name;
   WebElement lastName;
   WebElement email;
   WebElement age;
   WebElement salary;
   WebElement department;
   WebElement submitButton;
   List<WebElement>lista;
   WebElement editButton;
   WebElement editAge;
WebElement ageInTable;
WebElement delete;
    public WebTables(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getWebTables() {
        return driver.findElement(By.xpath("//*[contains(text(), 'Web Tables')]"));
    }


    public WebElement getSearch() {
        return driver.findElement(By.id("searchBox"));
    }

    public WebElement getCierra() {
        return driver.findElement(By.className("//*[contains(text(), 'Cierra')]"));
    }

    public WebElement getAddButton() {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    public WebElement getName() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getAge() {
        return driver.findElement(By.id("age"));
    }

    public WebElement getSalary() {
        return driver.findElement(By.id("salary"));
    }

    public WebElement getDepartment() {
        return driver.findElement(By.id("department"));
    }

    public List<WebElement> getLista() {

        return driver.findElements(By.xpath("//div[@class='rt-td'][1]"));
    }

    public WebElement getAgeInTable(String firstName) {

String age2="//div[contains(text(), " + "'" + firstName +"')]/following-sibling::div[2]";
return driver.findElement(By.xpath(age2));

    }

    public WebElement getEditButton(String firstName) {

       String id= "edit-record-";
        for (int i = 0; i < getLista().size(); i++) {
            if (getLista().get(i).getText().equals(firstName)) {
               int indeks=i+1;
               id=id+indeks;
                break;

            }}
        return driver.findElement(By.id(id)) ;
    }
    public WebElement getDelete(String firstName){
        String id= "delete-record-";
        for (int i = 0; i < getLista().size(); i++) {
            if (getLista().get(i).getText().equals(firstName)) {
                int indeks=i+1;
                id=id+indeks;
                break;

            }}
        return driver.findElement(By.id(id)) ;
    }


    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getEditAge() {
        return driver.findElement(By.cssSelector(".col-md-2.col-sm-12"));
    }
    public void editUserAge(String age){
        getAge().sendKeys(age);
    }

    public void clickOnWebTables(){
        getWebTables().click();
    }
    public void searchTable(String input){
        getSearch().sendKeys(input);
    }
    public void clickOnAddButton(){
        getAddButton().click();
    }
    public void enterName(String userName){
        getName().sendKeys(userName);
    }
    public void enterLastName(String lastname){
        getLastName().sendKeys(lastname);
    }
    public void enterEmail(String email){
        getEmail().sendKeys(email);
    }
    public void enterAge(String age){
        getAge().sendKeys(age);
    }
    public void enterSalary(String salary){
        getSalary().sendKeys(salary);
    }
    public void enterDepartment(String department){
        getDepartment().sendKeys(department);
    }
    public void clickOnSubmit(){
        getSubmitButton().click();
    }
}