package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.*;

public class ApiOrnek {

    @Given("user read all customer and sets response using to api end point {string}")
    public void user_read_all_customer_and_sets_response_using_to_api_end_point(String string) {
        Response response=given()
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
        response.prettyPrint();
    }

    @Given("user deserialization customer data json to java pojo")
    public void user_deserialization_customer_data_json_to_java_pojo() {

    }

    @Then("user validates all data")
    public void user_validates_all_data() {

    }


}
