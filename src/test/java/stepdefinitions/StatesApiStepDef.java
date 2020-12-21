package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import oracle.jvm.hotspot.jfr.ThreadStates;
import org.testng.asserts.SoftAssert;
import pojos.States;
import utilities.ConfigurationReader;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class StatesApiStepDef {

    Response response01, response02, response03;
    JsonPath json;
    States states01, states02;
    List<Map<String,Object>> allCustomerData;

    String token = ConfigurationReader.getProperty("api_bearer_token");


    @Given("kullanici verilen api end point {string} noktasindaki tum eyalet bilgilerini okur")
    public void kullanici_verilen_api_end_point_noktasindaki_tum_eyalet_bilgilerini_okur(String endpointUrl) {
/*
        response01=given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(endpointUrl)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        //  response.prettyPrint();
        json=response01.jsonPath();


    }

    @Given("kullanici eyalet bilgilerini json dan java pojo ya cevirir")
    public void kullanici_eyalet_bilgilerini_json_dan_java_pojo_ya_cevirir() {
        allCustomerData =json.getList("$"); // butun data list elimizde (key olarak id ve name var)
        System.out.println(allCustomerData);
        // allCustomerData = response.as(ArrayList.class); yukardaki kod ile ayni
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals("Virginia",allCustomerData.get(11).get("name"));
        softAssert.assertAll();


    }
    @Given("kullanici verilen api end point {string} noktasinda verilen eyaleti {string} olusturur")
    public void kullanici_verilen_api_end_point_noktasinda_verilen_eyaleti_olusturur(String endpointUrl, String name) {

        states01 = new States(null, name, null);

        response02 = given().
                contentType(ContentType.JSON).
                auth().oauth2(token).
                when().body(states01).
                post(endpointUrl).
                then().
                contentType(ContentType.JSON).
                extract().
                response();
    }

    @Then("kullanici olusturdugu eyaletlerin data'larini {string} ve {string} ile dogrular")
    public void kullanici_olusturdugu_eyaletlerin_data_larini_ve_ile_dogrular(String id, String name) {
        //response.prettyPrint();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(allCustomerData.toString().contains(name));
        softAssert.assertAll();

 */
    }




}
