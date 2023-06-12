package TestPackage;

import Pages.BlazeDemo;
import Utilities.ApplicationFlow;
import Utilities.Config;
import Utilities.Driver;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.Select;

public class TestBlazeDemo {
    BlazeDemo blazeDemo = new BlazeDemo();
    Faker faker = new Faker();

    @Test
    public void testBlaze(){
       Driver.getDriver().get(Config.getValue("blazeDemo"));


        Select select = new Select(blazeDemo.select1);
        select.selectByValue("Boston");
        Select select1 = new Select(blazeDemo.select2);
        select1.selectByValue("Berlin");
        String oldUrl = Driver.getDriver().getCurrentUrl();
        blazeDemo.button.click();
        Assert.assertNotEquals(oldUrl, Driver.getDriver().getCurrentUrl());
        String url2 = Driver.getDriver().getCurrentUrl();
        blazeDemo.lufthusaChooseButton.click();
        Assert.assertNotEquals(url2, Driver.getDriver().getCurrentUrl());
        blazeDemo.inputName.sendKeys(faker.harryPotter().character());
        blazeDemo.inputAddress.sendKeys(faker.address().fullAddress());
        blazeDemo.inputCity.sendKeys(faker.address().city());
        blazeDemo.inputState.sendKeys(faker.address().state());
        blazeDemo.zipCode.sendKeys(faker.address().zipCode());
        Select select2 = new Select(blazeDemo.selectCardType);
        ApplicationFlow.scroll(1000);
        select2.selectByValue("amex");
        blazeDemo.cardNumber.sendKeys(faker.finance().creditCard());
        blazeDemo.creditCardMonth.sendKeys("12");
        blazeDemo.creditCardYear.sendKeys("2020");
        blazeDemo.nameOnCard.sendKeys(faker.lordOfTheRings().character());
        blazeDemo.rememberMeCheckBox.click();
        blazeDemo.buyTicketButton.click();
        String expectedText = "Thank you for your purchase today!";
        Assert.assertEquals(blazeDemo.thankYouText.getText(), expectedText);

    }
}
