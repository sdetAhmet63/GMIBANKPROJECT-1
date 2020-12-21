package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.Customer;
import utilities.ConfigurationReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;


public class CustomerApiStepDefinition {
/*
    Response response;
    Customer[] customers;

    @Given("user read all customer and sets response using to api end point {string}")
    public void user_read_all_customer_and_sets_response_using_to_api_end_point(String api_endpoint) {
        // End pointe gidip oradan bilgileri çekiyoruz.
        // given için import otomatik gelmiyor kendimiz yazmamız gerekiyor.

        // headers içine yazılan requers(istek) özellikleri belirtiliyor.
        // bu given ile when arasına yazılıyor..
        // Authorization : siteden bilgiyi alabilmek için izin talebi
        // Bearer : düzenli olarak değişen bir token var bu adresi Configuration.properties'e yazdık.
        // When den sonra nereye gideceğimizi yazıyoruz.

        Response response=given().headers(
                    "Authorization",
                   "Bearer " + ConfigurationReader.getProperty("token"),
               //     Bearer yazıp bir boşluk bıraktık önemli.
                    "Content-Type",
                  ContentType.JSON,
                  "Accept",
                  ContentType.JSON)
        .when()
                .get(api_endpoint)
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

    List<String> expectedSsn = new ArrayList<>();

    @Given("user deserialization customer data json to java pojo")
    public void user_deserialization_customer_data_json_to_java_pojo() throws IOException {
      /*  ObjectMapper objectMapper = new ObjectMapper();
        customers = objectMapper.readValue(response.asString(), Customer[].class);
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i].getFirstName());
        }
        System.out.println("************************************");
        for(int j = 0; j < customers.length; j++ ) {
            if (customers[j].getUser()!= null){
                System.out.println(customers[0].getUser().getEmail());
            }
        }



    @Then("user validates all data")
    public void user_validates_all_data() {
    }
*/
}
