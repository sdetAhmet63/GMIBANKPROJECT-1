package stepdefinitions;

import com.google.gson.JsonObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.checkerframework.checker.units.qual.C;
import org.json.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.asserts.SoftAssert;
import pojos.Customer;
import utilities.ConfigurationReader;




import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;

public class us_24ApiStepdefinition {
    Response response;
    Customer[] customers;
    static int id;
    JsonPath jsonPath;
    JSONObject jsonObject=new JSONObject();
    List<String> stateList=new ArrayList<>();
    List<String> countryList=new ArrayList<>();
    SoftAssert softAssert=new SoftAssert();


    @Given("kullanici state bilgileri {string} gider")
    public void kullanici_state_bilgileri_gider(String string) {
        response=given().
                accept(ContentType.JSON).
                auth().
                oauth2(ConfigurationReader.getProperty("token")).
                when().get(ConfigurationReader.getProperty("api_states"));

    }
    @Given("kullanici oncelikle state listesinin boyutunu bulur")
    public void kullanici_oncelikle_state_listesinin_boyutunu_bulur() {
        stateList = response.as(ArrayList.class);
        int stateSize=stateList.size();
        System.out.println(stateSize);


    }
    @Given("kullanici yeni bir state {string} olusturur")
    public void kullanici_yeni_bir_state_olusturur(String string) {
        jsonObject.put("name",string);
        response=given().
                contentType(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("token")).
                body(jsonObject.toString()).
                when().
                post(ConfigurationReader.getProperty("api_states"));
        response= given().
                accept(ContentType.JSON).
                auth().
                oauth2(ConfigurationReader.getProperty("token")).
                when().
                get(ConfigurationReader.getProperty("api_states"));

    }
    @Then("kullanici yeni state olusturdugunu dogrular")
    public void kullanici_yeni_state_olusturdugunu_dogrular() {
        stateList=response.as(ArrayList.class);
        int stateSize=stateList.size();
        int stateSize1=stateList.size();
        softAssert.assertTrue(stateSize!=stateSize1);
        System.out.println(stateList);
        System.out.println(stateSize);
        System.out.println(stateSize1);







    }






}
