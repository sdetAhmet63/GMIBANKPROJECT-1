package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import pages.Us_001_002Page;
import pages.Us_012Page;
import pages.Us_09_10_11Page;
import utilities.Driver;
import utilities.ExcelUtil;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.*;
import java.util.List;
import java.util.Map;

public class Us_22StepDefinition {

        Us_001_002Page rgstr = new Us_001_002Page();
        Us_09_10_11Page page=new Us_09_10_11Page();
        Us_012Page page12;
        Faker faker = new Faker();
        String ssn = faker.number().digits(3) + "-" + faker.number().digits(2) + "-" + faker.number().digits(4);
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String adresse = faker.address().fullAddress();
        String telefon = faker.number().digits(3) + "-" + faker.number().digits(3) + "-" + faker.number().digits(4);
        String userName = faker.name().username();
        String eMail = faker.name().firstName() + "@hotmail.com";
        String passw = faker.internet().password(6, 10, true, true);
        String phoneNumber = faker.number().digits(3) + "-" + faker.number().digits(3) +  "-" + faker.number().digits(4);
        String state = faker.address().state();
        String zipCode = faker.number().digits(5);
        String city = faker.address().city();

    String path = "src/test/resources/Api.xlsx";

        FileInputStream file = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheetAt(0); // 1.sheet'e git
        FileOutputStream fileOutputStream = new FileOutputStream(path);

    ExcelUtil excelUtil;
    List<Map<String, String>> testData;

    public Us_22StepDefinition() throws IOException {
    }


    // JAVA'da herhangi bir dosyanın açılabilmesi için, FileInputStream
        // class'ından bir tane nesne oluşturulur. Ve parametre olarak,
        // açılmak istenen dosyanın adresi eklenir.
    //       FileInputStream file = new FileInputStream(dosyaAdresi);

        // Excel dosyasını okumak için Workbook kullanıyoruz.
 //       Workbook workbook = WorkbookFactory.create(file);

 //   Sheet sheet = workbook.getSheetAt(0); // 1.sheet'e git
//    Row row = sheet.getRow(0); // 1.row'a yani başlığa git diyoruz.

 //   Cell cell = row.createCell(3); // createCell(3) 1. satırda 4. hücreyi oluştur dedik.
 //       cell.setCellValue("NUFUS"); // .setCellValue() methoduyla bu Stringi oluştur dedik.

 //   Cell cell5 = row.createCell(4); // createCell(3) 1. satırda 5. hücreyi oluştur dedik.
 //       cell.setCellValue("YÜZÖLÇÜMÜ"); // .setCellValue() methoduyla bu Stringi oluştur dedik.
    //  row.removeCell(cell5); // üstte yazdırdığımız cell i silmiş olduk.

    @BeforeMethod
    public void getTestData() throws IOException {
        // ExcellUtil class'ını kullanarak file ve Sheet'in path'ini yazıyoruz.
        // resource içerisindeke excel dosyası üzerine gittik sağ tıklayıp copy absolutepath yaptık.
        // ikinci String kısmınada excel dosyasındaki alttaki sayfa ismini yazıyoruz.
        excelUtil = new ExcelUtil("src/test/resources/Api.xlsx", "Sheet1");

        // excelUtil class'ından getDataList() methodunu excel'den data alabilmek için çağıralım.
        testData = excelUtil.getDataList();
    }

    @Given("{string} sayfasina gider")
        public void sayfasina_gider (String string){

        Driver.getDriver().get(string);
        Driver.waitAndClick(rgstr.profilLogosu, 1);
    }

        @Given("profil logolu dropdown ve icindeki register linkini tiklar")
        public void profil_logolu_dropdown_ve_icindeki_register_linkini_tiklar () {

        Driver.waitAndClick(rgstr.registerLinki, 1);
    }

        @Given("kayit sayfasinda ssn kutusuna tiklar ve ssn numarasi ni girer ve bunu excele yazdırır.")
        public void kayit_sayfasinda_ssn_kutusuna_tiklar_ve_ssn_numarasi_ni_girer_ve_bunu_excele_yazdırır () throws
        IOException {

        Driver.waitAndSendText(rgstr.ssnKutusu, ssn, 2);

            Row row = sheet.getRow(1); // 1.row'a yani başlığa git diyoruz.
            Cell cell = row.createCell(0); // createCell(3) 1. satırda 4. hücreyi oluştur dedik.
            cell.setCellValue(ssn); // .setCellValue() methoduyla bu Stringi oluştur dedik.

            System.out.println("SSN : " + ssn);
    }

