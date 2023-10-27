package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US_003_TC02 {
    @Test
            public void TC_02(){
        // 1- Browser açılır
        // 2- adres çubuğuna URL girilir
        // 3- Enter tuşuna tıklanır
        Driver.getDriver().get(ConfigReader.getProperty("sAdminUrl"));
       // 4- Sitenin ana sayfasının açıldığı doğrulanır


    }

}
/*


1- Browser açılır
2- Adres çubuğuna URL girilir
3- Enter tuşuna tıklanır
4- Sitenin ana sayfasının açıldığı doğrulanır
5--Fonksiyonların görünür olduğunu doğrulayın
6- Fonksiyonların  aktif olduğunu kontrol edin.
7-Browser kapatılır


 @Test
        public void Tc(){
            Driver.getDriver().get(ConfigReader.getProperty("sAdminUrl"));
       // 6-Fonksiyonların görünür ve aktif olduğunu kontrol edin.
            SmartcardlinkPage smartcardlinkPage = new SmartcardlinkPage();
            Assert.assertTrue(smartcardlinkPage.GetStartedButonu.isDisplayed());
        smartcardlinkPage.GetStartedButonu.click();
        Assert.assertTrue(smartcardlinkPage.CreateanAccountYazısı.isEnabled());
        Driver.getDriver().navigate().back();

                Driver.closeDriver();

    }
 */