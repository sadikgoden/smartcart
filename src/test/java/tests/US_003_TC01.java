package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SmartcardlinkPage;
import utilities.ConfigReader;
import utilities.Driver;



public class US_003_TC01 {

    @Test
    public void US_003_TC_01(){
        // 1- Browser açılır
        // 2- adres çubuğuna URL girilir
        // 3- Enter tuşuna tıklanır
        Driver.getDriver().get(ConfigReader.getProperty("sAdminUrl"));

       // 4- Sitenin ana sayfasının açıldığı doğrulanır
        String expectedUrl="https://qa.smartcardlink.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Ana sayfa açılmadı.");

       // 5-Sayfanın body bölümünü tarayıcıda görüntüleyin.
        SmartcardlinkPage smartcardlinkPage = new SmartcardlinkPage();
        Assert.assertTrue(smartcardlinkPage.bodybolumu.isDisplayed());

        // 6-Browser kapatılır
        Driver.closeDriver();
    }
}
