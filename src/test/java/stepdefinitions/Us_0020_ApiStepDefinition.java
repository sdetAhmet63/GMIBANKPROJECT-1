package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import pojos.Customer;
import utilities.ConfigurationReader;
import utilities.WriteTxtUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Us_0020_ApiStepDefinition {
    //admin SSn=291-34-8311
    //employee SSN=291-34-8312

    Response response;
    Customer[] customers;
    static int id;
    List<Map<String, Object>> listofCustomers ;
    JsonPath json;
    List<String> stateList=new ArrayList<>();
    List<String> countryList=new ArrayList<>();
    SoftAssert softAssert=new SoftAssert();

    @Given("Kullanici api entpoint {string} gider")
    public void kullanici_api_entpoint_gider(String string) {
        response=given()
                .auth()
                .oauth2(ConfigurationReader.getProperty("token"))
                .contentType(ContentType.JSON)
                .when()
                .get(string)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        //    response.prettyPrint();
        json = response.jsonPath();
    }

    @Given("Kullanıcı tum musteri verilerini alir json'dan pojo'ya aktarir")
    public void kullanıcı_tum_musteri_verilerini_alir_json_dan_pojo_ya_aktarir() throws IOException {
      //1. yol
        listofCustomers = json.getList("$"); // Butun data alindi
        System.out.println("Java List Map response: " + listofCustomers);
        System.out.println("=================");

        //2. yol
//        ObjectMapper objectMapper = new ObjectMapper();
//        customers = objectMapper.readValue(response.asString(), Customer[].class);
//        for (int i = 0; i < customers.length; i++) {
//            System.out.println(customers[i].getFirstName());
//        }
//        System.out.println("************************");
//        for (int i = 0; i < customers.length; i++) {
//            if (customers[i].getUser() != null) {
//                System.out.println(customers[i].getUser().getLastName());
//            }
        }

//        WriteTxtUtil.writeToFile("allCustomerSsn1.txt", customers);
//        List<String> customerSNNList = ReadToText.returnCustomerSNNList("allCustomerSsn1.txt");
//
//        Assert.assertEquals("not verify", allSsn, customerSNNList);
 //   }

    @Given("Kullanıcı tum verileri veri kumesinden doğrular")
    public void kullanıcı_tum_verileri_veri_kumesinden_doğrular() {
        // response.prettyPrint();
        listofCustomers = response.as(ArrayList.class);
        System.out.println(listofCustomers);
//        System.out.println("De-Serialization Data Type : " +listofCustomers);
    }

    @Given("Kullanıcı tum verileri BireBir doğrular")
    public void kullanıcı_tum_verileri_BireBir_doğrular() {
        Integer actualCustomerCount =listofCustomers.size();
        System.out.println(listofCustomers);
        //Assert.assertEquals(listofCustomers,actualCustomerCount);


     /*
//        String firstCustomerName = listofCustomers.get(0).get("firstName").toString();
//        String expectedFirstNameOne = listofCustomers.get(0).get("firstName").toString();
//        Assert.assertEquals(expectedFirstNameOne,firstCustomerName);
//
//        String lastNameOfSecondCustomer= listofCustomers.get(1).get("lastName").toString();
//        String expectedLastNameTwo = listofCustomers.get(1).get("lastName").toString();
//        Assert.assertEquals(expectedLastNameTwo, lastNameOfSecondCustomer);
//
////        country =fifthCustomersCountry();
//        String expectedFifthCountry = json.getString("country[4].name");
//        Assert.assertEquals(expectedFifthCountry,"country");
*/
//

    }

}