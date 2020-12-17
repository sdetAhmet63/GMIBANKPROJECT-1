package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions (  //Framwork ile ilgili bilgi ve seçeklerin eklendiği bölüm

        plugin = {"html:target/default-cucumber-reports",  //html rapor alır
                "json:target/json-reports/cucumber.json" ,  // json olarak rapor alır
                "junit:target/xml-report/cucumber.xml"},// junitolarak Rapor alır

        features = "src/test/resources/features",  // Feautures class'ın adresi
        glue = "stepdefinitions", // testlerinin içerisinde olduğu paketin ismi
        tags = "@gmi_bank", // Sectiğimiz taga ait testleri çalıştırır
        dryRun = false

)


public class Us_013_014Runner {
}
