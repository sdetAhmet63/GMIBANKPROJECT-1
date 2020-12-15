package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.Us_09_10_11Page;
import utilities.Driver;

public class Us_09_10_11StepDefinition {

    Us_09_10_11Page page=new Us_09_10_11Page();
    SoftAssert softAssert=new SoftAssert();

    @Given("kullanici employee olarak giris yapar")
    public void kullanici_employee_olarak_giris_yapar() {
        Driver.singInemployee();
        Driver.wait(1);
    }

    @Given("kullanici sayfasina {string} gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(string);
    }

    @Given("kullanici SearchSSn kutusuna {string} degerini girer")
    public void kullanici_SearchSSn_kutusuna_degerini_girer(String string) {
        Driver.waitAndSendText(page.searchSSNKutusu,string,1);
    }

    @Given("kullanici Search butonuna tiklar")
    public void kullanici_Search_butonuna_tiklar() {
        page.searchButonu.click();
        Driver.wait(2);

    }

    @Then("kullanici bilgileri assert eder")
    public void kullanici_bilgileri_assert_eder() {
        softAssert.assertEquals("hasanbasri@hotmail.com",page.emailKutusu.getText());
    }

    @Given("kullanici Middle Initial kutusuna {string} degerini girer")
    public void kullanici_Middle_Initial_kutusuna_degerini_girer(String string) {
        Driver.waitAndSendText(page.middleinitialKutusu,string,1);
    }

    @Given("kullanici Mobile Phone Number kutusuna {string} degerini girer")
    public void kullanici_Mobile_Phone_Number_kutusuna_degerini_girer(String string) {
        Driver.waitAndSendText(page.mobileNumberKutusu,string,1);
    }

    @Given("kullanici Phone Number kutusuna {string} degerini girer")
    public void kullanici_Phone_Number_kutusuna_degerini_girer(String string) {
        Driver.waitAndSendText(page.phoneNumberKutusu,string,1);
    }

    @Given("kullanici Zip Code kutusuna {string} degerini girer")
    public void kullanici_Zip_Code_kutusuna_degerini_girer(String string) {
        Driver.waitAndSendText(page.ziKodKutusu,string,1);
    }

    @Given("kullanici Address kutusuna {string} degerlerinni girer")
    public void kullanici_Address_kutusuna_degerlerinni_girer(String string) {
       page.adressKutusu.clear();
       page.adressKutusu.sendKeys(string,Keys.ENTER);
    }

    @Given("kullanici City kutusuna {string} degerlerini girer")
    public void kullanici_City_kutusuna_degerlerini_girer(String string) {
        Driver.waitAndSendText(page.cityKutusu,string,1);
    }

    @Given("kullanici Country  dropdowndan  {string} index secer")
    public void kullanici_Country_dropdowndan_index_secer(String string) {
        Select select=new Select(page.countryDropDownKutusu);
        select.selectByVisibleText(string);
    }

    @Given("kullanici State kutusuna {string} degerlerini girer")
    public void kullanici_State_kutusuna_degerlerini_girer(String string) {
       page.stateKutusu.sendKeys(string);
        // Driver.waitAndSendText(page.stateKutusu,string,1);
        page.createDateKutusu.click();
    }


    @Given("kullanici create date kutusuna {string} degerlerini girer")
    public void kullanici_create_date_kutusuna_degerlerini_girer(String string) {
        Driver.waitAndSendText(page.createDateKutusu,string,1);
    }

    @Given("kullanici user dropdown dan {string} degerini secer")
    public void kullanici_user_dropdown_dan_degerini_secer(String string) {
        Driver.selectDropdownByVisibleText(Driver.getDriver(),page.userDropDownKutusu,string);


    }

    @Given("kullanici  account kutusundan {string} degerini secer")
    public void kullanici_account_kutusundan_degerini_secer(String string) {
        Driver.selectDropdownByVisibleText(Driver.getDriver(),page.customerMultipleKutusu,string);

    }

    @Given("kullanici zelle enrolled  kutucugunu  tiklar")
    public void kullanici_zelle_enrolled_kutucugunu_tiklar() {
        Driver.waitAndClick(page.zelleKutucugu,1);
    }



    @Then("kullanici basarili islemi assert yapar")
    public void kullanici_basarili_islemi_assert_yapar() {
        softAssert.assertTrue(page.testpass.isDisplayed());
    }

    @Then("kullanici hatali islemi assert yapar")
    public void kullanici_hatali_islemi_assert_yapar() {
        Driver.verifyElementDisplayed(page.doldurulmasiZorunluMesaji);
    }

    @Given("kullanici  account kutusundan {string},{string} degerini secer")
    public void kullanici_account_kutusundan_degerini_secer(String string, String string2) {
       Select select=new Select(page.customerMultipleKutusu);
        if(select.isMultiple()){
            select.selectByVisibleText(string);
            select.selectByVisibleText(string2);
        }
       

    }

    @Given("kullanici save butonuna basar")
    public void kullanici_save_butonuna_basar() {
        Driver.waitAndClick(page.saveButonu,1);
    }



}
