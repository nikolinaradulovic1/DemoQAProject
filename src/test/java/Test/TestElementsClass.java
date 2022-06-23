package Test;

import Base.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestElementsClass extends Base {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
        scrollIntoView(homePage.getElements());
        homePage.clickOnElements();
    }

    @Test
    public void textBoxWithValidInputs() throws InterruptedException {
        textBox.clickOnTextbox();
        textBox.enterName("Nikolina");
        textBox.enterEmail("nikolina728@gmail.com");
        textBox.enterCurrentAddress("Belgrade");
        textBox.enterPermanentAddress("Belgrade");
        Thread.sleep(1000);
        textBox.clickOnSubmit();
    }

    @Test
    public void CheckBox() {
        checkBox.clickOnCheckBox();
        checkBox.checkHome();
        Assert.assertTrue(checkBox.getMessage().isDisplayed());
    }

    @Test
    public void UncheckedBox() throws InterruptedException {
        checkBox.clickOnCheckBox();
        checkBox.checkHome();
        Thread.sleep(1000);
        checkBox.uncheckHome();

        Assert.assertTrue(checkBox.getCheckBox().isDisplayed());

    }

    @Test
    public void OpenSubelementsofHome() {
        checkBox.clickOnCheckBox();
        checkBox.openSubelements();
        Assert.assertTrue(checkBox.getDesktop().isDisplayed());

    }

    @Test
    public void RadioButton() {

        radioButton.getRadioButton().click();
        radioButton.clickOnYes();
        Assert.assertTrue(radioButton.getRadioMessage().isDisplayed());
    }

    @Test
    public void RadioButtonImpressive() {

        radioButton.getRadioButton().click();
        radioButton.clickOnImpressive();

        Assert.assertTrue(radioButton.getRadioMessage().isDisplayed());
    }
    @Test
    public void searchTable(){
        webTables.clickOnWebTables();
        webTables.searchTable("Cierra");
        Assert.assertTrue(webTables.getCierra().isDisplayed());
        Assert.assertEquals(webTables.getCierra().getText(),"Cierra");

    }
    @Test
    public void VerifyUserCanBeAddedToTable(){
        webTables.clickOnWebTables();
        webTables.clickOnAddButton();
        webTables.enterName("Nikolina");
        webTables.enterLastName("Radulovic");
        webTables.enterEmail("nikolina@gmail.com");
        webTables.enterAge("19");
        webTables.enterSalary("5000");
        webTables.enterDepartment("IT");
        webTables.clickOnSubmit();
    }

    String firstNameExample= "Cierra";
    String ageExample= "25";
@Test
    public void VerifyUserCanBeEdited(){
    webTables.clickOnWebTables();
    webTables.getEditButton(firstNameExample).click();
    webTables.getAge().clear();
    webTables.editUserAge(ageExample);
    webTables.clickOnSubmit();

Assert.assertEquals(webTables.getAgeInTable(firstNameExample).getText(),ageExample);

}
@Test
    public void VerifyUserCanBeDeleted() throws InterruptedException {
    webTables.clickOnWebTables();
    webTables.getDelete(firstNameExample).click();
    boolean check= false;
    Thread.sleep(1000);
    try {
        check=webTables.getCierra().isDisplayed();
    }
    catch (Exception e){}
  Assert.assertFalse(check);
}
@Test
    public void VerifyUserCanDoubleClickOnButton(){
    buttons.clickOnButtons();
    buttons.doubleClickButton();
    Assert.assertTrue(buttons.getMessageDoubleClick().isDisplayed());
    Assert.assertEquals(buttons.getMessageDoubleClick().getText(),"You have done a double click");
}

@Test
    public void VerifyUserCanRightClickOnButton(){
    buttons.clickOnButtons();
    buttons.rightClickButton();
    Assert.assertTrue(buttons.getMessageRightClick().isDisplayed());
    Assert.assertEquals(buttons.getMessageRightClick().getText(),"You have done a right click");

}

@Test
    public void VerifyUserCanClickOnButton() throws InterruptedException {
    buttons.clickOnButtons();

    buttons.clickOnButtonClickMe();

   Assert.assertTrue(buttons.getMessageClick().isDisplayed());
   Assert.assertEquals(buttons.getMessageClick().getText(),"You have done a dynamic click");

}
@Test
    public void VerifyUserCanOpenHomeWindow(){
    links.clickOnLink();
    links.clickOnHome();

}
@Test
    public void VerifyUserCanOpenHome4m9Hn(){
    links.clickOnLink();
    links.clickOnHome4m9Hn();
}

@Test
    public void VerifyUserCanClickOnCreatedLink(){
    links.clickOnLink();
    links.clickOnCreated();
    Assert.assertTrue(links.getMessage().isDisplayed());
    Assert.assertEquals(links.getMessage().getText(),"Link has responded with staus 201 and status text Created");
}
@Test
    public void VerifyUserCanClickOnNoContentLink(){
    links.clickOnLink();
    links.clickOnNoContent();
    Assert.assertTrue(links.getMessage().isDisplayed());
    Assert.assertEquals(links.getMessage().getText(),"Link has responded with staus 204 and status text No Content");

}
@Test
    public void VerifyUserCanClickOnMovedLink(){
    links.clickOnLink();
    links.clickOnMoved();
    Assert.assertTrue(links.getMessage().isDisplayed());
    Assert.assertEquals(links.getMessage().getText(),"Link has responded with staus 301 and status text Moved Permanently");


}
}
