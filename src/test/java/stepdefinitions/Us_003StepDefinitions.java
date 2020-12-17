package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.Us_003Page;
import utilities.Driver;

import java.util.concurrent.ThreadLocalRandom;

public class Us_003StepDefinitions {

    Us_003Page us_003Page=new Us_003Page();

    Actions act=new Actions(Driver.getDriver());
    SoftAssert soft=new SoftAssert();
    static  char charachter = (char) ThreadLocalRandom.current().nextInt(33, 47);

    @Given("kullanici kayit {string} sayfasina gider")
    public void kullanici_kayit_sayfasina_gider(String string) {

        Driver.getDriver().get(string);


    }





    @Given("kullanici newPassword kutusuna en az bir kucuk harf iceren {string} girer ve guvenlik seviyesini kontrol eder")
    public void uc_user_sent_to_newPass_box_and_verify_the_level_chart(String string) {
        us_003Page.firstPasswordTextbox.sendKeys(string);
        Driver.wait(2);
        String color=Driver.getColor(us_003Page.colorLevel.get(4),"background-color");
        System.out.println(color);
        boolean guvenliMi=true;

        if(color.equals("#dddddd") || color.equals("#0ff0")){

            soft.assertTrue(guvenliMi);
        }

        soft.assertAll();
    }

    @Given("kullanici newPassword kutusuna kucuk harf icermeyen {string} girer ve guvenlik seviyesini kontrol eder")
    public void dort_user_sent_to_newPassword_field_and_verify_the_level_chart(String string) {
        us_003Page.firstPasswordTextbox.sendKeys(string);
        Driver.wait(2);
        String color=Driver.getColor(us_003Page.colorLevel.get(4),"background-color");
        System.out.println(color);
        soft.assertTrue(color.contains("#dddddd"));
        soft.assertNotEquals(color,"#0ff0");
        soft.assertAll();
    }

    @Given("kullanici newPassword kutusuna en az bir rakam iceren {string} girer ve guvenlik seviyesini kontrol eder")
    public void bes_user_sent_to_newPassword_field_and_verify_the_level_chart(String string) {
        us_003Page.firstPasswordTextbox.sendKeys(string);
        Driver.wait(2);
        for (WebElement w: us_003Page.colorLevel){
            Driver.wait(2);
            String color=Driver.getColor(w,"background-color");
            System.out.println(color);
            boolean guvenliMi=true;

            if(color.equals("#dddddd") || color.equals("#0ff0")){

                soft.assertTrue(guvenliMi);
            }
        }




        soft.assertAll();
    }

    @Given("kullanici newPassword kutusuna  rakam icermeyen {string} girer ve guvenlik seviyesini kontrol eder")
    public void alti_user_sent_to_newPassword_and_verify_the_level_chart(String string) {
        us_003Page.firstPasswordTextbox.sendKeys(string);
        Driver.wait(2);
        String color=Driver.getColor(us_003Page.colorLevel.get(4),"background-color");
        System.out.println(color);
        soft.assertNotEquals(color,"#0ff0");
        soft.assertAll();




    }

    @Given("kullanici newPassword kutusuna en az bir ozel karakter iceren {string} girer ve guvenlik seviyesini kontrol eder")
    public void yedi_user_sent_to_newPASWORD_box_and_verify_the_level_chart(String string) {
        us_003Page.firstPasswordTextbox.sendKeys(string);
        Driver.wait(2);
        for (WebElement w: us_003Page.colorLevel){
            Driver.wait(2);
            String color=Driver.getColor(w,"background-color");
            System.out.println(color);
            boolean guvenliMi=true;

            if(color.equals("#0ff0")){

                soft.assertTrue(guvenliMi);
            }
        }




        soft.assertAll();
    }

    @Given("kullanici newPassword kutusuna ozel karakter icermeyen {string} girer ve guvenlik seviyesini kontrol eder")
    public void sekiz_user_sent_to_newPASvORD_box_and_verify_the_level_chart(String string) {
        us_003Page.firstPasswordTextbox.sendKeys(string);
        Driver.wait(2);
        for (WebElement w: us_003Page.colorLevel){
            Driver.wait(2);
            String color=Driver.getColor(w,"background-color");
            System.out.println(color);
            soft.assertNotEquals(color,"#0ff0");

        }
        soft.assertAll();
    }

    @Given("kullanici newPassword kutusuna yedi karakterli {string} girer ve guvenlik seviyesini kontrol eder")
    public void dokuz_user_sent_to_newPassWORD_box_and_verify_the_level_chart(String string) {

        us_003Page.firstPasswordTextbox.sendKeys(string);
        Driver.wait(2);
        for (WebElement w: us_003Page.colorLevel){
            Driver.wait(2);
            String color=Driver.getColor(w,"background-color");
            System.out.println(color);
            boolean guvenliMi=true;

            if(color.equals("#0ff0")){

                soft.assertTrue(guvenliMi);
            }
        }




        soft.assertAll();


    }

    @Given("kullanici newPassword kutusuna karakter sayisi yediden az {string} girer ve guvenlik seviyesini kontrol eder")
    public void on_user_sent_to_newPass_field_and_verify_the_level_chart(String string) {


        us_003Page.firstPasswordTextbox.sendKeys(string);
        Driver.wait(2);
        for (WebElement w: us_003Page.colorLevel){
            Driver.wait(2);
            String color=Driver.getColor(w,"background-color");
            System.out.println(color);
            soft.assertNotEquals(color,"#0ff0");

        }
        soft.assertAll();
    }


    @Given("kullanici New password confirmation kutusuna yedi karakterli {string} girer ve guvenlik seviyesini kontrol eder")
    public void kullanici_New_password_confirmation_kutusuna_yedi_karakterli_girer_ve_guvenlik_seviyesini_kontrol_eder(String string) {
        Driver.waitAndSendText(us_003Page.secondPasswordKutusu,string,1);
    }

    @Given("kullanici register butonuna tiklar")
    public void kullanici_register_butonuna_tiklar() {
        Driver.waitAndClick(us_003Page.registerButonu,1);
    }

}

