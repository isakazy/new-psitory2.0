package Pages;

import Utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
    public AmazonHomePage(){
        PageFactory.initElements(Driver.getDriver(), this );
    }

}
