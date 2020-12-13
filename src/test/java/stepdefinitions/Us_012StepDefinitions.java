package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pages.Us_012Page;
import utilities.Driver;

public class Us_012StepDefinitions {

    Us_012Page us_012Page = new Us_012Page();
    SoftAssert softAssert = new SoftAssert();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Employee valid bilgiler ile {string} sayfasina employee olarak giriş yapar.")
    public void employee_valid_bilgiler_ile_sayfasina_employee_olarak_giriş_yapar(String string) {
        Driver.singInemployee();
    }

    @Given("Employee My Operations modulu içerisinden Manage Costumers butonunu tıklar.")
    public void employee_My_Operations_modulu_içerisinden_Manage_Costumers_butonunu_tıklar() {
        Driver.employeeManageCustomersClick();
    }

    @Then("Employee sayfada customer ID'sinin gorunuyor ve tıkanabiliyor oldugunu assert eder.")
    public void employee_sayfada_customer_ID_sinin_gorunuyor_ve_tıkanabiliyor_oldugunu_assert_eder() throws InterruptedException {

        softAssert.assertTrue(us_012Page.IDButonu.isDisplayed());
        softAssert.assertTrue(us_012Page.IDButonu.isEnabled());
        softAssert.assertAll();

    }

    @Then("Employee sayfada customer First Name'inin gorunuyor oldugunu assert eder.")
    public void employeeSayfadaCustomerFirstNameIninGorunuyorOldugunuAssertEder() throws InterruptedException {
        for (WebElement w:us_012Page.firstName) {
            softAssert.assertFalse(us_012Page.firstName.isEmpty());
            softAssert.assertAll();
            if (!us_012Page.sonFirstName.isEmpty()){
                us_012Page.next.click();
                Thread.sleep(200);

            }
        }
    }

    @Then("Employee sayfada customer Last Name'inin gorunuyor oldugunu assert eder.")
    public void employeeSayfadaCustomerLastNameIninGorunuyorOldugunuAssertEder() throws InterruptedException {
        for (WebElement w:us_012Page.lastName) {
            softAssert.assertFalse(us_012Page.lastName.isEmpty());
            softAssert.assertAll();
            if (!us_012Page.sonLastName.isEmpty()){
                us_012Page.next.click();
                Thread.sleep(200);

            }
        }

    }


    @Then("Employee sayfada customer Middle Initial'in gorunuyor oldugunu assert eder.")
    public void employeeSayfadaCustomerMiddleInitialInGorunuyorOldugunuAssertEder() throws InterruptedException {
        for (WebElement w:us_012Page.middleInitial) {
            softAssert.assertFalse(us_012Page.middleInitial.isEmpty());
            softAssert.assertAll();
            if (!us_012Page.sonMiddleInitial.isEmpty()){
                us_012Page.next.click();
                Thread.sleep(200);

            }
        }
    }


    @Then("Employee sayfada customer Email'in gorunuyor oldugunu assert eder.")
    public void employeeSayfadaCustomerEmailInGorunuyorOldugunuAssertEder() throws InterruptedException {
        for (WebElement w:us_012Page.email) {
            softAssert.assertFalse(us_012Page.email.isEmpty());
            softAssert.assertAll();
            if (!us_012Page.sonEmail.isEmpty()){
                us_012Page.next.click();
                Thread.sleep(200);

            }
        }
    }

    @Then("Employee sayfada customer Mobile Phone Number'in gorunuyor oldugunu assert eder.")
    public void employeeSayfadaCustomerMobilePhoneNumberInGorunuyorOldugunuAssertEder() throws InterruptedException {
        for (WebElement w:us_012Page.mobilePhoneNumber) {
            softAssert.assertFalse(us_012Page.mobilePhoneNumber.isEmpty());
            softAssert.assertAll();
            if (!us_012Page.sonMobilePhoneNumber.isEmpty()){
                us_012Page.next.click();
                Thread.sleep(200);

            }
        }
    }

    @Then("Employee sayfada customer Phone Number'in gorunuyor oldugunu assert eder.")
    public void employeeSayfadaCustomerPhoneNumberInGorunuyorOldugunuAssertEder() throws InterruptedException {
        for (WebElement w:us_012Page.phoneNumber) {
            softAssert.assertFalse(us_012Page.phoneNumber.isEmpty());
            softAssert.assertAll();
            if (!us_012Page.sonPhoneNumber.isEmpty()){
                us_012Page.next.click();
                Thread.sleep(200);

            }
        }
    }

    @Then("Employee sayfada customer Address'in gorunuyor oldugunu assert eder.")
    public void employeeSayfadaCustomerAddressInGorunuyorOldugunuAssertEder() throws InterruptedException {
        for (WebElement w:us_012Page.address) {
            softAssert.assertFalse(us_012Page.address.isEmpty());
            softAssert.assertAll();
            if (!us_012Page.sonAddress.isEmpty()){
                us_012Page.next.click();
                Thread.sleep(200);

            }
        }
    }

