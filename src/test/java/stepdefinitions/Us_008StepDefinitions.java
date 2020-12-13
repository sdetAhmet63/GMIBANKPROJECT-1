package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.Us_008_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Us_008StepDefinitions {

    Us_008_Page Us_008_Page =new Us_008_Page();
    SoftAssert soft=new SoftAssert();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.wait(5);
        Driver.getDriver().navigate().to(string);
    }

    @Given("gecerli kullanici adini girer {string}")
    public void gecerli_kullanici_adini_girer(String string) {
        Driver.wait(5);
        Us_008_Page.username.sendKeys(string);

    }

    @Given("gecerli sifreyi girer {string}")
    public void gecerli_sifreyi_girer(String string) {
        Driver.wait(5);
        Us_008_Page.password.sendKeys(string);
    }

    @Given("{string} tusuna basar")
    public void tusuna_basar(String string) {
        Driver.wait(5);
        Us_008_Page.signInButton.submit();

    }

    @Given("home pageteki kullanici adina {string} tiklanarak {string} tusuna tiklar")
    public void home_pageteki_kullanici_adina_tiklanarak_tusuna_tiklar(String string, String string2) {
        Driver.wait(5);
        Us_008_Page.kullanici_adi.click();
        Us_008_Page.passwordButton.click();
    }

    @Given("current password kutusuna guncel sifreyi girer {string}")
    public void current_password_kutusuna_guncel_sifreyi_girer(String string) {
        Driver.wait(5);
       Us_008_Page.currentPasswordBox.sendKeys(string);
    }

    @Given("new password kutusuna yeni sifreyi girer {string}")
    public void new_password_kutusuna_yeni_sifreyi_girer(String string) {
        Driver.wait(5);
        Us_008_Page.newPasswordBox.sendKeys(string);

    }

    @Given("confirm new password kutusuna yeni sifreyi girer {string}")
    public void confirm_new_password_kutusuna_yeni_sifreyi_girer(String string) {
        Driver.wait(5);
        Us_008_Page.confirmPasswordBox.sendKeys(string);
    }

    @Given("save tusuna tiklar")
    public void save_tusuna_tiklar() {
        Driver.wait(5);
        Us_008_Page.saveButton.click();

    }

    @Then("{string} yazisinin olmadigini gorur")
    public void yazisinin_olmadigini_gorur(String string) {
        Driver.wait(5);
     Assert.assertNotEquals(Us_008_Page.passwordChanged.getText(),string);

    }

    @Then("password guvenlik seiye cizelgesinin renginin degistigini gözlemler")
    public void password_guvenlik_seiye_cizelgesinin_renginin_degistigini_gözlemler() {
        Driver.wait(5);
        String guvenlikGucMsj= Us_008_Page.pswrdGvnlkGuc.getAttribute("style");
        Assert.assertNotEquals("background-color: rgb(255, 0, 0);",guvenlikGucMsj);

    }

    @Then("password guvenlik seiye cizelgesinin renginin degismedigini gözlemler")
    public void password_guvenlik_seiye_cizelgesinin_renginin_degismedigini_gözlemler() {
       String msj2= Us_008_Page.pswrdGvnlkGuc.getAttribute("style");
        Driver.wait(5);
        System.out.println(msj2);
        Assert.assertEquals("background-color: rgb(255, 0, 0);",msj2);

    }

    @Then("{string} yazisi gorulur")
    public void yazisi_gorulur(String string) {
        Driver.wait(5);
        Assert.assertTrue(Us_008_Page.passwordChanged.getText().contains(string));
    }

    @Then("current password kutusunun icini temizler")
    public void current_password_kutusunun_icini_temizler(){
        Us_008_Page.currentPasswordBox.click();
        Us_008_Page.currentPasswordBox.clear();
    }
    @Then("new password kutusunun icini temizler")
    public void new_password_kutusunun_icini_temizler() {
        Us_008_Page.newPasswordBox.click();
        Us_008_Page.newPasswordBox.clear();

    }

    @Then("confirm new password kutusunun icini temizler")
    public void confirm_new_password_kutusunun_icini_temizler() {
        Us_008_Page.confirmPasswordBox.click();
        Us_008_Page.confirmPasswordBox.clear();
    }

}






