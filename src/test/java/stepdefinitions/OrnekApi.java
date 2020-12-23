package stepdefinitions;

import io.restassured.response.Response;
import io.restassured.response.Response.*;
import pojos.Customer;

​public class OrnekApi1{
    Response response;
    Customer[] customers;
    static int id;
    JsonPath jsonPath;
    JSONObject jsonObject=new JSONObject();
    List<String> stateList=new ArrayList<>();
    SoftAssert softAssert=new SoftAssert();

    @Given("kullanici tum musteri bilgilerini okur sayfasina giderek {string}")
    public void kullanici_tum_musteri_bilgilerini_okur_sayfasina_giderek(String string) {
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
    @Given("kullanici {string}  kayitli musteriyi bulur")
    public void kullanici_kayitli_musteriyi_bulur(String string) throws IOException {
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

    @Then("kullanici adrese gider {string} ssn {string} numarasi  {string} ile  assert yapar")
    public void kullanici_adrese_gider_ssn_numarasi_ile_assert_yapar(String string, String string2, String string3) {
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
    @Then("kullanici country assert {string} eder")
    public void kullanici_country_assert_eder(String string) {
        jsonPath=response.jsonPath();
        //firstname value larini list halinde return eder
        List<Integer> listid=jsonPath.getList("id");
        System.out.println(listid);
        //country icindeki name value larini list hainde return eder
        List<String> listname=jsonPath.getList("name");
        System.out.println(listname);
        List<String> liststates=jsonPath.getList("states");
        System.out.println(liststates);

        Assert.assertTrue("name kaydi yok",listname.contains(string));
}
    @Then("kullanici state {string} aseert eder")
    public void kullanici_state_aseert_eder(String string) {
        jsonPath=response.jsonPath();
        //firstname value larini list halinde return eder
        List<Integer> listid = jsonPath.getList("id");
        System.out.println(listid);
//        //states icindeki name value larini list hainde return eder
        List<String> listname = jsonPath.getList("name");
        System.out.println(listname);
        List<String> listtpcountry = jsonPath.getList("tpcountry");
        System.out.println(listtpcountry);
        Assert.assertTrue("state kayitli degil", listname.contains(string));
}

    @Given("kullanici state bilgilerini okur sayfasina giderek {string}")
    public void kullanici_state_bilgilerini_okur_sayfasina_giderek(String string) {
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

    @Given("kullanici yeni  bir  state olusturur {string} ve assert eder")
    public void kullanici_yeni_bir_state_olusturur_ve_assert_eder(String string) {
        jsonObject.put("name",string);
        stateList=response.as(ArrayList.class);
        int statesize=stateList.size();

        response=given()
                .contentType(ContentType.JSON)
                .auth().oauth2(ConfigurationReader.getProperty("token"))
                .body(jsonObject)
                .when().post(ConfigurationReader.getProperty("api_states"));

        response=         given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigurationReader.getProperty("token")).
                when().
                get(ConfigurationReader.getProperty("api_states"));

        stateList=response.as(ArrayList.class);
        int statesize1=stateList.size();
        softAssert.assertTrue(statesize!=statesize1);
        softAssert.assertTrue(stateList.contains(string));
        System.out.println(stateList);
        System.out.println(statesize);
        System.out.println(statesize1);
    }
}