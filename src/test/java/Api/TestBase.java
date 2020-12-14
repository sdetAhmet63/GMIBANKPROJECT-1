package Api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class TestBase {

    protected RequestSpecification specCustomers;
    protected RequestSpecification specCountries;
    protected RequestSpecification specStates;

    //https://www.gmibank.com/api/tp-account-registrations

    @Before
    public void specCustomers(){
        specCustomers=new RequestSpecBuilder().
                setBaseUri("https://www.gmibank.com/api/tp-customers").
                build();
    }
    @Before
    public void specCountries(){
        specCountries=new RequestSpecBuilder().
                setBaseUri("https://www.gmibank.com/api/tp-countries").
                build();
    }
    @Before
    public void specStates(){
        specStates=new RequestSpecBuilder().
                setBaseUri("https://www.gmibank.com/api/tp-states").
                build();
    }



}
