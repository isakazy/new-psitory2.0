package TestPackage;

import Pages.FaceBook;
import Pages.YouTube;
import Utilities.ApplicationFlow;
import Utilities.Config;
import Utilities.Driver;
import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.Keys;

public class TestYouTube {
    YouTube youTube = new YouTube();
    FaceBook faceBook = new FaceBook();
    Faker faker = new Faker();

    @Test
    public void youtube(){
        Driver.getDriver().get(Config.getValue("youTube"));
        youTube.search.sendKeys(faker.backToTheFuture().character());
        ApplicationFlow.pause(1000);
        Driver.getDriver().get(Config.getValue("faceBook"));
        faceBook.inputId.sendKeys("isakazy");


    }
}
