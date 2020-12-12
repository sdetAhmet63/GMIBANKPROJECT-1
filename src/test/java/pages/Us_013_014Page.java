package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Us_013_014Page {

    public Us_013_014Page (){
        PageFactory.initElements(Driver.getDriver(),this); }



    @FindBy (id = "login-item")
    public WebElement signIn;


    @FindBy (id = "username")
    public WebElement kullaniciAdi;

    @FindBy (id = "password")
    public WebElement sifre;

    @FindBy (xpath = "//button[@ class = 'btn btn-primary']")
    public WebElement giris;

    @FindBy (partialLinkText = "My Operations")
    public WebElement myOperations;

    @FindBy (partialLinkText = "Manage Accounts")
    public WebElement manageAccounts;

    @FindBy (partialLinkText = "Create a new Account")
    public WebElement yeniHesapOlustur;

   @FindBy (id = "tp-account-description")
    public WebElement description;

    @FindBy(xpath = "//div[.='invalid-feedback']")
    //@FindBy (xpath = "//div[@class= 'invalid-feedback']")
    public WebElement aciklamaAssurt;

    @FindBy (id = "tp-account-balance")
    public WebElement balance;

    @FindBy (id = "tp-account-accountType")
    public WebElement hesapCesiti;

    @FindBy(xpath = "//*[.='This field is required.']")
   // @FindBy (className = "invalid-feedback")
    public WebElement balanceAssurt;


    @FindBy (id = "tp-account-accountStatusType")
    public WebElement hesapDurumu;

    @FindBy (id = "tp-account-createDate")
    public WebElement hesapAcmaTarihi;

    @FindBy (id = "tp-account-closedDate")
    public WebElement hesapKapatmaTarihi;

    @FindBy (id = "tp-account-employee")
    public WebElement yetkiliCalisan;

    @FindBy (id = "save-entity")
    public WebElement saveButtonu;

    @FindBy (id = "tp-account-heading")
    public WebElement kayitOnay;
}