        @Given("ilk ad kutusuna ilkad ini girer ve bunu excele yazdırır.")
        public void ilk_ad_kutusuna_ilkad_ini_girer_ve_bunu_excele_yazdırır () throws IOException {

        Driver.waitAndSendText(rgstr.ilkAdKutusu, firstName, 2);

            Row row = sheet.getRow(1);
            Cell cell = row.createCell(1);
            cell.setCellValue(firstName);

            System.out.println("First Name : " + firstName);
    }

        @Given("son ad kutusuna sonad ini girer ve bunu excele yazdırır.")
        public void son_ad_kutusuna_sonad_ini_girer_ve_bunu_excele_yazdırır () throws IOException {

        Driver.waitAndSendText(rgstr.sonAdKutusu, lastName, 2);

            Row row = sheet.getRow(1);
            Cell cell = row.createCell(2);
            cell.setCellValue(lastName);
            System.out.println("Last Name : " + lastName);
    }

        @Given("adres kutusuna adres ini girer ve bunu excele yazdırır.")
        public void adres_kutusuna_adres_ini_girer_ve_bunu_excele_yazdırır () throws IOException {

        Driver.waitAndSendText(rgstr.adresAdKutusu, adresse, 1);
            Row row = sheet.getRow(1);
            Cell cell = row.createCell(3);
            cell.setCellValue(adresse);

        System.out.println("Adres : " + adresse);
    }

        @Given("mobil telefon numarasi kutusuna mobile telefon numarasi ni girer ve bunu excele yazdırır.")
        public void mobil_telefon_numarasi_kutusuna_mobile_telefon_numarasi_ni_girer_ve_bunu_excele_yazdırır () throws IOException {

        Driver.waitAndSendText(rgstr.mobileTelefonNumarasiKutusu, telefon, 1);
            Row row = sheet.getRow(1);
            Cell cell = row.createCell(4);
            cell.setCellValue(telefon);

        System.out.println("Mobil Numara : " + telefon);
    }

        @Given("username kutusuna username ini girer ve bunu excele yazdırır.")
        public void username_kutusuna_username_ini_girer_ve_bunu_excele_yazdırır () throws IOException {

        Driver.waitAndSendText(rgstr.usernameKutusu, userName, 1);
            Row row = sheet.getRow(1);
            Cell cell = row.createCell(5);
            cell.setCellValue(userName);

        System.out.println("User Name : " + userName);
    }

        @Given("email kutusuna email ini girer ve bunu excele yazdırır.")
        public void email_kutusuna_email_ini_girer_ve_bunu_excele_yazdırır () throws IOException {

        Driver.waitAndSendText(rgstr.emailKutusu, eMail, 1);
            Row row = sheet.getRow(1);
            Cell cell = row.createCell(6);
            cell.setCellValue(eMail);

        System.out.println("E-Mail : " + eMail);
    }

        @Given("newPassword ve confirmation kutusuna yedi karakterli Password girer ve bunu excele yazdırır.")
        public void newpassword_ve_confirmation_kutusuna_yedi_karakterli_Password_girer_ve_bunu_excele_yazdırır () throws IOException {

        Driver.waitAndSendText(rgstr.yeniSifreKutusu, passw, 1);
        Driver.waitAndSendText(rgstr.ikinciSifreKutusu, passw, 1);
            Row row = sheet.getRow(1);
            Cell cell = row.createCell(7);
            cell.setCellValue(passw);

            workbook.write(fileOutputStream);
            fileOutputStream.close();
            file.close();
            workbook.close();
        System.out.println("Password : " + passw);
    }

        @Given("kullanici SearchSSn kutusuna ssn degerini okutup yazdırır.")

        public void kullanici_SearchSSn_kutusuna_ssn_degerini_okutup_yazdırır () {

            Row row = sheet.getRow(1);
            Cell cell = row.getCell(0);
            String cell1 = cell.toString();
        Driver.waitAndSendText(page.searchssn,cell1,1);
        Driver.waitAndClick(page.searchSSNKutusu,1);
    }

        @Given("kullanici Middle Initial kutusuna ikinci adın ilk harfini okutup yazdırır.")

