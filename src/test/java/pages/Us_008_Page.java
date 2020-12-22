package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Us_008_Page {
    public Us_008_Page () {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement signInButton;


@FindBy(xpath = "//span[.='team customer']")
public  WebElement kullanici_adi;

    @FindBy(xpath = "//span[.='Password']")
    public WebElement passwordButton;

    @FindBy(xpath = "//input[@id='currentPassword']")
    public WebElement currentPasswordBox;

    @FindBy(xpath = "//input[@id='newPassword']")
    public WebElement newPasswordBox;

    @FindBy(xpath = "//input[@id='confirmPassword']")
    public WebElement confirmPasswordBox;


    @FindBy (xpath = "(//li[@class='point'])[1]")
    public WebElement pswrdGvnlkGuc;


    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//strong[.='Password changed!']")
    public WebElement passwordChanged;

}
