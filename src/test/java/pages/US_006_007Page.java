package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_006_007Page {

    public US_006_007Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (name = "username")
    public WebElement signInUserNameKutusu;
    @FindBy (name = "password")
    public WebElement signInPasswordKutusu;
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signInSaveButonu;
    @FindBy( id ="account-menu")
    public WebElement menuDropDownButonu;
    @FindBy ( id ="login-item" )
    public WebElement singInSecenegi;
    @FindBy ( xpath = "//div[@class='modal-body']")
    public WebElement singInSayfasi;
    @FindBy ( id ="username")
    public WebElement userNameKutusu;
    @FindBy ( id ="password")
    public WebElement passwordKutusu;
    @FindBy ( xpath = "//button[@type='submit']")
    public WebElement singInButonu;
    @FindBy ( css = "nav[class='navbar navbar-expand-md navbar-light fixed-top']")
    public WebElement kullaniciSayfasi;
    @FindBy ( xpath = "//span[.='Fidan Fidan']")
    public WebElement girisYapildi;
    @FindBy ( xpath = "//span[.='User Info']")
    public WebElement userInfoButonu;
    @FindBy ( id = "settings-title")
    public WebElement userSettingForSayfasi;
    //@FindBy ( xpath= "//div[@class='view-routes']")
    //public WebElement userSettingForSayfasi;
    @FindBy ( xpath= "//div[@class='view-routes']")
    public WebElement userSettingForSayfasiBilgi;
    @FindBy ( id = "langKey")
    public WebElement languageDropDown;
    @FindBy ( id = "firstName")
    public WebElement firstNameKutusu;
    //@FindBy ( xpath = "//div[@class='form-group']")
    //public List<WebElement> bilgiler;
    @FindBy ( id = "lastName")
    public WebElement lastNameKutusu;
    @FindBy ( id = "email")
    public WebElement emailKutusu;
    @FindBy ( xpath = "//button[@type='submit']")
    public WebElement saveButonu;
    @FindBy ( xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement settingSave;
    @FindBy( xpath = "//a[@aria-haspopup='true']")
    public WebElement kullaniciAnaSayfa;
    @FindBy ( xpath = "//div[@class='invalid-feedback']")
    public WebElement hataMesaji;
    @FindBy ( id = "langKey")
    public List<WebElement> languageDropdownIcındekiDiller;




}

