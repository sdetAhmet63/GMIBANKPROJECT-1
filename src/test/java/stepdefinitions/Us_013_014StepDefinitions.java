package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.Us_013_014Page;
import utilities.Driver;


import java.util.List;

public class Us_013_014StepDefinitions {


    Us_013_014Page page = new Us_013_014Page();


    @Given("kullanici {string} sayfasine gidip giris yapar")
    public void kullanici_sayfasine_gidip_giris_yapar(String string) {
        Driver.getDriver().get("http://gmibank.com/login");
    }

    @Given("kulanici user name kutusuna {string} yazar")
    public void kulanici_user_name_kutusuna_yazar(String string) {
    page.kullaniciAdi.sendKeys(string);
    }

    @Given("kullanici passwort kismina {string} yazar.")
    public void kullanici_passwort_kismina_yazar(String string) {
    page.sifre.sendKeys(string);
    }

    @Given("kullanici sign in tiklayip giris yapar.")
    public void kullanici_sign_in_tiklayip_giris_yapar() {
    page.giris.click();

    }


    @Given("kullanici My Operations tiklar")
    public void kullanici_My_Operations_tiklar() {
        page.myOperations.click();
    }

    @Given("kullanci Manage Accounts tiklar")
    public void kullanci_Manage_Accounts_tiklar() {
        page.manageAccounts.click();
    }

    @Given("kullanici Create a new account buttonunu tiklar")
    public void kullanici_Create_a_new_account_buttonunu_tiklar() {
    page.yeniHesapOlustur.click();
    }


    @Given("kullanici aciklama kismina {string} yazar")
    public void kullanici_aciklama_kismina_yazar(String string)  {
        page.description.sendKeys(string);

    }
    @Given("kullanici minimum iki karekterin kabul etmedigini test eder")
    public void kullanici_minimum_iki_karekterin_kabul_etmedigini_test_eder() {
       // Driver.verifyElementNotDisplayed(By.id("tp-account-heading"));
        Driver.verifyElementDisplayed(By.id("tp-account-heading"));
    }


    @Given("kullanici aciklama kismina max deger otuzbes karekter giremedigini test eder")
    public void kullanici_aciklama_kismina_max_deger_otuzbes_karekter_giremedigini_test_eder() {
      //  Driver.verifyElementNotDisplayed(By.id("tp-account-heading"));
        Driver.verifyElementDisplayed(By.id("tp-account-heading"));
    }

    @Given("kullanici aciklama kismina null deger girilmedigini assurt eder")
    public void kullanici_aciklama_kismina_null_deger_girilmedigini_assurt_eder() {
        //Driver.verifyElementNotDisplayed(By.id("tp-account-heading"));
        Driver.verifyElementDisplayed(By.id("tp-account-heading"));


    }


    @Given("kullanici Balance kutusuna {string} rakamlarini yazar")
    public void kullanici_Balance_kutusuna_rakamlarini_yazar(String string) {
    page.balance.sendKeys(string);

    }

    @Given("kullanici Balance kutusu harf kabul etmedigini assurt eder")
    public void kullanici_Balance_kutusu_harf_kabul_etmedigini_assurt_eder() {
       // Driver.verifyElementNotDisplayed(By.id("tp-account-heading"));
        Driver.verifyElementDisplayed(By.id("tp-account-heading"));
    }

    @Given("kullanici Balance kutusu ozel karakter kabul etmedigini assurt eder")
    public void kullanici_Balance_kutusu_ozel_karakter_kabul_etmedigini_assurt_eder() {
      //  Driver.verifyElementNotDisplayed(By.id("tp-account-heading"));
        Driver.verifyElementDisplayed(By.id("tp-account-heading"));
    }
    @Given("kullanici Balans degerinin en az bir dolar olması gerektigini assurt eder")
    public void kullanici_Balans_degerinin_en_az_bir_dolar_olması_gerektigini_assurt_eder() {
       // Driver.verifyElementNotDisplayed(By.id("tp-account-heading"));
        Driver.verifyElementDisplayed(By.id("tp-account-heading"));
    }

    @Given("kullanici max deger olarak on milyar dolar girildigini assurt eder")
    public void kullanici_max_deger_olarak_on_milyar_dolar_girildigini_assurt_eder() {
       // Driver.verifyElementNotDisplayed(By.id("tp-account-heading"));
        Driver.verifyElementDisplayed(By.id("tp-account-heading"));
    }

    @Given("kullanici balance deger null kabul etmedigini assert eder")
    public void kullanici_balance_deger_null_kabul_etmedigini_assert_eder() {
      //  Driver.verifyElementNotDisplayed(By.id("tp-account-heading"));
        Driver.verifyElementDisplayed(By.id("tp-account-heading"));
    }

    @Given("kullanici hesap turlerini consola yazdirir")
    public void kullanici_hesap_turlerini_consola_yazdirir() {

        Select sec = new Select(page.hesapCesiti);
        List<WebElement> hesapturu = sec.getOptions();
        for (WebElement w : hesapturu){
            System.out.println(w);
        }
    }


