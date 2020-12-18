package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Us_001_002Page {

    public Us_001_002Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//img[@alt='Logo']")
    public WebElement bankaLogosu;
    @FindBy (id = "account-menu")
    public WebElement profilLogosu;
    @FindBy(xpath = "//*[.='Register']")
    public WebElement registerLinki;
    @FindBy (id="ssn")
    public WebElement ssnKutusu;
    @FindBy(xpath = "//*[.='translation-not-found[Your SSN is required]']")
    public WebElement ssnGerekliUyarisi;
    @FindBy(xpath = "//*[.='Your SSN is invalid']")
    public WebElement ssnGecerliDegilUyarisi;
    @FindBy (id="firstname")
    public WebElement ilkAdKutusu;
    @FindBy(xpath = "//*[.='Your First Name is required']")
    public WebElement ilkAdGerekliUyarisi;
    @FindBy (id="lastname")
    public WebElement sonAdKutusu;
    @FindBy(xpath = "//*[.='Your Last Name is required']")
    public WebElement sonAdGerekliUyarisi;
    @FindBy (id="address")
    public WebElement adresAdKutusu;
    @FindBy(xpath = "//*[.='Your Address is required']")
    public WebElement adresGerekliUyarisi;
    @FindBy (id="mobilephone")
    public WebElement mobileTelefonNumarasiKutusu;
    @FindBy(xpath = "//*[.='Your mobile phone number is required']")
    public WebElement mobileTelefonNumarasiGerekliUyarisi;
    @FindBy(xpath = "//*[.='Your mobile phone number is invalid']")
    public WebElement mobileTelefonNumarasiGecerliDegilUyarisi;
    @FindBy (id="username")
    public WebElement usernameKutusu;
    @FindBy(xpath = "//*[.='Your username is required.']")
    public WebElement usernameGerekliUyarisi;
    @FindBy(xpath = "//*[.='Your username is invalid.']")
    public WebElement usernameGecerliDegilUyarisi;
    @FindBy (id="email")
    public WebElement emailKutusu;
    @FindBy(xpath = "//*[.='Your email is required.']")
    public WebElement emailGerekliUyarisi;
    @FindBy(xpath = "//*[.='This field is invalid']")
    public WebElement emailGecerliDegilUyarisi;
    @FindBy (id="firstPassword")
    public WebElement yeniSifreKutusu;
    @FindBy (id="secondPassword")
    public WebElement ikinciSifreKutusu;

}
