package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SmartcardlinkPage {
    public  SmartcardlinkPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//body)[1]")
    public WebElement bodybolumu ;

    @FindBy(xpath = "(//a[normalize-space()='Get Started'])[1]")
    public  WebElement GetStartedButonu;

    @FindBy(xpath = "//h1[normalize-space()='Create an Account']")
    public  WebElement CreateanAccountYazısı ;
}
