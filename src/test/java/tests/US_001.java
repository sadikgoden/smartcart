package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US_001 {

        @Test
        public void US_001_TC_01() {

            //Ziyaretçi olarak "https://qa.smartcardlink.com/" adresine gidiniz
            Driver.getDriver().get(ConfigReader.getProperty("sAdminUrl"));
            //Sitenin ana sayfasının açıldığı doğrulanır

            String expectedUrl="https://qa.smartcardlink.com/";
            String actualUrl = Driver.getDriver().getCurrentUrl();
            Assert.assertEquals(actualUrl, expectedUrl, "Ana sayfa açılmadı.");
            Driver.closeDriver();
        }
    }