        public void kullanici_Middle_Initial_kutusuna_ikinci_adın_ilk_harfini_okutup_yazdırır () {
            Row row = sheet.getRow(1);
            Cell cell = row.getCell(2);
            String cell1 = cell.toString();

        Driver.waitAndSendText(page.middleinitialKutusu,cell1,1);
    }
        @Given("kullanici Mobile Phone Number kutusuna telefon değerini okutup yazdırır.")
        public void kullanici_Mobile_Phone_Number_kutusuna_telefon_değerini_okutup_yazdırır () {

            Row row = sheet.getRow(1);
            Cell cell = row.getCell(4);
            String cell1 = cell.toString();

        Driver.waitAndSendText(page.mobileNumberKutusu,cell1,1);
    }
        @Given("kullanici Phone Number kutusuna {int}-{int}-{int} formatında numara girer ve bunu excele yazdırır.")
        public void kullanici_Phone_Number_kutusuna_formatında_numara_girer_ve_bunu_excele_yazdırır (Integer
        int1, Integer int2, Integer int3) throws IOException {

        Driver.waitAndSendText(page.phoneNumberKutusu,phoneNumber,1);
            Row row = sheet.getRow(1);
            Cell cell = row.createCell(8);
            cell.setCellValue(phoneNumber);

            System.out.println("Phone Number" + phoneNumber);
    }
        @Given("kullanici Zip Code kutusuna {int} digit numara girer ve bunu excele yazdırır.")
        public void kullanici_Zip_Code_kutusuna_digit_numara_girer_ve_bunu_excele_yazdırır (Integer int1) throws IOException {

        Driver.waitAndSendText(page.ziKodKutusu,zipCode,1);
            Row row = sheet.getRow(1);
            Cell cell = row.createCell(9);
            cell.setCellValue(zipCode);

            System.out.println("Zip Code : " + zipCode);
    }
        @Given("kullanici Address kutusuna adresse degerlerini okutup yazdırır")
        public void kullanici_Address_kutusuna_adresse_degerlerini_okutup_yazdırır () {

            Row row = sheet.getRow(1);
            Cell cell = row.getCell(3);
            String cell1 = cell.toString();
            cell.setCellValue(cell1);

        Driver.waitAndSendText(page.adressKutusu,cell1,1);
            System.out.println("Adress : " + cell1);
    }
        @Given("kullanici City kutusuna sehir ismi girer ve bunu excele yazdırır.")
        public void kullanici_City_kutusuna_sehir_ismi_girer_ve_bunu_excele_yazdırır () {

        Driver.waitAndSendText(page.cityKutusu,city,1);
            Row row = sheet.getRow(1);
            Cell cell = row.createCell(10);
            cell.setCellValue(city);

            System.out.println("City Name : " + city);
    }
        @Given("kullanici Country  dropdowndan  fake index sayısı atar ve bunu excele yazdırır.")
        public void kullanici_Country_dropdowndan_fake_index_sayısı_atar_ve_bunu_excele_yazdırır () {

        int index = faker.number().numberBetween(1,5);
            WebElement country = page.countryDropDownKutusu;
            Select select=new Select(country);
            select.selectByIndex(index);
            String country1 = select.getFirstSelectedOption().getText();

            Row row = sheet.getRow(1);
            Cell cell = row.createCell(11);
            cell.setCellValue(country1);

            System.out.println("Country : " + country1);
    }
        @Given("kullanici State kutusuna fake index sayısı atar ve bunu excele yazdırır.")
        public void kullanici_State_kutusuna_fake_index_sayısı_atar_ve_bunu_excele_yazdırır () {

            Driver.waitAndSendText(page.stateKutusu,state,1);
            Row row = sheet.getRow(1);
            Cell cell = row.createCell(12);
            cell.setCellValue(state);

            System.out.println("State : " + state);
    }
        @Given("kullanici create date kutusuna {double}.{int} formatında bugünün tarihini girer ve excele yazdırır.")
        public void kullanici_create_date_kutusuna_formatında_bugünün_tarihini_girer_ve_excele_yazdırır (Double
        double1, Integer int1) throws IOException {

            String today = new SimpleDateFormat("dd.MM.yy").format(new Date());
            Driver.waitAndSendText(page.createDateKutusu,today,1);

            Row row = sheet.getRow(1);
            Cell cell = row.createCell(13);
            cell.setCellValue(today);

            workbook.write(fileOutputStream);
            fileOutputStream.close();
            file.close();
            workbook.close();
            System.out.println("Tarih : " + today);
    }

    @Given("kullanici sayfasina http:\\/\\/www.gmibank.com\\/tp-customer\\/new gider")
    public void kullanici_sayfasina_http_www_gmibank_com_tp_customer_new_gider() {

        Driver.waitAndClick(page12.myOperationsLinki,1);
        Driver.waitAndClick(page12.manageCustomersLinki,1);
        Driver.waitAndClick(page12.newCustomer,1);
    }
    }