    @Then("Employee sayfada customer Create Date'in gorunuyor oldugunu assert eder.")
    public void employeeSayfadaCustomerCreateDateInGorunuyorOldugunuAssertEder() throws InterruptedException {
        for (WebElement w:us_012Page.createDate) {
            softAssert.assertFalse(us_012Page.createDate.isEmpty());
            softAssert.assertAll();
            if (!us_012Page.sonCreateDate.isEmpty()){
                us_012Page.next.click();
                Thread.sleep(200);

            }
        }
    }

    @Then("Employee sayfada customer View'in gorunuyor oldugunu assert eder.")
    public void employeeSayfadaCustomerViewInGorunuyorOldugunuAssertEder() throws InterruptedException {
        for (WebElement w:us_012Page.view) {
            softAssert.assertTrue(us_012Page.view.isEmpty());
            softAssert.assertAll();
            if (!us_012Page.sonView.isEmpty()){
                us_012Page.next.click();
                Thread.sleep(200);

            }
        }
    }


    @Then("Employee sayfada customer View'in tiklanabiliyor oldugunu assert eder.")
    public void employeeSayfadaCustomerViewInTiklanabiliyorOldugunuAssertEder() {
        softAssert.assertTrue(us_012Page.viewClick.isEnabled());
        softAssert.assertAll();
    }



    @Then("Employee sayfada customer Edit'in gorunuyor oldugunu assert eder.")
    public void employeeSayfadaCustomerEditInGorunuyorOldugunuAssertEder() throws InterruptedException {
        for (WebElement w:us_012Page.edit) {
            softAssert.assertFalse(us_012Page.edit.isEmpty());
            softAssert.assertAll();
            if (!us_012Page.sonEdit.isEmpty()){
                us_012Page.next.click();
                Thread.sleep(200);

            }
        }
    }



    @Then("Employee sayfada customer Edit'in tiklanabiliyor oldugunu assert eder.")
    public void employeeSayfadaCustomerEditInTiklanabiliyorOldugunuAssertEder() {
        softAssert.assertTrue(us_012Page.editClick.isEnabled());
        softAssert.assertAll();
    }

    @Then("Employee sayfada customer Delete'in gorunuyor oldugunu assert eder.")
    public void employeeSayfadaCustomerDeleteInGorunuyorOldugunuAssertEder() throws InterruptedException {
        for (WebElement w:us_012Page.delete) {
            softAssert.assertFalse(us_012Page.delete.isEmpty());
            softAssert.assertAll();
            if (!us_012Page.sonDelete.isEmpty()){
                us_012Page.next.click();
                Thread.sleep(200);

            }
        }
    }

    @Then("Employee sayfada customer Delete'in tiklanabiliyor oldugunu assert eder.")
    public void employeeSayfadaCustomerDeleteInTiklanabiliyorOldugunuAssertEder() throws InterruptedException {
        softAssert.assertTrue(us_012Page.deleteClick.isEnabled());
        softAssert.assertAll();
        Thread.sleep(2000);
    }

    @Then("Employee edit sayfasinda customer ID'nin gorunuyor ancak tiklanamiyor ve degistirilemiyor oldugunu assert eder.")
    public void employeeEditSayfasindaCustomerIDNinTiklanamiyorVeDegistirilemiyorOldugunuAssertEder() throws InterruptedException {
        us_012Page.editClick.click();
        Thread.sleep(1000);
        softAssert.assertTrue(us_012Page.editID.isDisplayed());
        softAssert.assertTrue(us_012Page.editID.isEnabled());
        softAssert.assertAll();

    }

    @Then("Employee edit sayfasinda customer First Name'nin degistirilip degistirilemedigini assert eder.")
    public void employeeEditSayfasindaCustomerFirstNameNinDegistirilipDegistirilemediginiAssertEder() throws InterruptedException {
        us_012Page.editClick.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        us_012Page.firstNameInEdit.clear();
        us_012Page.firstNameInEdit.sendKeys("Mustafa");
        softAssert.assertEquals(us_012Page.firstNameInEdit,"Mustafa");
        softAssert.assertAll();
    }

    @Then("Employee edit sayfasinda customer Last Name'nin degistirilip degistirilemedigini assert eder.")
    public void employeeEditSayfasindaCustomerLastNameNinDegistirilipDegistirilemediginiAssertEder() throws InterruptedException {
        us_012Page.editClick.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        us_012Page.lastNameInEdit.clear();
        us_012Page.lastNameInEdit.sendKeys("K");
        softAssert.assertAll();
    }

