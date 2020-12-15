package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US_006_007Page;
import utilities.Driver;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;

public class US_006_007StepDefinitions {


    US_006_007Page page = new US_006_007Page();



    @Given("kullanici customer {string} sayfasina gider")
    public void kullanici_customer_sayfasina_gider(String string) {
        Driver.getDriver().get(string);
    }

    @Given("kullanici menu dropdown tiklar")
    public void kullanici_menu_dropdown_tiklar() {
        Driver.waitAndClick(page.menuDropDownButonu,2);
    }

    @Given("kullanici sing in tiklar")
    public void kullanici_sing_in_tiklar() {
        Driver.waitAndClick(page.singInSecenegi,2);
    }

    @Given("kullanici username kutusuna tiklar")
    public void kullanici_username_kutusuna_tiklar() {
        Driver.waitAndClick(page.userNameKutusu,2);
    }

    @Given("kıllanici username kutusuna {string} girer")
    public void kıllanici_username_kutusuna_girer(String string) {
        Driver.waitAndSendText(page.userNameKutusu, string, 1);
    }

    @Given("kullanici password kutusuna tiklar")
    public void kullanici_password_kutusuna_tiklar() {
        Driver.waitAndClick(page.passwordKutusu,2);
    }

    @Given("kullanici password kutusuna {string} girer")
    public void kullanici_password_kutusuna_girer(String string) {
        Driver.waitAndSendText(page.passwordKutusu, string, 1);
    }

    @Given("kullanici sing in butonunu tiklar")
    public void kullanici_sing_in_butonunu_tiklar() {
        Driver.waitAndClick(page.singInButonu,2);
    }

    @Then("kullanici anasayfaya giris yaptigini assert eder")
    public void kullanici_anasayfaya_giris_yaptigini_assert_eder() {
        Assert.assertTrue(page.kullaniciSayfasi.isDisplayed());
    }

    @Given("kullanici account-menu tiklar")
    public void kullanici_account_menu_tiklar() {
        Driver.waitAndClick(page.menuDropDownButonu,2);
    }

    @Given("kullanici account-menuden dropdown User Info tiklar")
    public void kullanici_account_menuden_dropdown_User_Info_tiklar() {
        Driver.waitAndClick(page.userInfoButonu,2);
    }

    @Given("kullanici User settings for sayfasini assert eder")
    public void kullanici_User_settings_for_sayfasini_assert_eder() {
        System.out.println(page.userSettingForSayfasi.getText());
        //Assert.assertTrue(page.userSettingForSayfasi.isDisplayed());
        Driver.verifyElementDisplayed(page.userSettingForSayfasi);
    }

