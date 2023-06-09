package Utilities;

import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class ApplicationFlow {
    public static void pause(int milliseconds ){
        try {
            Thread.sleep(milliseconds);
        }
        catch (InterruptedException e ){
            System.out.println("interruption happened ");
        }
    }
    public static void scroll(int y ){
        Actions actions = new Actions(Driver.getDriver());
        actions.scrollByAmount(0, y ).perform();
    }

    public static void switchWindows(){
        String currantId = Driver.getDriver().getCurrentUrl();
        Set<String> handles = Driver.getDriver().getWindowHandles();
        for(String id : handles){
            if(!id.equals(currantId)){
                Driver.getDriver().switchTo().window(id);
                break;
            }
        }
    }
}
