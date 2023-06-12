package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlazeDemo {
    public BlazeDemo(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//select[1]")
    public WebElement select1;

    @FindBy(xpath = "//select[2]")
     public WebElement select2;

    @FindBy(xpath = "//input")
    public WebElement button;

    @FindBy(xpath = "(//table/tbody/tr/td[1]/input)[5]")
    public WebElement lufthusaChooseButton;

    @FindBy(xpath = "//input[@id='inputName']")
    public WebElement inputName;

    @FindBy(xpath = "//input[@id='address']")
    public WebElement inputAddress;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement inputCity;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement inputState;

    @FindBy(xpath = "//input[@id='zipCode']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@id='creditCardNumber']")
    public WebElement cardNumber;

    @FindBy(xpath = "//input[@id='creditCardMonth']")
    public WebElement creditCardMonth;


    @FindBy(xpath = "//input[@id='creditCardYear']")
    public WebElement creditCardYear;

    @FindBy(xpath = "//input[@id='nameOnCard']")
    public WebElement nameOnCard;

    @FindBy(id = "rememberMe")
    public WebElement rememberMeCheckBox;

   @FindBy(xpath = "//input[@type='submit']")
   public WebElement buyTicketButton;

    @FindBy(xpath = "//select[@id='cardType']")
    public WebElement selectCardType;

    @FindBy(xpath = "//h1")
   public WebElement thankYouText;
}
