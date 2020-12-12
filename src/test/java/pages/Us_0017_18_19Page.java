package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Us_0017_18_19Page {
    public Us_0017_18_19Page() {
        PageFactory.initElements((WebDriver) Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement signInUserNameKutusu;

    @FindBy(name = "password")
    public WebElement signInPasswordKutusu;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSaveButonu;

    @FindBy(xpath = "//span[.='Administration']")
    public WebElement administtrationdropdown;

    @FindBy(xpath = "//span[.='User management']")
    public WebElement userManagement;

    @FindBy(xpath ="//span[.='My Operations']" )
    public WebElement myOperationsdropdown;

    @FindBy(xpath = "//span[.='Manage Accounts']")
    public WebElement manageAccounts;

    @FindBy(xpath = "//span[.='You are not authorized to access this page.']")
    public WebElement girisYazisi;

    @FindBy(xpath = "//a[@href='/admin/user-management/team20admintest/edit']")
    public WebElement team20admintesteditbutonu;

    @FindBy(xpath = "//a[@href='/admin/user-management/team20admintest4']")
    public WebElement team20admintest4viewbutonu;

    @FindBy(xpath = "//span[.='Are you sure you want to delete user team20admintest4?']")
    public WebElement getTeam20admintest4deletemesaji;

    @FindBy(xpath = "//*[.='admin@gmail.com']")
    public WebElement team20admintest4Email;

    @FindBy(xpath = "//a[@href='/admin/user-management/team20admintest4/edit']")
    public WebElement team20admintest4editbutonu;

    @FindBy(xpath ="//*[.='Admin_1']")
    public WebElement team20admintest4lastName;

    @FindBy(xpath = "//a[@href='/admin/user-management/team20admintest3']")
    public WebElement team20admintest3viewbutonu;

    @FindBy(xpath = "//*[.='user@gmail.com']")
    public WebElement team20admintest3Email;

    @FindBy(xpath ="//*[.='User_1']")
    public WebElement team20admintest3lastName;

    @FindBy(xpath = "//a[@href='/admin/user-management/team20admintest3/edit']")
    public WebElement team20admintest3editbutonu;

    @FindBy(xpath = "//span[.='Are you sure you want to delete user team20admintest3?']")
    public WebElement getTeam20admintest3deletemesaji;

    @FindBy(xpath ="//*[.='Manager_1']")
    public WebElement team20admintest1lastName;

    @FindBy(xpath = "//a[@href='/admin/user-management/team20admintest2']")
    public WebElement team20admintest2viewbutonu;

    @FindBy(xpath = "//*[.='employee@gmail.com']")
    public WebElement team20admintest2Email;

    @FindBy(xpath = "//a[@href='/admin/user-management/team20admintest2/edit']")
    public WebElement team20admintest2editbutonu;

    @FindBy(xpath ="//*[.='Employee_1']")
    public WebElement team20admintest2lastName;

    @FindBy(xpath = "//span[.='Are you sure you want to delete user team20admintest2?']")
    public WebElement getTeam20admintest2deletemesaji;

    @FindBy(xpath = "//a[@href='/admin/user-management/team20admintest1']")
    public WebElement team20admintest1viewbutonu;

    @FindBy(xpath = "//a[@href='/admin/user-management/team20admintest1/edit']")
    public WebElement team20admintest1editbutonu;

    @FindBy(xpath = "//span[.='Are you sure you want to delete user team20admintest1?']")
    public WebElement getTeam20admintest1deletemesaji;

    @FindBy(xpath = "//*[.='manager@gmail.com']")
    public WebElement team20admintest1Email;


    @FindBy(xpath = "//a[@href='/admin/user-management/team20admintest4/delete']")
    public WebElement team20admintest4deletebutonu;

    @FindBy(xpath = "//a[@href='/admin/user-management/team20admintest3/delete']")
    public WebElement team20admintest3deletebutonu;

    @FindBy(xpath = "//a[@href='/admin/user-management/team20admintest2/delete']")
    public WebElement team20admintest2deletebutonu;

    @FindBy(xpath = "//a[@href='/admin/user-management/team20admintest1/delete']")
    public WebElement team20admintest1deletebutonu;

    @FindBy(xpath = "//option[@value='ROLE_USER']")
    public WebElement roleUserbutonu;

    @FindBy(xpath = "//option[@value='ROLE_EMPLOYEE']")
    public WebElement roleEmployeebutonu;

    @FindBy(xpath = "//option[@value='ROLE_MANAGER']")
    public WebElement roleManagerbutonu;

    @FindBy(xpath = "//option[@value='ROLE_ADMIN']")
    public WebElement roleAdminbutonu;

    @FindBy(xpath = "//option[@value='ROLE_CUSTOMER']")
    public WebElement roleCustomerbutonu;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement roleSaveButonu;

    @FindBy(xpath = "//span[.='Create a new user']")
    public WebElement createANewUserButonu;

    @FindBy(xpath = "//*[.='A user is updated with identifier team20admintest']")
    public WebElement updateyazisi;

    @FindBy(id="firstName")
    public WebElement firstNameKutusu;

    @FindBy(id = "login")
    public WebElement loginKutusu;

    @FindBy(id = "lastName")
    public WebElement lastNameKutusu;

    @FindBy(id = "email")
    public WebElement emailKutusu;

    @FindBy(id="activated")
    public WebElement activatedKutusu;

    @FindBy(id = "langKey")
    public WebElement languageakutusu;

    @FindBy(partialLinkText = "User Account")
    public WebElement userAccount;

    @FindBy(xpath = "//a[@href='/admin/user-management/customer18']")
    public WebElement customer18viewbutonu;

    @FindBy(xpath = "//a[@href='/admin/user-management/customer18/delete']")
    public WebElement customer18deletebutonu;

    @FindBy(xpath = "//a[@href='/admin/user-management/customer18/edit']")
    public WebElement customer18editbutonu;

    @FindBy(xpath = "//*[.='customer19@gmail.com']")
    public WebElement customer18Email;

    @FindBy(xpath = "//span[.='Create or edit a user']")
    public WebElement editSayfaBasligi;

    @FindBy(xpath ="//*[.='team20_1']")
    public WebElement customer18lastName;

    @FindBy(xpath = "//span[.='Are you sure you want to delete user customer18?']")
    public WebElement customer18deletemesaji;

    @FindBy(xpath = "//*[@data-icon='sort']")
    public WebElement databutonu;


    @FindBy(xpath = "//tbody/tr/td[10]/div/a[2]")
    public WebElement ilkmusterieditbutonu;

    @FindBy(xpath = "//span[.='team20admin team20admin']")
    public WebElement menuButonu;

    @FindBy(xpath = "//span[.=\'Sign out\']")
    public WebElement signOutButonu;



}
