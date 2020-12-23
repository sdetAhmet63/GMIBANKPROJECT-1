package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.asserts.SoftAssert;
import pojos.Customer;
import utilities.ConfigurationReader;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.*;
public class Us_25StepDefinition {
    Response response;
    Customer[] customers;
    static int id;
    JsonPath jsonPath;
    JSONObject jsonObject=new JSONObject();
    List<String> stateList=new ArrayList<>();
    List<String> countryList=new ArrayList<>();
    SoftAssert softAssert=new SoftAssert();

    @Given("kullanici tum country bilgilerini okuyarak sayfasina giderek {string}")
    public void kullanici_tum_country_bilgilerini_okuyarak_sayfasina_giderek(String string) {
        response =given().auth()
                .oauth2(ConfigurationReader.getProperty("token"))
                .contentType(ContentType.JSON)
                .when()
                .get(string)
                .then()
                .contentType(ContentType.JSON)
                .statusCode(200)
                .extract()
                .response();
        response.prettyPrint();
    }

    @Given("kullanici {string} ulkesini olusturur ve asser eder")
    public void kullanici_ulkesini_olusturur_ve_asser_eder(String string)  {
        jsonObject.put("name",string);
        //jsonObject.put("states","Aukland");
        countryList=response.as(ArrayList.class);
        int countrysize=countryList.size();
        response=given()
                .contentType(ContentType.JSON)
                .auth().oauth2(ConfigurationReader.getProperty("token"))
                .body(jsonObject.toString())
                .when().post(ConfigurationReader.getProperty("api_countries"));
        response=given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("token")).
                when().
                get(ConfigurationReader.getProperty("api_countries"));
        countryList=response.as(ArrayList.class);
        int countrysize1=countryList.size();
        softAssert.assertTrue(countrysize!=countrysize1);
        softAssert.assertTrue(countryList.contains(string));
        System.out.println(countryList);
        System.out.println(countrysize);
        System.out.println(countrysize1);
    }

}
