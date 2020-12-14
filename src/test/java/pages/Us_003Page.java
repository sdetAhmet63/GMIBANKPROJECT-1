package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Us_003Page {




        public Us_003Page(){
            PageFactory.initElements(Driver.getDriver(),this);
        }


        @FindBy(id = "firstPassword")
        public WebElement firstPasswordTextbox;

        @FindBy(xpath = "//li[@class='point']")
        public List<WebElement> colorLevel;
    }

