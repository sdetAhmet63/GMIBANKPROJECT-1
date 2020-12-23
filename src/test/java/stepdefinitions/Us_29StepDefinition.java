package stepdefinitions;

import io.cucumber.java.en.Given;
import org.testng.asserts.SoftAssert;
import utilities.DatabaseUtility;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Us_29StepDefinition {
    String url = "jdbc:postgresql://157.230.48.97:5432/gmibank_db";
    String username="techprodb_user";
    String password="Techpro_@126";
    Connection connection; // Veritabanına bağlanmak için kullanacağız.
    Statement statement;   // Query'leri çalıştırmak ve verileri almak için kullanacağız.
    ResultSet resultSet;
    SoftAssert softAssert=new SoftAssert();
    List<String> userSsnNumber = new ArrayList<>();
    List<String> countryList = new ArrayList<>();
    List<String> statesList = new ArrayList<>();
    List<String> employeeNameList = new ArrayList<>();
    List<String> adminNameList = new ArrayList<>();


    @Given("kullanici veritabanina baglanir")
    public void kullanici_veritabanina_baglanir() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

    }

    @Given("kullanici customer verilerine erisim saglar ve {string} assert eder")
    public void kullanici_customer_verilerine_erisim_saglar_ve_assert_eder(String string) throws SQLException {
        resultSet = statement.executeQuery("SELECT * FROM public.tp_customer");
        ResultSetMetaData userMetaData = resultSet.getMetaData();
        int columnCount = userMetaData.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            System.out.println(userMetaData.getColumnName(i));
        }

        while (resultSet.next()) {
            String ssn = resultSet.getString("ssn");
            userSsnNumber.add(ssn);
        }

        System.out.println(userSsnNumber);
        softAssert.assertTrue(userSsnNumber.contains(string));
    }

    @Given("kullanici admin verilerine erisim saglar ve assert eder")
    public void kullanici_admin_verilerine_erisim_saglar_ve_assert_eder() throws SQLException {
        resultSet = statement.executeQuery("SELECT * FROM public.jhi_user");
        ResultSetMetaData userMetaData = resultSet.getMetaData();
        int columnCount = userMetaData.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            System.out.println(userMetaData.getColumnName(i));
        }

        while (resultSet.next()) {
            String adminname = resultSet.getString("first_name");
            adminNameList.add(adminname);
        }

        System.out.println(adminNameList);
        softAssert.assertTrue(adminNameList.contains("team20admin"));
    }

    @Given("kullanici employee verilerine erisim saglar ve assert eder")
    public void kullanici_employee_verilerine_erisim_saglar_ve_assert_eder() throws SQLException {
        resultSet = statement.executeQuery("SELECT * FROM public.jhi_user");
        ResultSetMetaData userMetaData = resultSet.getMetaData();
        int columnCount = userMetaData.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            System.out.println(userMetaData.getColumnName(i));
        }

        while (resultSet.next()) {
            String employeeName = resultSet.getString("first_name");
            employeeNameList.add(employeeName);
        }

        System.out.println(employeeNameList);
        softAssert.assertTrue(employeeNameList.contains("team20employee"));
    }

    @Given("kullanici country verilerine erisim saglar ve assert eder")
    public void kullanici_country_verilerine_erisim_saglar_ve_assert_eder() throws SQLException {
        resultSet = statement.executeQuery("SELECT * FROM public.tp_country");
        ResultSetMetaData userMetaData = resultSet.getMetaData();
        int columnCount = userMetaData.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            System.out.println(userMetaData.getColumnName(i));
        }

        while (resultSet.next()) {
            String countryName = resultSet.getString("name");
            countryList.add(countryName);
        }

        System.out.println(countryList);
        softAssert.assertTrue(countryList.contains("Japan"));
    }

    @Given("kullanici state verilerine erisim saglar ve assert eder")
    public void kullanici_state_verilerine_erisim_saglar_ve_assert_eder() throws SQLException {
        resultSet = statement.executeQuery("SELECT * FROM public.tp_state "); //WHERE name  = 'Washington'
        ResultSetMetaData statesMetaData = resultSet.getMetaData();
        int columnCount = statesMetaData.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            System.out.println(statesMetaData.getColumnName(i));
        }



        while (resultSet.next()) {
            String states = resultSet.getString("id");
            statesList.add(states);
        }

        System.out.println(statesList);
    }


}