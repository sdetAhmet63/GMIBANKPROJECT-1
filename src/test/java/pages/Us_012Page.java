package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Us_012Page {

    public Us_012Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (name = "username")
    public WebElement signInUserNameKutusu;

    @FindBy (id = "password")
    public WebElement signInPasswordKutusu;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signInSaveButonu;

    @FindBy(xpath = "//*[.='My Operations']")
    public WebElement myOperationsLinki;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[1]/span")
    public WebElement manageCustomersLinki;

    @FindBy(xpath = "//*[@id=\"jh-create-entity\"]/span")
    public WebElement newCustomer;

    @FindBy(xpath = "//tbody/tr/td[1]")
    public WebElement IDButonu;

    @FindBy(xpath = "//body/div//h2/span")
    public List<WebElement> assertClickIDButonu;

    @FindBy(xpath = "//tr/td[2]")
    public List<WebElement> firstName;

    @FindBy(xpath = "//tbody/tr[20]/td[2]")
    public List<WebElement> sonFirstName;

    @FindBy(xpath = "//tr/td[3]")
    public List<WebElement> lastName;

    @FindBy(xpath = "//tbody/tr[20]/td[3]")
    public List<WebElement> sonLastName;

    @FindBy(xpath = "//tr/td[4]")
    public List<WebElement> middleInitial;

    @FindBy(xpath = "//tbody/tr[20]/td[4]")
    public List<WebElement> sonMiddleInitial;

    @FindBy(xpath = "//tr/td[5]")
    public List<WebElement> email;

    @FindBy(xpath = "//tbody/tr[20]/td[5]")
    public List<WebElement> sonEmail;

    @FindBy(xpath = "//tr/td[6]")
    public List<WebElement> mobilePhoneNumber;

    @FindBy(xpath = "//tbody/tr[20]/td[6]")
    public List<WebElement> sonMobilePhoneNumber;

    @FindBy(xpath = "//tr/td[7]")
    public List<WebElement> phoneNumber;

    @FindBy(xpath = "//tbody/tr[20]/td[7]")
    public List<WebElement> sonPhoneNumber;

    @FindBy(xpath = "//tr/td[8]")
    public List<WebElement> address;

    @FindBy(xpath = "//tbody/tr[20]/td[8]")
    public List<WebElement> sonAddress;

    @FindBy(xpath = "//tr/td[9]")
    public List<WebElement> createDate;

    @FindBy(xpath = "//tbody/tr[20]/td[9]")
    public List<WebElement> sonCreateDate;





    @FindBy(xpath = "//tbody/tr/td/div/a[1]")
    public List<WebElement> view;

    @FindBy(xpath = "//tbody/tr/td/div/a[1]")
    public WebElement viewClick;

    @FindBy(xpath = "//tbody/tr[20]/td/div/a[1]")
    public List<WebElement> sonView;

    @FindBy(xpath = "//tbody/tr/td/div/a[2]")
    public List<WebElement> edit;

    @FindBy (xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement editClick;

    @FindBy(xpath = "//tbody/tr[20]/td/div/a[2]")
    public List<WebElement> sonEdit;

    @FindBy(xpath = "//tbody/tr/td/div/a[3]")
    public List<WebElement> delete;

    @FindBy(xpath = "//tbody/tr[20]/td/div/a[3]")
    public List<WebElement> sonDelete;

    @FindBy (xpath = "//tbody/tr[7]/td/div/a[3]")
    public WebElement deleteClick;

    @FindBy(id = "tp-customer-id")
    public WebElement editID;
//    @FindBy(xpath = "//tbody/tr/td[1]")
//    public List<WebElement> editID;

    @FindBy(xpath = "//tbody/tr[20]/td[1]")
    public List<WebElement> editSonID;

    @FindBy(xpath = "//a[@aria-label='Next']")
    public WebElement next;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameInEdit;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameInEdit;

    @FindBy(xpath = "//input[@name='middleInitial']")
    public WebElement middleInitialInEdit;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInEdit;

    @FindBy(xpath = "//input[@name='mobilePhoneNumber']")
    public WebElement mobilePhoneNumberInEdit;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement phoneNumberInEdit;

    @FindBy(xpath = "//input[@name='zipCode']")
    public WebElement zipCodeInEdit;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement addressInEdit;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityInEdit;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnInEdit;

    @FindBy(xpath = "//input[@name='createDate']")
    public WebElement createDateInEdit;

    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement countryInEdit;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement stateInEdit;

    @FindBy(xpath = "//select[@name='user.id']")
    public WebElement userInEdit;

    @FindBy(xpath = "//select[@id='tp-customer-country']")
    public WebElement accountInEdit;

    @FindBy(xpath = "//div[@class='form-check']")
    public WebElement zelleEnrolledInEdit;

    @FindBy(xpath = "//a[@id='cancel-save']")
    public WebElement backInEdit;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveInEdit;

    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement deleteInEdit;

    @FindBy(xpath = "//div[@id='gmibankfrontendApp.tPCustomer.delete.question']")
    public WebElement confirmDeleteMessage;


    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement successText;

    @FindBy(xpath ="//button[@class='btn btn-secondary']")
    public WebElement cancelButton;

    @FindBy(xpath ="//button[@id='jhi-confirm-delete-tPCustomer']")
    public WebElement lastDeleteButton;

    @FindBy(xpath ="//span[.='team20employee team20employee']")
    public WebElement leaveButton;

    @FindBy(partialLinkText = "(//a[@class='dropdown-item'])[4]")
    public WebElement signOut;


}
