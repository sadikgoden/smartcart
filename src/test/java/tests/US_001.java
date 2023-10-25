package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US_001 {
    public class TC_01 {
        @Test
        public void US_001(){
            //Ziyaretçi olarak "https://qa.smartcardlink.com/" adresine gidiniz
            Driver.getDriver().get(ConfigReader.getProperty("sAdminUrl"));
            Driver.closeDriver();
        }

}
