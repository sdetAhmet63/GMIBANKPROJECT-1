package stepdefinitions;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import pojos.Country;
import pojos.Customer;
import pojos.User;
import utilities.ConfigurationReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;


public class Us_23_StepDefinitions<Employee> {


    Response response;
    Customer[] customers;
    User [] users;
    static int id;
    JsonPath jsonPath;
    JSONObject jsonObject = new JSONObject();
    List<String> stateList = new ArrayList<>();
    SoftAssert softAssert = new SoftAssert();




    @Given("kullanici tum user bilgilerini bulundugu {string} sayfasina gider")
    public void kullanici_tum_user_bilgilerini_bulundugu_sayfasina_gider(String string) {
        response
                =given().auth()
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

    @Given("kullanici {string}  kayitli userleri bulur")
    public void kullanici_kayitli_userleri_bulur(String string) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        customers = objectMapper.readValue(response.asString(), Customer[].class);
        for (int i = 0; i < customers.length; i++) {
            if(customers[i].getSsn().equals(string)){
                System.out.println(customers[i].getFirstName());
                System.out.println(customers[i].getId());
                id=customers[i].getId();
            }
        }
    }



    @Then("kullanici user adrese gider {string} ssn {string} numarasi  {string} ile  assert yapar")
    public void kullanici_user_adrese_gider_ssn_numarasi_ile_assert_yapar(String string, String string2, String string3) {
        response=given().auth()
                .oauth2(ConfigurationReader.getProperty("token"))
                .contentType(ContentType.JSON)
                .when()
                .get(string+"/"+id);

        response.prettyPrint();
        response.
                then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                body(string2, Matchers.equalTo(string3));
    }



    @Given("kullanici tum employee bilgilerini bulundugu {string} sayfasina gider")
    public void kullanici_tum_employee_bilgilerini_bulundugu_sayfasina_gider(String string) {
        response
                =given().auth()
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

    @Given("kullanici {string}  kayitli employee bulur")
    public void kullanici_kayitli_employee_bulur(String string) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        customers = objectMapper.readValue(response.asString(), Customer[].class);
        for (int i = 0; i < customers.length; i++) {
            if(customers[i].getSsn().equals(string)){
                System.out.println(customers[i].getFirstName());
                System.out.println(customers[i].getId());
                id=customers[i].getId();
            }
        }
    }

    @Then("kullanici employee adrese gider {string} ssn {string} numarasi  {string} ile  assert yapar")
    public void kullanici_employee_adrese_gider_ssn_numarasi_ile_assert_yapar(String string, String string2, String string3) {
        response = given().auth()
                .oauth2(ConfigurationReader.getProperty("token"))
                .contentType(ContentType.JSON)
                .when()
                .get(string + "/" + id);

        response.prettyPrint();
        response.
                then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                body(string2, Matchers.equalTo(string3));

    }


     @Given("kullanici tum musteri bilgilerini bulundugu {string} sayfasina gider")
     public void kullanici_tum_musteri_bilgilerini_bulundugu_sayfasina_gider(String string) {
         response
                 =given().auth()
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

    @Given("kullanici {string}  kayitli musteri bulur")
    public void kullanici_kayitli_musteri_bulur(String string) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        customers = objectMapper.readValue(response.asString(), Customer[].class);
        for (int i = 0; i < customers.length; i++) {
            if(customers[i].getSsn().equals(string)){
                System.out.println(customers[i].getFirstName());
                System.out.println(customers[i].getId());
                id=customers[i].getId();
            }
        }
    }

    @Then("kullanici musteri adrese gider {string} ssn {string} numarasi  {string} ile  assert yapar")
    public void kullanici_musteri_adrese_gider_ssn_numarasi_ile_assert_yapar(String string, String string2, String string3) {
        response=given().auth()
                .oauth2(ConfigurationReader.getProperty("token"))
                .contentType(ContentType.JSON)
                .when()
                .get(string+"/"+id);

        response.prettyPrint();
        response.
                then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                body(string2, Matchers.equalTo(string3));

    }
}