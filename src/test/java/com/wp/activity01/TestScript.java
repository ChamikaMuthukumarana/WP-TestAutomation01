package com.wp.activity01;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeOptions;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TestScript extends TestSteps {


    @BeforeMethod
    public void setUp() {

        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        open("https://demoqa.com/");

        executeJavaScript("window.scrollTo(0, document.body.scrollHeight)");
        sleep(3000);

      //  Objects.btn_Elements.click();

    }

    //Validate the 'Text Box' form submission
    @Test
    public void ValidateTheTextBox() {
        TexBoxSubmission();


    }
    //Verify checkbox selection
    @Test
    public void VerifyCheckboxSelection() {
        CheckBoxSelection();

    }
    //Validate the 'Radio Button' functionality
    @Test
    public void ValidateTheRadioButton() {
        ValidateRadioButton();

    }
    //Test 'Buttons' page for button clicks
    @Test
    public void ValidateTheButtons() {
        ValidateButtons();

    }
    //Validate the date picker functionality
    @Test
    public void ValidateDatePicker() {
        ValidateTheDatePicker();

    }
    //Verify the 'Modal Dialogs' functionality
    @Test
    public void ValidateModelDialog() {
        ValidateTheModelDialogs();

    }
    //Verify the Link Redirection
    @Test
    public void ValidateLinkRedirection() {
        ValidateTheLinkRedirection();

    }
}