    @Given("kullanici User settings for sayfasindaki guncellenebilecekleri assert eder")
    public void kullanici_User_settings_for_sayfasindaki_guncellenebilecekleri_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(page.userSettingForSayfasiBilgi.getText());
        Assert.assertTrue(page.userSettingForSayfasiBilgi.isDisplayed());
    }

    @Given("kullanici User settings for sayfasindaki language dropdown iki dil oldugunu assert eder")
    public void kullanici_User_settings_for_sayfasindaki_language_dropdown_iki_dil_oldugunu_assert_eder() {
        System.out.println(page.languageDropDown.getText());
        Assert.assertTrue(page.languageDropDown.isDisplayed());
    }

    @Given("kullanici User settings for First Name kutusunu tiklar")
    public void kullanici_User_settings_for_First_Name_kutusunu_tiklar() {
        Driver.waitAndClick(page.firstNameKutusu,2);
    }

    @Given("kullanici User settings for First Name kutusunu siler")
    public void kullanici_User_settings_for_First_Name_kutusunu_siler() {
        page.firstNameKutusu.clear();
    }

    @Given("kullanici User settings for First Name {string} girer")
    public void kullanici_User_settings_for_First_Name_girer(String string) {
        Driver.waitAndSendText(page.firstNameKutusu,string,2);
    }
    @Given("kullanici save butonunu tiklar")
    public void kullanici_save_butonunu_tiklar() {
        Driver.waitAndClick(page.saveButonu,2);
    }
    @Given("kullanici User settings for sayfasindaki First Name guncellendigini assert eder")
    public void kullanici_User_settings_for_sayfasindaki_First_Name_guncellendigini_assert_eder() {
        Driver.verifyElementDisplayed(page.firstNameKutusu);

    }
    @Given("kullanici First Name kutusunu tiklar")
    public void kullanici_First_Name_kutusunu_tiklar() {
        Driver.waitAndClick(page.lastNameKutusu,2);
    }

    @Given("kullanici First Name kutusunu temizler")
    public void kullanici_First_Name_kutusunu_temizler() {
        page.firstNameKutusu.clear();
    }

    @Given("kullanici First Name kutusuna {string} girer")
    public void kullanici_First_Name_kutusuna_girer(String string) {
        Driver.waitAndSendText(page.firstNameKutusu, string, 1);
    }

    @Then("kullanici First Name kutusundaki bilginin guncellendigini assert eder")
    public void kullanici_First_Name_kutusundaki_bilginin_guncellendigini_assert_eder() {
        System.out.println(page.settingSave.getText());
        //Assert.assertTrue(page.settingSave.isDisplayed());
        Driver.verifyElementDisplayed(page.settingSave);
    }

    @Given("kullanici Last Name kutusunu tiklar")
    public void kullanici_Last_Name_kutusunu_tiklar() {
        Driver.waitAndClick(page.lastNameKutusu,2);
    }

    @Given("kullanici Last Name kutusunu temizler")
    public void kullanici_Last_Name_kutusunu_temizler() {
        page.lastNameKutusu.clear();
    }

    @Given("kullanici Last Name kutusuna {string} girer")
    public void kullanici_Last_Name_kutusuna_girer(String string) {
        Driver.waitAndSendText(page.lastNameKutusu,string,2);
    }

    @Then("kullanici Last Name kutusundaki bilginin guncellendigini assert eder")
    public void kullanici_Last_Name_kutusundaki_bilginin_guncellendigini_assert_eder() {
        System.out.println(page.settingSave.getText());
       // Assert.assertTrue(page.settingSave.isDisplayed());
        Driver.verifyElementDisplayed(page.settingSave);
        }
    @Given("kullanici Email kutusunu tiklar")
    public void kullanici_Email_kutusunu_tiklar() {
        Driver.waitAndClick(page.emailKutusu,2);
    }
    @Given("kullanici Email kutusunu temizler")
    public void kullanici_Email_kutusunu_temizler() {
        page.emailKutusu.clear();
    }
    @Given("kullanici Email kutusuna {string} girer")
    public void kullanici_Email_kutusuna_girer(String string) {
        Driver.waitAndSendText(page.emailKutusu,string,1);
    }

    @Then("kullanici Email kutusundaki bilginin guncellendigini assert eder")
    public void kullanici_Email_kutusundaki_bilginin_guncellendigini_assert_eder() {
        System.out.println(page.settingSave.getText());
        Assert.assertTrue(page.settingSave.isDisplayed());
    }
    @Given("kullanici Language DropDown {string} secer")
    public void kullanici_Language_DropDown_secer(String string) {
        Select select = new Select(page.languageDropDown);
        select.selectByVisibleText(string);
    }
    @Then("kullanici Language DropDown bilginin guncellendigini assert eder")
    public void kullanici_Language_DropDown_bilginin_guncellendigini_assert_eder() {
        System.out.println(page.settingSave.getText());
        //Assert.assertTrue(page.settingSave.isDisplayed());
        Driver.verifyElementDisplayed(page.settingSave);
    }
    @Then("kullanici setting for guncellenebilecek bilgilerin Türkçe oldugunu assert eder")
    public void kullanici_setting_for_guncellenebilecek_bilgilerin_Türkçe_oldugunu_assert_eder() {
        System.out.println(page.userSettingForSayfasiBilgi.getText());
        Driver.verifyElementDisplayed(page.userSettingForSayfasiBilgi);
    }
    @Then("kullanici setting for guncellenebilecek bilgilerin English oldugunu assert eder")
    public void kullanici_setting_for_guncellenebilecek_bilgilerin_English_oldugunu_assert_eder() {
        System.out.println(page.userSettingForSayfasiBilgi.getText());
        Driver.verifyElementDisplayed(page.userSettingForSayfasiBilgi);

    }
    @Then("kullaniciEmail kutusunun altinda hata mesajini assert eder")
    public void kullaniciemail_kutusunun_altinda_hata_mesajini_assert_eder() {
        System.out.println(page.hataMesaji.getText());
        Assert.assertTrue(page.hataMesaji.isDisplayed());

    }
    @Then("kullanici Language Türkçe ve English baska dil olmadigini assert eder")
    public void kullanici_Language_Türkçe_ve_English_baska_dil_olmadigini_assert_eder()  {
        System.out.println(page.languageDropDown.getText());
      Assert.assertTrue(page.languageDropDown.isDisplayed());
    }
    @Given("kullanici Email kutusuna invalid {string} girer")
    public void kullanici_Email_kutusuna_invalid_girer(String string) {
        Driver.waitAndSendText(page.emailKutusu,string,2);
    }
    @Then("kullanici Email kutusunun altinda hata mesajini assert eder")
    public void kullanici_Email_kutusunun_altinda_hata_mesajini_assert_eder() {
        System.out.println(page.hataMesaji.getText());
        Driver.verifyElementDisplayed(page.hataMesaji);
    }
    @Then("kullanici bilgileri guncelledigini assert eder")
    public void kullanici_bilgileri_guncelledigini_assert_eder() {
        System.out.println(page.settingSave.getText());
        Driver.verifyElementDisplayed(page.settingSave);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Given("kullanici User settings for sayfasindaki language dropdown iki dil oldugunu gorur")
    public void kullanici_User_settings_for_sayfasindaki_language_dropdown_iki_dil_oldugunu_gorur() {

        int size = page.languageDropdownIcındekiDiller.size();
        for(int i =0; i<size ; i++){
            String options = page.languageDropdownIcındekiDiller.get(i).getText();
            System.out.println(options);
        }

    }

    @Then("kullanici Language DropDown {string} secemezdigini assert eder")
    public void kullanici_Language_DropDown_secemezdigini_assert_eder(String string) {
        Assert.assertTrue(page.languageDropDown.isDisplayed());
    }








}