    @Then("Employee edit sayfasinda customer Middle Initial'in degistirilip degistirilemedigini assert eder.")
    public void employeeEditSayfasindaCustomerMiddleInitialInDegistirilipDegistirilemediginiAssertEder() throws InterruptedException {
        us_012Page.editClick.click();
        Thread.sleep(1000);
        us_012Page.middleInitialInEdit.clear();
        us_012Page.middleInitialInEdit.sendKeys("A");
        Thread.sleep(1000);
        softAssert.assertAll();
    }

    @Then("Employee edit sayfasinda customer Email'in degistirilip degistirilemedigini assert eder.")
    public void employeeEditSayfasindaCustomerEmailInDegistirilipDegistirilemediginiAssertEder() throws InterruptedException {
        us_012Page.editClick.click();
        Thread.sleep(1000);
        us_012Page.emailInEdit.clear();
        us_012Page.emailInEdit.sendKeys("B");
        Thread.sleep(1000);
        softAssert.assertAll();
    }

    @Then("Employee edit sayfasinda customer Mobile Phone Number'in degistirilip degistirilemedigini assert eder.")
    public void employeeEditSayfasindaCustomerMobilePhoneNumberInDegistirilipDegistirilemediginiAssertEder() throws InterruptedException {
        us_012Page.editClick.click();
        Thread.sleep(1000);
        us_012Page.mobilePhoneNumberInEdit.clear();
        us_012Page.mobilePhoneNumberInEdit.sendKeys("987-654-3210");
        Thread.sleep(1000);
        softAssert.assertAll();
    }


    @Then("Employee edit sayfasinda customer Phone Number'in degistirilip degistirilemedigini assert eder.")
    public void employeeEditSayfasindaCustomerPhoneNumberInDegistirilipDegistirilemediginiAssertEder() throws InterruptedException {
        us_012Page.editClick.click();
        Thread.sleep(1000);
        us_012Page.phoneNumberInEdit.clear();
        us_012Page.phoneNumberInEdit.sendKeys("987-654-3210");
        Thread.sleep(1000);
        softAssert.assertAll();
    }

    @Then("Employee edit sayfasinda customer Zip Code'un degistirilip degistirilemedigini assert eder.")
    public void employeeEditSayfasindaCustomerZipCodeUnDegistirilipDegistirilemediginiAssertEder() throws InterruptedException {
        us_012Page.editClick.click();
        Thread.sleep(1000);
        us_012Page.zipCodeInEdit.clear();
        us_012Page.zipCodeInEdit.sendKeys("95687");
        Thread.sleep(1000);
        softAssert.assertAll();
    }

    @Then("Employee edit sayfasinda customer Address'in degistirilip degistirilemedigini assert eder.")
    public void employeeEditSayfasindaCustomerAddressInDegistirilipDegistirilemediginiAssertEder() throws InterruptedException {
        us_012Page.editClick.click();
        Thread.sleep(1000);
        us_012Page.addressInEdit.clear();
        us_012Page.addressInEdit.sendKeys("Son Sokak 12");
        Thread.sleep(1000);
        softAssert.assertAll();
    }

    @Then("Employee edit sayfasinda customer City'nin degistirilip degistirilemedigini assert eder.")
    public void employeeEditSayfasindaCustomerCityNinDegistirilipDegistirilemediginiAssertEder() throws InterruptedException {
        us_012Page.editClick.click();
        Thread.sleep(1000);
        us_012Page.cityInEdit.clear();
        us_012Page.cityInEdit.sendKeys("Ankara");
        Thread.sleep(1000);
        softAssert.assertAll();
    }

    @Then("Employee edit sayfasinda customer Ssn'in degistirilip degistirilemedigini assert eder.")
    public void employeeEditSayfasindaCustomerSsnInDegistirilipDegistirilemediginiAssertEder() throws InterruptedException {
        us_012Page.editClick.click();
        Thread.sleep(1000);
        us_012Page.ssnInEdit.clear();
        us_012Page.ssnInEdit.sendKeys("147-52-6589");
        Thread.sleep(1000);
        softAssert.assertAll();
    }

    @Then("Employee edit sayfasinda customer Create Date'in degistirilip degistirilemedigini assert eder.")
    public void employeeEditSayfasindaCustomerCreateDateInDegistirilipDegistirilemediginiAssertEder() throws InterruptedException {
        us_012Page.editClick.click();
        Thread.sleep(1000);
        us_012Page.createDateInEdit.clear();
        us_012Page.createDateInEdit.sendKeys("20.11.20202, 12:00");
        Thread.sleep(1000);
        softAssert.assertAll();
    }

    @Then("Employee edit sayfasinda customer Country'nin degistirilip degistirilemedigini assert eder.")
    public void employeeEditSayfasindaCustomerCountryNinDegistirilipDegistirilemediginiAssertEder() throws InterruptedException {
        us_012Page.editClick.click();
        Thread.sleep(1000);
        Select select = new Select(us_012Page.countryInEdit);
        select.selectByVisibleText("MEXICO");
        softAssert.assertAll();
    }

