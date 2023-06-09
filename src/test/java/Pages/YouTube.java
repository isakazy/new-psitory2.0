package Pages;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YouTube {
    public YouTube(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath ="//input[1]" )
    public WebElement search;

}
