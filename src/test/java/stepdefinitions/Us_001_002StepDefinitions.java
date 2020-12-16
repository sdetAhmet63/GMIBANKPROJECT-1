package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Us_001_002Page;
import utilities.Driver;

public class Us_001_002StepDefinitions {

    Us_001_002Page us001Page= new Us_001_002Page();

 // USER STORY 1 TEST CASE 1  -  SSN KUTUSU TESTI   /   +   /   Fail

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(string);
        Driver.isVisible(us001Page.bankaLogosu);
    }

    @Given("kullanici profil logolu dropdown ve icindeki register linkini tiklar")
    public void kullanici_profil_logolu_dropdown_ve_icindeki_register_linkini_tiklar() {
        Driver.waitAndClick(us001Page.profilLogosu,1);
        Driver.isClick(us001Page.profilLogosu);
        Driver.waitAndClick(us001Page.registerLinki,1);
        Driver.waitAndClick(us001Page.registerLinki,1);
    }

    @Given("kullanici kayit sayfasinda ssn kutusuna tiklar ve {string} ni girer")
    public void kullanici_kayit_sayfasinda_ssn_kutusuna_tiklar_ve_ni_girer(String string) {
       Driver.waitAndClick(us001Page.ssnKutusu,1);
       Driver.isClick(us001Page.ssnKutusu);
       Driver.waitAndSendText(us001Page.ssnKutusu,string,1);
    }

    @Given("kullanici kayit sayfasinda ilk ad kutusuna tiklar")
    public void  kullanici_kayit_sayfasinda_ilk_ad_kutusuna_tiklar() {
       Driver.waitAndClick(us001Page.ilkAdKutusu,1);
       Driver.isClick(us001Page.ilkAdKutusu);
    }

    @Then("kullanici ssn kutusunun altinda herhangi bir uyari görmez")
    public void kullanici_ssn_kutusunun_altinda_herhangi_bir_uyari_görmez() {
        Driver.verifyElementNotDisplayed(us001Page.ssnGecerliDegilUyarisi);

    }

 // USER STORY 1 TEST CASE 2  -  8 HANELI SSN NUMARASI TESTI   /   +   /   Pass

    @Given("kullanici kayit sayfasinda ssn kutusunu tiklar ve {string} ni girer")
    public void kullanici_kayit_sayfasinda_ssn_kutusunu_tiklar_ve_ni_girer(String string) {
        Driver.waitAndClick(us001Page.ssnKutusu,1);
        Driver.isClick(us001Page.ssnKutusu);
        Driver.waitAndSendText(us001Page.ssnKutusu,string,1);

    }

    @Then("kullanici ssn kutusunun altinda gecersiz ssn numarasi yazili uyariyi görur")
    public void kullanici_ssn_kutusunun_altinda_gecersiz_ssn_numarasi_yazili_uyariyi_görur() {
        Driver.verifyElementDisplayed(us001Page.ssnGecerliDegilUyarisi);
    }


 // USER STORY 1 TEST CASE 3  -  10 HANELI SSN NUMARASI TESTI   /   +   /   Pass

    @Given("kullanici kayit sayfasinda ssn kutusunu tiklayarak {string} ni girer")
    public void kullanici_kayit_sayfasinda_ssn_kutusunu_tiklayarak_ni_girer(String string) {
        Driver.waitAndSendText(us001Page.ssnKutusu,string,1);
    }


 // USER STORY 1 TEST CASE 4  -  ILK AD GEREKLI TESTI   /   +   /   Pass

    @Then("kullanici ilk ad kutusunun altinda adin gerekli oldugunu belirten uyari görur")
    public void kullanici_ilk_ad_kutusunun_altinda_adin_gerekli_oldugunu_belirten_uyari_görur() {
        Driver.verifyElementDisplayed(us001Page.ilkAdGerekliUyarisi);
    }


 // USER STORY 1 TEST CASE 5  -  ILK AD KUTUSU TESTI   /   +   /   Pass

    @Given("kullanici ilk ad kutusuna {string} ini girer")
    public void kullanici_ilk_ad_kutusuna_ni_girer(String string) {
        Driver.waitAndSendText(us001Page.ilkAdKutusu,string,1);
    }

    @Given("kullanici kayit sayfasinda son ad kutusuna tiklar")
    public void kullanici_kayit_sayfasinda_son_ad_kutusuna_tiklar() {
        Driver.waitAndClick(us001Page.sonAdKutusu,1);
        //Driver.isClick(us001Page.sonAdKutusu);
    }

    @Then("kullanici ilk ad kutusunun altinda herhangi bir uyari görmez")
    public void kullanici_ilk_ad_kutusunun_altinda_herhangi_bir_uyari_görmez() {
        Driver.verifyElementNotDisplayed(us001Page.ilkAdGerekliUyarisi);
    }


 // USER STORY 1 TEST CASE 6   SON AD GEREKLI TESTI   /   +   /   Pass

    @Then("kullanici son ad kutusunun altinda son adin gerekli oldugunu belirten uyari görur")
    public void kullanici_son_ad_kutusunun_altinda_son_adin_gerekli_oldugunu_belirten_uyari_görur() {
        Driver.verifyElementDisplayed(us001Page.sonAdGerekliUyarisi);
    }


 // USER STORY 1 TEST CASE 7   SON AD KUTUSU TESTI   /   +   /   Pass

    @Given("kullanici son ad kutusuna {string} ini girer")
    public void kullanici_son_ad_kutusuna_ini_girer(String string) {
       Driver.waitAndSendText(us001Page.sonAdKutusu,string,1);
    }

    @Given("kullanici kayit sayfasinda adres kutusuna tiklar")
    public void kullanici_kayit_sayfasinda_adres_kutusuna_tiklar() {
        Driver.waitAndClick(us001Page.adresAdKutusu,1);
    }

    @Then("kullanici son ad kutusunun altinda herhangi bir uyari görmez")
    public void kullanici_son_ad_kutusunun_altinda_herhangi_bir_uyari_görmez() {
        Driver.verifyElementNotDisplayed(us001Page.sonAdGerekliUyarisi);
    }


 // USER STORY 1 TEST CASE 8   ADRES KUTUSU TESTI   /   +   /   Pass

    @Given("kullanici adres kutusuna {string} ini girer")
    public void kullanici_adres_kutusuna_ini_girer(String string) {
       Driver.waitAndSendText(us001Page.adresAdKutusu,string,1);
    }

    @Given("kullanici kayit sayfasinda mobil telefon numarasi kutusuna tiklar")
    public void kullanici_kayit_sayfasinda_mobil_telefon_numarasi_kutusuna_tiklar() {
        Driver.waitAndClick(us001Page.mobileTelefonNumarasiKutusu,1);
    }

    @Then("kullanici adres kutusunun altinda herhangi bir uyari görmez")
    public void kullanici_adres_kutusunun_altinda_herhangi_bir_uyari_görmez() {
        Driver.verifyElementNotDisplayed(us001Page.adresGerekliUyarisi);
    }


 // USER STORY 1 TEST CASE 9   MOBIL TELEFON NUMARASI GEREKLI TESTI   /   +   /   Fail

    @Then("kullanici mobil telefon numarasi kutusunun altinda mobil telefon numarasinin gerekli oldugunu belirten uyari görur")
    public void kullanici_mobil_telefon_numarasi_kutusunun_altinda_mobil_telefon_numarasinin_gerekli_oldugunu_belirten_uyari_görur() {
      Driver.verifyElementDisplayed(us001Page.mobileTelefonNumarasiGerekliUyarisi);
    }


  // USER STORY 1 TEST CASE 10   MOBIL TELEFON NUMARASI GECERSIZ TESTI   /   +   /   Fail

    @Given("kullanici mobil telefon numarasi kutusuna gecersiz {string} ni girer")
    public void kullanici_mobil_telefon_numarasi_kutusuna_gecersiz_ni_girer(String string) {
        Driver.waitAndSendText(us001Page.mobileTelefonNumarasiKutusu,string,1);
    }

    @Then("kullanici mobil telefon numarasi kutusunun altinda mobil telefon numarasinin gecersiz oldugunu belirten uyari görur")
    public void kullanici_mobil_telefon_numarasi_kutusunun_altinda_mobil_telefon_numarasinin_gecersiz_oldugunu_belirten_uyari_görur() {
        Driver.verifyElementDisplayed(us001Page.mobileTelefonNumarasiGecerliDegilUyarisi);
    }


    // USER STORY 1 TEST CASE 11   MOBIL TELEFON KUTUSU TESTI   /   +   /   Pass

    @Given("kullanici mobil telefon numarasi kutusuna {string} ni girer")
    public void kullanici_mobil_telefon_numarasi_kutusuna_ni_girer(String string) {
        Driver.waitAndSendText(us001Page.mobileTelefonNumarasiKutusu,string,1);
    }

    @Given("kullanici kayit sayfasinda username kutusuna tiklar")
    public void kullanici_kayit_sayfasinda_username_kutusuna_tiklar() {
        Driver.waitAndClick(us001Page.usernameKutusu,1);
    }

    @Then("kullanici mobil telefon numarasi kutusunun altinda herhangi bir uyari görmez")
    public void kullanici_mobil_telefon_numarasi_kutusunun_altinda_herhangi_bir_uyari_görmez() {
        Driver.verifyElementNotDisplayed(us001Page.mobileTelefonNumarasiGecerliDegilUyarisi);
    }


 // USER STORY 1 TEST CASE 12 SADECE RAKAMDAN OLUSAN USERNAME TESTI   /   +   /   Fail

    @Given("kullanici username kutusuna sadece rakam olarak {string} ini girer")
    public void kullanici_username_kutusuna_sadece_rakam_olarak_ini_girer(String string) {
        Driver.waitAndSendText(us001Page.usernameKutusu,string,1);
    }

    @Then("kullanici username kutusunun altinda usernamenin gecersiz oldugunu belirten uyari görur")
    public void kullanici_username_kutusunun_altinda_usernamenin_gecersiz_oldugunu_belirten_uyari_görur() {
        Driver.verifyElementDisplayed(us001Page.usernameGecerliDegilUyarisi);
    }

 // USER STORY 1 TEST CASE 13   USERNAME KUTUSU TESTI   /   +   /   Fail

    @Given("kullanici username kutusuna {string} ini girer")
    public void kullanici_username_kutusuna_ini_girer(String string) {
        Driver.waitAndSendText(us001Page.usernameKutusu,string,1);
    }

    @Given("kullanici kayit sayfasinda email kutusuna tiklar")
    public void kullanici_kayit_sayfasinda_email_kutusuna_tiklar() {
       Driver.waitAndClick(us001Page.emailKutusu,1);
    }

    @Then("kullanici username kutusunun altinda herhangi bir uyari görmez")
    public void kullanici_username_kutusunun_altinda_herhangi_bir_uyari_görmez() {
       Driver.verifyElementNotDisplayed(us001Page.usernameGecerliDegilUyarisi);
    }

 // USER STORY 1 TEST CASE 14   EMAIL KUTUSU TESTI   /   +   /   Pass

    @Given("kullanici email kutusuna {string} ini girer")
    public void kullanici_email_kutusuna_ini_girer(String string) {
        Driver.waitAndSendText(us001Page.emailKutusu,string,1);
    }

    @Given("kullanici kayit sayfasinda yeni sifre kutusuna tiklar")
    public void kullanici_kayit_sayfasinda_yeni_sifre_kutusuna_tiklar() {
       Driver.waitAndClick(us001Page.yeniSifreKutusu,1);
    }

    @Then("kullanici email kutusunun altinda herhangi bir uyari görmez")
    public void kullanici_email_kutusunun_altinda_herhangi_bir_uyari_görmez() {
        Driver.verifyElementNotDisplayed(us001Page.emailGecerliDegilUyarisi);
    }


  // USER STORY 2 TEST CASE 1

    @Given("kullanici kayit sayfasinda ssn kutusuna tiklar")
    public void kullanici_kayit_sayfasinda_ssn_kutusuna_tiklar() {
        Driver.waitAndClick(us001Page.ssnKutusu,1);
    }

    @Then("kullanici ssn kutusunun altinda ssn numarasinin gerekli oldugunu belirten uyari görur")
    public void kullanici_ssn_kutusunun_altinda_ssn_numarasinin_gerekli_oldugunu_belirten_uyari_görur() {
        Driver.verifyElementDisplayed(us001Page.ssnGerekliUyarisi);
    }


  // USER STORY 2 TEST CASE 4

    @Then("kullanici adres kutusunun altinda adresin gerekli oldugunu belirten uyari görur")
    public void kullanici_adres_kutusunun_altinda_adresin_gerekli_oldugunu_belirten_uyari_görur() {
        Driver.verifyElementDisplayed(us001Page.adresGerekliUyarisi);
    }


  // USER STORY 2 TEST CASE 6

    @Then("kullanici username kutusunun altinda usernamenin gerekli oldugunu belirten uyari görur")
    public void kullanici_username_kutusunun_altinda_usernamenin_gerekli_oldugunu_belirten_uyari_görur() {
       Driver.verifyElementDisplayed(us001Page.usernameGerekliUyarisi);
    }


  // USER STORY 2 TEST CASE 7

    @Then("kullanici email kutusunun altinda emailin gerekli oldugunu belirten uyari görur")
    public void kullanici_email_kutusunun_altinda_emailin_gerekli_oldugunu_belirten_uyari_görur() {
        Driver.verifyElementDisplayed(us001Page.emailGerekliUyarisi);
    }


    // USER STORY 2 TEST CASE 10

    @Then("kullanici email kutusunun altinda emailin gecersiz oldugunu belirten uyari görur")
    public void kullanici_email_kutusunun_altinda_emailin_gecersiz_oldugunu_belirten_uyari_görur() {
        Driver.verifyElementDisplayed(us001Page.emailGecerliDegilUyarisi);
    }
}