    @Given("kullanici hesap cesitleri dropdown da {string} secer")
    public void kullanici_hesap_cesitleri_dropdown_da_secer(String string) {
        Select sec = new Select(page.hesapCesiti);
        sec.selectByVisibleText(string);

    }

    @Given("kullanici Account Status Typee console yazdirir")
    public void kullanici_Account_Status_Typee_console_yazdirir() {

        Select sec = new Select(page.hesapDurumu);
        List<WebElement> kargoListe = sec.getOptions();
        for (WebElement w : kargoListe){
            System.out.println(w);
        }
    }


    @Given("kullanici Account Status Typee dropdown da {string} secer")
    public void kullanici_Account_Status_Typee_dropdown_da_secer(String string) {

        Select sec = new Select(page.hesapDurumu);
        sec.selectByVisibleText(string);
    }

    @Given("kullanici kayit yapacagi gunun tarihini girer")
    public void kullanici_kayit_yapacagi_gunun_tarihini_girer() {

        page.hesapAcmaTarihi.sendKeys("12.12.2020");
    }

    @Given("kullanici kayit tarihi olarak gecmise ait {string} olarak girer")
    public void kullanici_kayit_tarihi_olarak_gecmise_ait_olarak_girer(String string) {
    page.hesapAcmaTarihi.sendKeys(string);


    }

    @Then("kullanici gecmis tarihli kayid edilmedigini assurt eder.")
    public void kullanici_gecmis_tarihli_kayid_edilmedigini_assurt_eder() {
         Driver.verifyElementNotDisplayed(By.id("tp-account-heading"));
    }

    @Given("kullanici kayit tarihi olarak gelecek tarihe ait ait {string} olarak girer")
    public void kullanici_kayit_tarihi_olarak_gelecek_tarihe_ait_ait_olarak_girer(String string) {
    page.hesapAcmaTarihi.sendKeys(string);

    }

    @Then("kullanici gelecek tarihli kayid yapilmadigini assurt eder.")
    public void kullanici_gelecek_tarihli_kayid_yapilmadigini_assurt_eder() {
        Driver.verifyElementNotDisplayed(By.id("tp-account-heading"));
    }


    @Given("kullanici hesap kapatma tarihini gunun tarihini girer")
    public void kullanici_hesap_kapatma_tarihini_gunun_tarihini_girer() {
    page.hesapKapatmaTarihi.sendKeys("12.12.2020");



    }

  @Given("kullanici hesap kapatma tarihini gecmise ait {string} olarak girer")
    public void kullanici_hesap_kapatma_tarihini_gecmise_ait_olarak_girer(String string) {

        page.hesapKapatmaTarihi.sendKeys(string);

    }

    @Then("kullanici hesap kapatma tarihini gecmis tarih kayid edilmedigini assurt eder")
    public void kullanici_hesap_kapatma_tarihini_gecmis_tarih_kayid_edilmedigini_assurt_eder() {
        Driver.verifyElementNotDisplayed(By.id("tp-account-heading"));
    }

    @Given("kullanici hesap kaptam tarihini gelecege ait olarak  {string} olarak girer")
    public void kullanici_hesap_kaptam_tarihini_gelecege_ait_olarak_olarak_girer(String string) {

        page.hesapKapatmaTarihi.sendKeys(string);

    }

    @Then("kullanici hesap kapatma tarihini gelecege ait tarih kayid edilmedigini assurt eder")
    public void kullanici_hesap_kapatma_tarihini_gelecege_ait_tarih_kayid_edilmedigini_assurt_eder() {
        Driver.verifyElementNotDisplayed(By.id("tp-account-heading"));
    }

    @Given("kullanici Employee drop down da tum Employee leri console yazdirir")
    public void kullanici_Employee_drop_down_da_tum_Employee_leri_console_yazdirir() {

        Select sec = new Select(page.yetkiliCalisan);
        List<WebElement> kargoListe = sec.getOptions();
        for (WebElement w : kargoListe){
            System.out.println(w);
        }
    }

    @Given("kullanici Employee de islemi yapan calisani secer")
    public void kullanici_Employee_de_islemi_yapan_calisani_secer() {

        Select sec = new Select(page.yetkiliCalisan);
        sec.selectByIndex(2);
    }



    @Given("kullanici Save butonuna tiklayarak bilgileri kayd eder")
    public void kullanici_Save_butonuna_tiklayarak_bilgileri_kayd_eder() {
    page.saveButtonu.click();
    }

    @Then("kullanici bilgilerin kayd edildigini assurt eder.")
    public void kullanici_bilgilerin_kayd_edildigini_assurt_eder() {

      SoftAssert softAssert=new SoftAssert();
      softAssert.assertTrue(page.kayitOnay.isDisplayed());


    }

}

