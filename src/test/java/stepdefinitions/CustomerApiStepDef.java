package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import pojos.Customer;
import pojos.States;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ExcelUtil;
import utilities.WriteTxtUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class CustomerApiStepDef {

    Response response;
    States[] states;
    Customer[] customers;
    String path = "src/test/resources/Api.xlsx";
    FileInputStream file = new FileInputStream(path);
    Workbook workbook = WorkbookFactory.create(file);
    Sheet sheet = workbook.getSheetAt(0); // 1.sheet'e git
    FileOutputStream fileOutputStream = new FileOutputStream(path);
    ExcelUtil excelUtil;
    List<Map<String, String>> testData;


    @BeforeMethod
    public void getTestData() throws IOException {
        // ExcellUtil class'ını kullanarak file ve Sheet'in path'ini yazıyoruz.
        // resource içerisindeke excel dosyası üzerine gittik sağ tıklayıp copy absolutepath yaptık.
        // ikinci String kısmınada excel dosyasındaki alttaki sayfa ismini yazıyoruz.
        excelUtil = new ExcelUtil("src/test/resources/Api.xlsx", "Sheet1");

        // excelUtil class'ından getDataList() methodunu excel'den data alabilmek için çağıralım.
        testData = excelUtil.getDataList();
    }

    public CustomerApiStepDef() throws IOException {
    }

    @Given("kullanici kendisine verilen {string} token ile apiye baglanir")
    public void kullanici_kendisine_verilen_token_ile_apiye_baglanir(String api_endpoint) {
        // End pointe gidip oradan bilgileri çekiyoruz.
        // given için import otomatik gelmiyor kendimiz yazmamız gerekiyor.

        // headers içine yazılan requers(istek) özellikleri belirtiliyor.
        // bu given ile when arasına yazılıyor..
        // Authorization : siteden bilgiyi alabilmek için izin talebi
        // Bearer : düzenli olarak değişen bir token var bu adresi Configuration.properties'e yazdık.
        // When den sonra nereye gideceğimizi yazıyoruz.


        //Response response=given().headers(
        //              "Authorization",
        //              "Bearer " + ConfigurationReader.getProperty("token"),
        //               Bearer yazıp bir boşluk bıraktık önemli.
        //              "Content-Type",
        //              ContentType.JSON,
        //              "Accept",
        //              ContentType.JSON)

        // üstteki gibide olabilir iki yöntem var.

        response = given()
                .auth()
                .oauth2(ConfigurationReader.getProperty("token"))
                .contentType(ContentType.JSON)
           .when()
                .get(api_endpoint)  // api_endpoint'ini al response ata.
           .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        response.prettyPrint();   // response yazdır.

        // runner'a gidip false yapıp çalıştırıyoruz. muhtemelen token değiştiği için
        // Aauthorization hatası verecek 200 değilde 401 çıkacak.
        // siteye gidip ana sayfaya admin hesabıyla giriş yopıyoruz.
        // incele deyip application bölümünü seçiyoruz
        // sol tarafta site adresini seçince alt tarafta uzunca bir token adresi olacak
        // orayı kopyalayıp configuration.propertiesteki adresi güncelliyoruz.
        // en baş ve sondaki çift tırnağı siliyoruz.

    }

 //   List<String> expectedSsn = new ArrayList<>();
      List<String> stateList = new ArrayList<>();
      List<String> customerSsn = new ArrayList<>();

    @Given("user deserialization customer data json to java pojo")
    public void user_deserialization_customer_data_json_to_java_pojo() throws IOException {

    }

    @Given("kullanici jsonlari javaya cevirir")
    public void kullanici_jsonlari_javaya_cevirir() {


    }
    @Given("kullanicilarin tum ulkelerin eyaletlerini ve {string} dogrular")
    public void kullanicilarin_tum_ulkelerin_eyaletlerini_ve_dogrular(String string) {


    }
    @Given("kullanici eyaletleri texte yazdırır")
    public void kullanici_eyaletleri_texte_yazdırır() throws IOException {
 //  ObjectMapper objectMapper = new ObjectMapper();
   //     customers = objectMapper.readValue(response.asString(), Customer[].class);
     //   for (int i = 0; i < customers.length; i++) {
       //     stateList.add(customers[i].getState());
         //   WriteTxtUtil.saveAllStates("State.txt", States[].class);
     //   }
     //   System.out.println(stateList);

       // System.out.println("************************************");
     //   for(int j = 0; j < customers.length; j++ ) {
       //     if (customers[j].getUser()!= null){
         //       System.out.println(customers[0].getUser().getEmail());
  //          }
 //       }

}
    @Then("En son oluşturulan kullanıcının Ssn numarası ile api'dan çekilen veriyi karşılaştırıp dogrula.")
    public void en_son_oluşturulan_kullanıcının_Ssn_numarası_ile_api_dan_çekilen_veriyi_karşılaştırıp_dogrula() throws IOException {

       Row row = sheet.getRow(1);
       Cell cell = row.getCell(0);
       String sonSsn = cell.toString();

  //     ObjectMapper objectMapper = new ObjectMapper();
   //    customers = objectMapper.readValue(response.asString(), Customer[].class);

        String apiSsn = customers[customerSsn.lastIndexOf(customers)].getSsn();
        Assert.assertEquals(apiSsn,sonSsn);

    }

    @Given("Tüm müşterileri texte yazdır.")
    public void tüm_müşterileri_texte_yazdır() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        customers = objectMapper.readValue(response.asString(), Customer[].class);
        for (int i = 0; i < customers.length; i++) {
            customerSsn.add(customers[i].getSsn());
            WriteTxtUtil.saveDataInFileWithAllCustomerInfo("Customer.txt", Customer[].class);
        }

        System.out.println(stateList);

    }

}