    @Then("Employee edit sayfasinda customer State'in degistirilip degistirilemedigini assert eder.")
    public void employeeEditSayfasindaCustomerStateInDegistirilipDegistirilemediginiAssertEder() throws InterruptedException {
        us_012Page.editClick.click();
        softAssert.assertTrue(us_012Page.stateInEdit.isEnabled());
        softAssert.assertAll();
        Thread.sleep(2000);
    }

    @Then("Employee edit sayfasinda customer User'in degistirilip degistirilemedigini assert eder.")
    public void employeeEditSayfasindaCustomerUserInDegistirilipDegistirilemediginiAssertEder() throws InterruptedException {
        us_012Page.editClick.click();
        Select select = new Select(us_012Page.userInEdit);
        select.selectByVisibleText("qwer qwerty qwerty");
        WebElement secim = select.getFirstSelectedOption();
        softAssert.assertAll();
        Thread.sleep(2000);
    }

    @Then("Employee edit sayfasinda customer Account'nin degistirilip degistirilemedigini assert eder.")
    public void employeeEditSayfasindaCustomerAccountNinDegistirilipDegistirilemediginiAssertEder() throws InterruptedException {
        us_012Page.editClick.click();
        Select select = new Select(us_012Page.accountInEdit);
        select.selectByIndex(3);
        WebElement secim = select.getFirstSelectedOption();
        softAssert.assertTrue(secim.isSelected());
        softAssert.assertAll();
        Thread.sleep(2000);
    }

    @Then("Employee edit sayfasinda customer Zelle Enrolled kutusuna tick konulup konulamayacagini assert eder.")
    public void employeeEditSayfasindaCustomerZelleEnrolledKutusunaTickKonulupKonulamayacaginiAssertEder() throws InterruptedException {
        us_012Page.editClick.click();
        softAssert.assertFalse(us_012Page.zelleEnrolledInEdit.isSelected());
        softAssert.assertAll();
        Thread.sleep(2000);
    }

    @Then("Employee edit sayfasinda customer Back butonuna tiklanip tiklanamayacigini assert eder.")
    public void employeeEditSayfasindaCustomerBackButonunaTiklanipTiklanamayaciginiAssertEder() throws InterruptedException {
        us_012Page.editClick.click();
        softAssert.assertTrue(us_012Page.backInEdit.isEnabled());
        softAssert.assertAll();
        Thread.sleep(2000);
    }

    @Then("Employee edit sayfasinda customer Save butonuna tiklanip tiklanamayacigini assert eder.")
    public void employeeEditSayfasindaCustomerSaveButonunaTiklanipTiklanamayaciginiAssertEder() throws InterruptedException {
        us_012Page.editClick.click();
        softAssert.assertTrue(us_012Page.saveInEdit.isEnabled());
        softAssert.assertAll();
        Thread.sleep(2000);
    }

    @Then("Employee edit sayfasinda bir musteriyi silebilir, ancak employee silme konusunda emin misiniz diye bir mesaj görmelidir.")
    public void employeeEditSayfasindaBirMusteriyiSilebilirAncakEmployeeSilmeKonusundaEminMisinizDiyeBirMesajGörmelidir() throws InterruptedException {
        us_012Page.deleteClick.click();
        Thread.sleep(1000);
        softAssert.assertTrue(us_012Page.confirmDeleteMessage.isDisplayed());
        softAssert.assertAll();
    }

    @Then("Employee edit sayfasinda customer Delete butonuna tiklar ve Cancel butonunu assert eder.")
    public void employeeEditSayfasindaCustomerDeleteButonunaTiklarVeCancelButonunuAssertEder() throws InterruptedException {
        us_012Page.deleteClick.click();
        Thread.sleep(1000);
        softAssert.assertTrue(us_012Page.cancelButton.isEnabled());
        softAssert.assertAll();
    }

    @Then("Employee edit sayfasinda customer Delete butonuna tiklar ve Delete butonunu assert eder.")
    public void employeeEditSayfasindaCustomerDeleteButonunaTiklarVeDeleteButonunuAssertEder() throws InterruptedException {
        us_012Page.deleteClick.click();

        us_012Page.lastDeleteButton.click();
        Thread.sleep(1000);
        softAssert.assertTrue(us_012Page.successText.isDisplayed());
        softAssert.assertAll();
    }


    @Then("Employee cikis yapar")
    public void employeeCikisYapar() throws InterruptedException {
        Thread.sleep(1000);
        us_012Page.leaveButton.click();
        Thread.sleep(2000);
        us_012Page.signOut.click();
    }
}
