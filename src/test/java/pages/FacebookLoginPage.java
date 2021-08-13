package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {




    //önce drivermızı oluşturalım
        //ilk önce constructı oluşturacağız
    //constraktır class adından oluşturulur
    WebDriver driver;
   public FacebookLoginPage(WebDriver driver){//parametremiz WebDriver driver;
       //farklı claslardakiler ulaşsın diye public yaptık
       //şimdi driverımıza değer vermeliyiz
       this.driver=driver;//biim parametre olarak gönderdiğimiz driver ile bu classdaki this. driver ı eşitlemiş oldu

       PageFactory.initElements(driver, this);//init driverımıza ilk değer atamak demek

    }
    @FindBy(id="email")
    public WebElement emailTextBox;

   @FindBy(id="pass")
    public WebElement passwordTextBox;

   @FindBy(xpath="//button[@name='login']")
   public WebElement loginButton;

}
