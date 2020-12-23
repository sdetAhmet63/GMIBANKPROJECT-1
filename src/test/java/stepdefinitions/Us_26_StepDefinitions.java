package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import utilities.ConfigurationReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Us_26_StepDefinitions {


    Response response;
    Response responseAfterPut;
    JsonPath json;
    List<Map<String,Object>> listOfCountries;
    Map country = new HashMap<String,Object>();

    @Given("api uc noktasini kullanir {string} sayfasina giderek")
    public void api_uc_noktasini_kullanir_sayfasina_giderek(String string) {
        response = given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("token")).
                when().
                get(string);

        // response.prettyPrint();

        json =response.jsonPath();

    }

    @Given("kullaci kac tane country oldugunu bulur")
    public void kullaci_kac_tane_country_oldugunu_bulur() {
        listOfCountries = response.as(ArrayList.class);
        System.out.println("Nb of countries :" + listOfCountries.size());

    }

    @Given("kullanici endpoint {string} put request gondererek ilk country i {string} olarak gunceller")
    public void kullanici_endpoint_put_request_gondererek_ilk_country_i_olarak_gunceller(String endpoint, String replaceContry) {




        Map<String, Object> putBody = new HashMap<>();

        putBody.put("id", 1);
        putBody.put("name", replaceContry );
        putBody.put("states",null);

        Response responsePut = given().
                contentType(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("token")).
                body(putBody).
                when().
                put(endpoint);

        responsePut.prettyPrint();

        responsePut.
                then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON);


    }

    @Then("kullanici country'nin guncellendigini kontrol eder")
    public void kullanici_country_nin_guncellendigini_kontrol_eder() {

        String url = "https://www.gmibank.com/api/tp-countries/1";
        Response responseAfterPut = given().
                contentType(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("token")).
                when().
                get(url);
        responseAfterPut.
                then().
                statusCode(200).
                contentType(ContentType.JSON);
        JsonPath jsonPath = responseAfterPut.jsonPath();
        String county = jsonPath.getString("name");
        Assert.assertEquals(county, "Netherlands");


    }




}





