package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Etsy {
    public Etsy(){
        PageFactory.initElements(Driver.getDriver(), this );
    }
    @FindBy(xpath = "//input")
    public WebElement searchInput;
}
