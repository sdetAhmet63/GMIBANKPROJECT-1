package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Us_00405Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Us_00405StepDefinitions {

    Us_00405Page signIn04 = new Us_00405Page();
    //WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

    @Given("Kullanici www.gmibank.com gider")
    public void kullanici_www_gmibank_com_gider() {
       Driver.getDriver().get(ConfigurationReader.getProperty("url"));
      //  Driver.getDriver().get("http://www.gmibank.com/");
      //  Driver.singIn04();
    }

    @Given("Kullanici giris menusune tiklar")
    public void kullanici_giris_menusune_tiklar() {
        Driver.wait(1);
        signIn04.accountMenu.click();
        signIn04.SignInGiris.click();
    }

    @Given("username text box a tiklar")
    public void username_text_box_a_tiklar() {
        signIn04.username.click();
    }

    @Given("Kullanici gecerli username girer")
    public void kullanici_gecerli_username_girer() {
        signIn04.username.sendKeys("username04");
    }

    @Given("Kullanici password text box a tiklar")
    public void kullanici_password_text_box_a_tiklar() {
        signIn04.password.click();
    }

    @Given("Kullanici gecerli password girer")
    public void kullanici_gecerli_password_girer() {
        signIn04.password.sendKeys("password04");
    }

    @Then("Sign in buttona tiklar")
    public void sign_in_buttona_tiklar() {
        signIn04.SignInOnay.click();

    }

    @Then("Cancel buttona tiklar")
    public void cancel_buttona_tiklar() {
        Driver.getDriver().get(ConfigurationReader.getProperty("SingIn_Url"));
        Driver.waitAndClick(signIn04.SignOut,1);
        Driver.waitAndClick(signIn04.accountMenu,1);
        Driver.waitAndClick(signIn04.SignInGiris,1);
        Driver.waitAndClick(signIn04.cancelButton,1);
        // wait.until(ExpectedConditions.elementToBeClickable(us04Page.cancelButton));
        //        Assert.assertTrue(us04Page.cancelButton.isEnabled());
    }

    @Given("Kullanici gecersiz username girer")
    public void kullanici_gecersiz_username_girer() {
        signIn04.username.sendKeys("username05");
       // Driver.wait(1);
        //Assert.assertTrue(signIn04.userErrorMesagge.isDisplayed());
    }

    @Given("Kullanici gecersiz password girer")
    public void kullanici_gecersiz_password_girer() {
        signIn04.password.sendKeys("password05");
        signIn04.SignInOnay.click();
      //  Assert.assertTrue(signIn04.errorMesagge.isDisplayed());
    }

    @Given("Sifreni mi unuttun butonuna tiklar")
    public void sifreni_mi_unuttun_butonuna_tiklar() {
        signIn04.sifreUnuttumButton.click();
    }

    @Given("Email box a tiklar")
    public void email_box_a_tiklar() {
      signIn04.emailBox.click();
    }

    @Given("Kullanici gecerli mail girer")
    public void kullanici_gecerli_mail_girer() {
        signIn04.emailBox.sendKeys("emailAdres");
    // Assert.assertTrue(signIn04.emailMesaji.isDisplayed());
    }

    @Then("Reset Pasword buttona tiklayiniz")
    public void reset_Pasword_buttona_tiklayiniz() {
        signIn04.resetButton.click();
    //  Assert.assertTrue(signIn04.resetButton.isDisplayed());
    Driver.closeDriver();
    }

    @Given("Henuz bir hesabınız yok mu? Yeni bir hesap açın? butonuna tiklar")
    public void henuz_bir_hesabınız_yok_mu_Yeni_bir_hesap_açın_butonuna_tiklar() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        signIn04.accountMenu.click();
        signIn04.SignInGiris.click();
        signIn04.yeniHspAcButton.click();
        //  Assert.assertTrue(signIn04.yeniHspAcButton.isDisplayed());
    }

    @Then("Kayit Sayfasina gider")
    public void kayit_Sayfasina_gider() {
        signIn04.yeniHspAcButton.click();
        //  Assert.assertTrue(signIn04.yeniHspAcButton.isDisplayed());
    }

}