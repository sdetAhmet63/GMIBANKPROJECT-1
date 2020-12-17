package pages;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Us_0405Page {
    public Us_0405Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css ="#account-menu")
    public WebElement accountMenu;

    @FindBy(xpath = "//span[.='Sign in']")
    public WebElement SignInGiris;

    @FindBy(xpath ="//button[@type='submit']")
    public WebElement SignInOnay;

    @FindBy(xpath = "//input[contains(@id,'username')]")
    public WebElement username;

    @FindBy(id = "password")
    //  @FindBy(xpath = "//input[contains(@id,'password')]")
    public WebElement password;

    @FindBy(xpath = "//span[.='team20 Us04']")
    public WebElement kullaniciIsmi;

//    @FindBy(xpath ="//button[@type='submit']")
//    public WebElement submit;

    @FindBy(xpath ="//span[contains(text(),'Operations')]")
    public WebElement myOperations;

    @FindBy(xpath = "//span[.='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath =" //*[text()='Sign out']")
    public WebElement SignOut;

    @FindBy (name = "username")
    public WebElement signInUserNameKutusu;

    @FindBy (name = "password")
    public WebElement signInPasswordKutusu;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSaveButonu;

    @FindBy(xpath="//*[text()='Did you forget your password?']")
    public WebElement sifreUnuttumButton;

    @FindBy(xpath ="//*[text()='Register a new account']")
    public WebElement yeniHspAcButton;

    @FindBy( id ="email")
    public WebElement emailKutusu;

    @FindBy(xpath ="//*[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath ="//*[text()='Reset password']")
    public WebElement resetButton;

    @FindBy(xpath ="//strong[.='Failed to sign in!']")
    public static WebElement errorMesagge;

    @FindBy(xpath ="//class[.='invalid-feedback']")
    public WebElement userErrorMesagge;

    @FindBy(xpath ="//div[@class='Toastify__toast-body']")
    public WebElement emailMesaji;

}