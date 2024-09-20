package com.wp.activity01;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.conditions.Visible;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.Objects;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TestSteps {

    PG_Objects Objects = new PG_Objects();
    Object driver;
    JavascriptExecutor jse = (JavascriptExecutor)driver;

    @BeforeTest
    public void setUpAll() {
        Configuration.timeout = 60000;
        Configuration.browserSize = "1366x768";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }


    @Step("Validate the Tex box submissions")
    public void TexBoxSubmission(){
        Objects.btn_Elements.click();
        Objects.btn_TextBox.click();
        Objects.inputUserName.sendKeys("John Doe");
        Objects.inputUserEmail.sendKeys("john@example.com");
        Objects.textareaCurrentAddress.sendKeys("123 Street, City");
        Objects.textareaPermanentAddress.sendKeys("'456 Avenue, City");
        executeJavaScript("window.scrollTo(0, document.body.scrollHeight)");

        Objects.buttonSubmit.click();
    }

    @Step("Verify checkbox selection")
    public void CheckBoxSelection(){
        Objects.btn_Elements.click();
        Objects.btn_CheckBox.click();
        Objects.btn_ExpandArrow.click();
        Objects.lbl_Desktop.click();
        Objects.lbl_VerifyDesktop.shouldBe(visible);

    }

    @Step("Validate the 'Radio Button' functionality")
    public void ValidateRadioButton(){
        Objects.btn_Elements.click();
        Objects.btn_RadioButton.click();
        Objects.btn_RadioBYes.click();
        Objects.lbl_YesButtonSelected.shouldBe(visible);

    }

    @Step("Test 'Buttons' page for button clicks")
    public void ValidateButtons(){
        Objects.btn_Elements.click();
        Objects.btn_Buttons.click();
        Objects.btn_DoubleClickMe.doubleClick();
        Objects.lbl_DoubleClickMe.shouldBe(visible);
        Objects.btn_ClickMe.click();
        Objects.lbl_ClickMe.shouldBe(visible);

    }

    @Step("Validate the date picker functionality")
    public void ValidateTheDatePicker(){
        Objects.btn_Widgets.click();
        Objects.btn_DatePicker.click();
        Objects.lbl_InputDate.doubleClick();
        Objects.lbl_SelectDate.click();
        Objects.lbl_verifyDate.shouldBe(visible);

    }

    @Step("Verify the 'Modal Dialogs' functionality")
    public void ValidateTheModelDialogs(){
        Objects.btn_AlertFrameWindow.click();
        Objects.btn_ModalDialog.click();
        Objects.btn_SmallModal.click();
        Objects.btn_CloseInModel.shouldBe(visible);
        Objects.btn_CloseInModel.click();

    }

    @Step("Verify the Link Redirection")
    public void ValidateTheLinkRedirection(){
        Objects.btn_Elements.click();
        Objects.btn_Links.click();
        Objects.lnk_Home.click();

    }


}
