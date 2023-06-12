package TestPackage;

import Pages.BlazeDemo;
import Pages.Etsy;
import Utilities.ApplicationFlow;
import Utilities.Config;
import Utilities.Driver;
import com.github.javafaker.App;
import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class TesBlaze2 {
    BlazeDemo blazeDemo = new BlazeDemo();
    Etsy etsy = new Etsy();
    Faker faker = new Faker();


    @Test
    public void Test1(){
        Driver.getDriver().get(Config.getValue("blazeDemo"));
        Select select = new Select(blazeDemo.select1);
        select.selectByValue("Boston");
        Select select1 = new Select(blazeDemo.select2);
        select1.selectByValue("Rome");
        blazeDemo.button.click();
        blazeDemo.lufthusaChooseButton.click();
        blazeDemo.inputName.sendKeys(faker.lordOfTheRings().character());
        blazeDemo.zipCode.sendKeys(faker.address().zipCode());
        blazeDemo.creditCardYear.sendKeys("11");
        blazeDemo.nameOnCard.sendKeys(faker.harryPotter().character());
        blazeDemo.inputState.sendKeys(faker.address().state());
        blazeDemo.cardNumber.sendKeys(faker.finance().creditCard());
        blazeDemo.creditCardYear.sendKeys("2020");
        blazeDemo.inputCity.sendKeys(faker.address().city());
        blazeDemo.inputAddress.sendKeys(faker.address().fullAddress());
        blazeDemo.rememberMeCheckBox.click();
        blazeDemo.buyTicketButton.click();
        String expectedText = blazeDemo.thankYouText.getText();
        Assert.assertEquals(expectedText, blazeDemo.thankYouText.getText());
        ApplicationFlow.pause(1000);
    }

    @Test
    public void etsyTest(){
        Driver.getDriver().get(Config.getValue("etsy"));
        String url = Driver.getDriver().getCurrentUrl();
        etsy.searchInput.sendKeys("shyrdak" + Keys.ENTER);
        Assert.assertNotEquals(url, Driver.getDriver().getCurrentUrl());
    }
}
