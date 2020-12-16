package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.Us_0017_18_19Page;
import utilities.Driver;

public class Us_0017_18_19StepDefinitions {

    Us_0017_18_19Page us_0017_18_19Page = new Us_0017_18_19Page();
    SoftAssert softAssert = new SoftAssert();

    @Given("https://gmibank.com/ adresine gider ve admin olarak giris yapar")
    public void https_gmibank_com_adresine_gider_ve_admin_olarak_giris_yapar() {
        Driver.singInadmin();
    }

    @And("Administratordan user management secilir")
    public void administratordan_user_management_secilir() {
        Driver.waitAndClick(us_0017_18_19Page.administtrationdropdown, 1);
        Driver.waitAndClick(us_0017_18_19Page.userManagement, 5);
        Driver.wait(5);

    }

    @And("team20admintest bulunur ve edite tiklanir")
    public void team20admintest_bulunur_ve_edite_tiklanir() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=35&sort=id,asc");
        Driver.wait(5);
        Driver.waitAndClick(us_0017_18_19Page.team20admintesteditbutonu, 5);

    }

    @And("Profilden ROLE_USER secilir")
    public void profilden_ROLE_USER_secilir() {
        Driver.wait(5);
        Driver.waitAndClick(us_0017_18_19Page.roleUserbutonu, 5);

    }


    @Then("save butonuna tiklanir")
    public void save_butonuna_tiklanir() {
        Driver.waitAndClick(us_0017_18_19Page.roleSaveButonu, 1);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=35&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.team20admintesteditbutonu, 5);
        softAssert.assertTrue(us_0017_18_19Page.activatedKutusu.isSelected());

    }

    @Given("Profilden ROLE_EMPLOYEE secilir")
    public void profilden_ROLE_EMPLOYEE_secilir() {
        Driver.wait(5);
        Driver.waitAndClick(us_0017_18_19Page.roleEmployeebutonu, 5);

    }

    @Given("Profilden ROLE_MANAGER secilir")
    public void profilden_ROLE_MANAGER_secilir() {
        Driver.wait(5);
        Driver.waitAndClick(us_0017_18_19Page.roleManagerbutonu, 5);

    }

    @Given("Profilden ROLE_ADMIN secilir")
    public void profilden_ROLE_ADMIN_secilir() {
        Driver.wait(5);
        Driver.waitAndClick(us_0017_18_19Page.roleAdminbutonu, 5);

    }

    @Given("team20admintest4u bulun ve viewe tiklayin")
    public void team20admintest4u_bulun_ve_viewe_tiklayin() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=39&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.team20admintest4viewbutonu, 5);
        softAssert.assertEquals("admin@gmail.com", us_0017_18_19Page.team20admintest4Email.getText());
    }

    @Given("team20admintest1i bulun ve viewe tiklayin")
    public void team20admintest1i_bulun_ve_viewe_tiklayin() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=39&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.team20admintest1viewbutonu, 5);
        softAssert.assertEquals("manager@gmail.com", us_0017_18_19Page.team20admintest1Email.getText());
    }

    @Given("team20admintest2i bulun ve viewe tiklayin")
    public void team20admintest2i_bulun_ve_viewe_tiklayin() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=39&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.team20admintest2viewbutonu, 5);
        softAssert.assertEquals("employee@gmail.com", us_0017_18_19Page.team20admintest2Email.getText());

    }

    @Given("team20admintest3u bulun ve viewe tiklayin")
    public void team20admintest3u_bulun_ve_viewe_tiklayin() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=39&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.team20admintest3viewbutonu, 5);
        softAssert.assertEquals("user@gmail.com", us_0017_18_19Page.team20admintest3Email.getText());
    }

    @Given("team20admintest4u bulun ve edite tiklayin")
    public void team20admintest4u_bulun_ve_edite_tiklayin() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=39&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.team20admintest4editbutonu, 5);
    }

    @Given("Admin adminin lastnameni duzenler")
    public void admin_adminin_lastnameni_duzenler() {
        Driver.waitAndSendText(us_0017_18_19Page.lastNameKutusu, "_1", 5);
        Driver.waitAndClick(us_0017_18_19Page.roleSaveButonu, 1);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Then("Admin lastnameyi assert edin")
    public void Admin_lastnameyi_assert_edin() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=39&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.team20admintest4viewbutonu, 5);
        softAssert.assertEquals("Admın_1", us_0017_18_19Page.team20admintest4lastName.getText());

    }


    @Given("team20admintest1i bulun ve edite tiklayin")
    public void team20admintest1i_bulun_ve_edite_tiklayin() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=39&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.team20admintest1editbutonu, 5);

    }

    @Given("Admin managerin lastnameni duzenler")
    public void admin_managerin_lastnameni_duzenler() {
        Driver.waitAndSendText(us_0017_18_19Page.lastNameKutusu, "_1", 5);
        Driver.waitAndClick(us_0017_18_19Page.roleSaveButonu, 1);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Then("Manager lastnameyi assert edin")
    public void manager_lastnameyi_assert_edin() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=39&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.team20admintest1viewbutonu, 5);
        softAssert.assertEquals("Manager_1", us_0017_18_19Page.team20admintest1lastName.getText());

    }

    @Given("team20admintest2u bulun ve edite tiklayin")
    public void team20admintest2u_bulun_ve_edite_tiklayin() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=39&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.team20admintest2editbutonu, 5);

    }

    @Given("Admin employeenin lastnameni duzenler")
    public void admin_employeenin_lastnameni_duzenler() {
        Driver.waitAndSendText(us_0017_18_19Page.lastNameKutusu, "_1", 5);
        Driver.waitAndClick(us_0017_18_19Page.roleSaveButonu, 1);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Then("Employee lastnameyi assert edin")
    public void employee_lastnameyi_assert_edin() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=39&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.team20admintest2viewbutonu, 5);
        softAssert.assertEquals("Employee_1", us_0017_18_19Page.team20admintest2lastName.getText());
    }

    @Given("team20admintest3u bulun ve edite tiklayin")
    public void team20admintest3u_bulun_ve_edite_tiklayin() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=39&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.team20admintest3editbutonu, 5);

    }

    @Given("Admin userin lastnameni duzenler")
    public void admin_userin_lastnameni_duzenler() {
        Driver.waitAndSendText(us_0017_18_19Page.lastNameKutusu, "_1", 5);
        Driver.waitAndClick(us_0017_18_19Page.roleSaveButonu, 1);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Then("User lastnameyi assert edin")
    public void user_lastnameyi_assert_edin() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=39&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.team20admintest3viewbutonu, 5);
        softAssert.assertEquals("User_1", us_0017_18_19Page.team20admintest3lastName.getText());
    }

    @Given("team20admintest4u bulur ve delete tiklar")
    public void team20admintest4u_bulur_ve_delete_tiklar() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=39&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.team20admintest4deletebutonu, 5);
    }

    @Then("Are you sure you want to delete user team20admintest4 mesajini gorur")
    public void are_you_sure_you_want_to_delete_user_team20admintest4_mesajini_gorur() {
        softAssert.assertTrue(us_0017_18_19Page.getTeam20admintest4deletemesaji.isDisplayed());
    }


    @Given("team20admintest1i bulur ve delete tiklar")
    public void team20admintest1i_bulur_ve_delete_tiklar() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=39&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.team20admintest1deletebutonu, 5);

    }

    @Then("Are you sure you want to delete user team20admintest1 mesajini gorur")
    public void are_you_sure_you_want_to_delete_user_team20admintest1_mesajini_gorur() {
        softAssert.assertTrue(us_0017_18_19Page.getTeam20admintest1deletemesaji.isDisplayed());
    }

    @Given("team20admintest2i bulur ve delete tiklar")
    public void team20admintest2i_bulur_ve_delete_tiklar() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=39&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.team20admintest2deletebutonu, 5);
    }

    @Then("Are you sure you want to delete user team20admintest2 mesajini gorur")
    public void are_you_sure_you_want_to_delete_user_team20admintest2_mesajini_gorur() {
        softAssert.assertTrue(us_0017_18_19Page.getTeam20admintest2deletemesaji.isDisplayed());
    }

    @Given("team20admintest3u bulur ve delete tiklar")
    public void team20admintest3u_bulur_ve_delete_tiklar() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=39&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.team20admintest3deletebutonu, 5);
    }

    @Then("Are you sure you want to delete user team20admintest3 mesajini gorur")
    public void are_you_sure_you_want_to_delete_user_team20admintest3_mesajini_gorur() {
        softAssert.assertTrue(us_0017_18_19Page.getTeam20admintest3deletemesaji.isDisplayed());
    }


    @Given("Create a User butonuna tiklanir")
    public void create_a_User_butonuna_tiklanir() {
        Driver.waitAndClick(us_0017_18_19Page.createANewUserButonu, 5);

    }

    @Given("Kullanici bilgileri girilir")
    public void kullanici_bilgileri_girilir() {
        Driver.waitAndSendText(us_0017_18_19Page.loginKutusu, "test18", 3);
        Driver.waitAndSendText(us_0017_18_19Page.firstNameKutusu, "Customer", 3);
        Driver.waitAndSendText(us_0017_18_19Page.lastNameKutusu, "team20", 3);
        Driver.waitAndSendText(us_0017_18_19Page.emailKutusu, "customer20@gmail.com", 3);
        Select select = new Select(us_0017_18_19Page.languageakutusu);
        Driver.selectRandomTextFromDropdown(select);
        Driver.waitAndClick(us_0017_18_19Page.roleCustomerbutonu, 5);

    }

    @Given("Save butonuna basilir")
    public void save_butonuna_basilir() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Driver.waitAndClick(us_0017_18_19Page.roleSaveButonu, 5);
    }

    @Given("My Operationsdan Manage Accounts secilir")
    public void my_Operationsdan_Manage_Accounts_secilir() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Driver.waitAndClick(us_0017_18_19Page.myOperationsdropdown, 5);
        Driver.wait(5);
        Driver.waitAndClick(us_0017_18_19Page.manageAccounts, 5);
        Driver.wait(5);
    }

    @Then("Musterinin hesap bilgileri gorulur")
    public void musterinin_hesap_bilgileri_gorulur() {
        softAssert.assertFalse(us_0017_18_19Page.userAccount.isDisplayed());

    }

    @Given("Kullanici Customer18i bulur ve view secenegini basar")
    public void kullanici_test18i_bulur_ve_view_secenegini_basar() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=46&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.customer18viewbutonu, 5);

    }

    @Then("View butonunun calistigini assert eder")
    public void view_butonunun_calistigini_assert_eder() {
        softAssert.assertEquals("customer19@gmail.com", us_0017_18_19Page.customer18Email.getText());
    }


    @Given("Kullanici Customer18i bulur ve edit secenegini basar")
    public void kullanici_Customer18i_bulur_ve_edit_secenegini_basar() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=46&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.customer18editbutonu, 5);
    }

    @Then("Edit butonunun calistigini assert eder")
    public void edit_butonunun_calistigini_assert_eder() {
        softAssert.assertEquals("Create or edit a user", us_0017_18_19Page.editSayfaBasligi.getText());
    }


    @Given("Kullaniciya ait bilgileri degistirir ve kaydeder")
    public void kullaniciya_ait_bilgileri_degistirir_ve_kaydeder() {
        Driver.waitAndSendText(us_0017_18_19Page.lastNameKutusu, "_1", 5);
        Driver.waitAndClick(us_0017_18_19Page.roleSaveButonu, 1);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("bilgilerin degistigini assert eder")
    public void bilgilerin_degistigini_assert_eder() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=46&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.customer18viewbutonu, 5);
        softAssert.assertEquals("team20_1", us_0017_18_19Page.customer18lastName.getText());

    }


    @Given("Kullanici Customer18i bulur ve DELETE dügmesine basar")
    public void kullanici_Customer18i_bulur_ve_DELETE_dügmesine_basar() {
        Driver.getDriver().get("http://www.gmibank.com/admin/user-management?page=46&sort=id,asc");
        Driver.waitAndClick(us_0017_18_19Page.customer18deletebutonu, 5);
    }

    @Then("Kullanıcı mesaj oldugunu assert eder")
    public void kullanıcı_mesaj_oldugunu_assert_eder() {
    softAssert.assertTrue(us_0017_18_19Page.customer18deletemesaji.isDisplayed());

    }
    @Given("Olusturulan Musteri bulunur")
    public void olusturulan_Musteri_bulunur() {
        Driver.waitAndClick(us_0017_18_19Page.databutonu,5);

    }

    @Given("Edite tiklanir ve Active edilir")
    public void edite_tiklanir_ve_Active_edilir() {
        Driver.wait(5);
        Driver.waitAndClick(us_0017_18_19Page.ilkmusterieditbutonu,5);
        Driver.wait(5);
        Driver.waitAndClick(us_0017_18_19Page.activatedKutusu,5);
        Driver.wait(5);
        softAssert.assertTrue(us_0017_18_19Page.activatedKutusu.isSelected());
    }

    @Then("save butonuna tiklanir ve cikis yapilir")
    public void save_butonuna_tiklanir_ve_cikis_yapilir() {

        Driver.waitAndClick(us_0017_18_19Page.roleSaveButonu,5);
        Driver.wait(8);
        Driver.waitAndClick(us_0017_18_19Page.menuButonu,5);
        Driver.wait(5);
        Driver.waitAndClick(us_0017_18_19Page.signOutButonu,5);
        Driver.wait(5);
    }

}

//softAssert.assertTrue(us_0017_18_19Page.activatedKutusu.isSelected());
//softAssert.assertEquals("hasanbasri@hotmail.com",page.emailKutusu.getText());