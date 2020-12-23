package stepdefinitions;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.google.common.collect.ImmutableList;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.deploy.util.JVMParameters;
import com.sun.javafx.UnmodifiableArrayList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.json.JSONObject;
import org.w3c.dom.ls.LSOutput;
import pojos.Customer;

import pojos.Us_30;
import utilities.*;

import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.List;

import static io.restassured.RestAssured.given;

public class Us_30StepDefinitions {
    Response response;

    @Given("Kullanici Get request ile api end point {string} den tum kullanici bilgilerini alir")
    public void kullanici_Get_request_ile_api_end_point_den_tum_kullanici_bilgilerini_alir(String string) {
        response = given()
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
        //  response.prettyPrint();
    }



    @Then("Tum kullanici ad soyad ve rolleri pdf formatinda yazdirilabilir olmali")
    public void tum_kullanici_ad_soyad_ve_rolleri_pdf_formatinda_yazdirilabilir_olmali() {

        JsonPath jsonPath = response.jsonPath();

        List<String> firstName = jsonPath.getList("firstName");
        List<String> lastName = jsonPath.getList("lastName");
        List<List<String>> rol = jsonPath.getList("authorities");


        Document document = new Document();
        PdfWriter pdfWriter = null;
        try {
            pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("Isim_Listesi5.pdf"));
        } catch (com.itextpdf.text.DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        document.open();
        try {
            document.add(new Paragraph("Isim_Listesi.pdf"));
        } catch (com.itextpdf.text.DocumentException e) {
            e.printStackTrace();
        }
        PdfPTable table = new PdfPTable(3);
        table.setWidthPercentage(100);
        table.setSpacingBefore(10f);
        table.setSpacingAfter(10f);

        table.addCell("firstName");
        table.addCell("lastName");
        table.addCell("Rol");

        for (int i = 1; i < firstName.size(); i++) {
            table.addCell(firstName.get(i));
            table.addCell(lastName.get(i));
            for (String w: rol.get(i)) {
                table.addCell(w);
            }

        }
        PdfPCell cell = new PdfPCell(new Paragraph());
        cell.setBorderColor(BaseColor.BLACK);
        cell.setPadding(10f);

        try {
            document.add(table);
        } catch (com.itextpdf.text.DocumentException e) {
            e.printStackTrace();
        }
        document.close();
        pdfWriter.close();

    }

}


