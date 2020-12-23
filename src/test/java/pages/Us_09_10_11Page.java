package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Us_09_10_11Page {

    public Us_09_10_11Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(name = "username")
    public WebElement signInUserNameKutusu;
    @FindBy (name = "password")
    public WebElement signInPasswordKutusu;
    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signInSaveButonu;

    @FindBy(id = "search-ssn")
    public WebElement searchSSNKutusu;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement searchButonu;

    @FindBy(id = "tp-customer-firstName")
    public WebElement firstNameKutusu;
    @FindBy(id = "tp-customer-lastName")
    public WebElement lastNameKutusu;
    @FindBy(id = "tp-customer-middleInitial")
    public WebElement middleinitialKutusu;
    @FindBy(id = "tp-customer-email")
    public WebElement emailKutusu;
    @FindBy(name = "mobilePhoneNumber")
    public WebElement mobileNumberKutusu;
    @FindBy(name = "phoneNumber")
    public WebElement phoneNumberKutusu;
    @FindBy(id = "tp-customer-zipCode")
    public WebElement ziKodKutusu;
    @FindBy(id = "tp-customer-address")
    public WebElement adressKutusu;
    @FindBy(id = "tp-customer-city")
    public WebElement cityKutusu;
    @FindBy(id = "tp-customer-ssn")
    public WebElement ssnKutusu;
    @FindBy(id = "tp-customer-createDate")
    public WebElement createDateKutusu;
    @FindBy(id = "tp-customer-country")
    public WebElement countryDropDownKutusu;
    @FindBy(id = "tp-customer-state")
    public WebElement stateKutusu;
    @FindBy(id = "tp-customer-user")
    public WebElement userDropDownKutusu;
    @FindBy(id = "tp-customer-account")
    public WebElement customerMultipleKutusu;
    @FindBy(id = "tp-customer-zelleEnrolled")
    public WebElement zelleKutucugu;
    @FindBy(id = "save-entity")
    public WebElement saveButonu;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement doldurulmasiZorunluMesaji;

    @FindBy(xpath = "//span[.='Customers']")
    public WebElement kayitBasarili;

    @FindBy(xpath = "//span[.='Create or edit a Customer']")
    public WebElement testpass;

    @FindBy(id = "search-ssn")
    public WebElement searchssn;




}
