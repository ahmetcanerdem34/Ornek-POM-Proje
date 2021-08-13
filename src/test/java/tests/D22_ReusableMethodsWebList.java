package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class D22_ReusableMethodsWebList {


    @Test
    public void tets01(){

        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

        AmazonPage amazonPage= new AmazonPage();
        List<WebElement> tumDatalarWebElement=amazonPage.tumDataWebelementList;
        //sağ taraf gider getiri ama onu bir şeyey atamam yani eşitlemem lazım

        //yazdırmak istiyorsak Stringe armalıyım
        //for each kullanmalıyım
        //Reusablemethod calsından yapalım

        //ReusableMethods.getElementsText(tumDatalarWebElement);//bu method çalıştığında parametre olarak parantez içindekini gönderiyorum
        //sonra paametre bana methoddan ne dönderecek, String lerden oluşan bir list
        //geleni bir listede atayabiliriz yazdırabilirizde
        //yazdıralım
        //System.out.println(tumDatalarWebElement); bu referansları verir
        System.out.println(ReusableMethods.getElementsText(tumDatalarWebElement));





    }
}
