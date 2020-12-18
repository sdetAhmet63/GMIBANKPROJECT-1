package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import pages.Us_001_002Page;
import utilities.Driver;

public class Us_22StepDefinition {

    Us_001_002Page rgstr = new Us_001_002Page();
    Faker faker = new Faker();

    @Given("{string} sayfasina gider")
    public void sayfasina_gider(String string) {

        Driver.getDriver().get(string);
        Driver.waitAndClick(rgstr.profilLogosu,1);
    }

    @Given("profil logolu dropdown ve icindeki register linkini tiklar")
    public void profil_logolu_dropdown_ve_icindeki_register_linkini_tiklar() {

        Driver.waitAndClick(rgstr.registerLinki,1);
    }

    @Given("kayit sayfasinda ssn kutusuna tiklar ve {string} ni girer")
    public void kayit_sayfasinda_ssn_kutusuna_tiklar_ve_ni_girer(String string) {

        String snn = faker.number().digits(3) + "-" + faker.number().digits(2) + "-" + faker.number().digits(4);
        Driver.waitAndSendText(rgstr.ssnKutusu,snn,2);
        System.out.println(snn);
    }

    @Given("ilk ad kutusuna {string} ini girer")
    public void ilk_ad_kutusuna_ini_girer(String string) {

        String FirstName = faker.name().firstName();
        Driver.waitAndSendText(rgstr.ilkAdKutusu,FirstName,1);
        System.out.println(FirstName);
    }

    @Given("son ad kutusuna {string} ini girer")
    public void son_ad_kutusuna_ini_girer(String string) {

        String LastName = faker.name().lastName();
        Driver.waitAndSendText(rgstr.sonAdKutusu,LastName,1);
        System.out.println(LastName);
    }

    @Given("adres kutusuna {string} ini girer")
    public void adres_kutusuna_ini_girer(String string) {

        String adresse = faker.address().fullAddress();
        Driver.waitAndSendText(rgstr.adresAdKutusu,adresse,1);
        System.out.println(adresse);
    }

    @Given("mobil telefon numarasi kutusuna {string} ni girer")
    public void mobil_telefon_numarasi_kutusuna_ni_girer(String string) {

        String telefon = faker.number().digits(3) + "-" + faker.number().digits(3) + "-" + faker.number().digits(4);
        Driver.waitAndSendText(rgstr.mobileTelefonNumarasiKutusu,telefon,1);
        System.out.println(telefon);
    }

    @Given("username kutusuna {string} ini girer")
    public void username_kutusuna_ini_girer(String string) {

        String userName = faker.name().username();
        Driver.waitAndSendText(rgstr.usernameKutusu,userName,1);
        System.out.println(userName);
    }

    @Given("email kutusuna {string} ini girer")
    public void email_kutusuna_ini_girer(String string) {

        String eMail = faker.name().firstName() + "@hotmail.com";
        Driver.waitAndSendText(rgstr.emailKutusu,eMail,1);
        System.out.println(eMail);
    }

    @Given("newPassword ve confirmation kutusuna yedi karakterli Password girer")
    public void newpassword_ve_confirmation_kutusuna_yedi_karakterli_Password_girer() {

        String passw = faker.internet().password(6,10,true,true);
        Driver.waitAndSendText(rgstr.yeniSifreKutusu,passw,1);
        Driver.waitAndSendText(rgstr.ikinciSifreKutusu,passw,1);
        System.out.println(passw);
    }

}
