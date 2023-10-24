package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class loginPage {
    public loginPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
