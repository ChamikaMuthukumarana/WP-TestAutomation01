package com.wp.activity01;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// page_url = https://demoqa.com/
public class PG_Objects {

    public SelenideElement btn_Elements = $x("//h5[text()='Elements']");

    public SelenideElement btn_TextBox = $x("//span[text()='Text Box']");

    public SelenideElement inputUserName = $x("//*[@id='userName']");

    public SelenideElement inputUserEmail = $x("//*[@id='userEmail']");

    public SelenideElement textareaCurrentAddress = $x("//*[@id='currentAddress']");

    public SelenideElement textareaPermanentAddress = $x("//*[@id='permanentAddress']");

    public SelenideElement buttonSubmit = $x("//*[@id='submit']");

    public SelenideElement btn_CheckBox = $x("//span[text()='Check Box']");

    public SelenideElement lbl_Desktop = $x("//span[text()='Desktop']");

    public SelenideElement lbl_VerifyDesktop = $x("//div[@id='result']//following-sibling::span[text()='desktop']");

    public SelenideElement btn_ExpandArrow = $x("//*[@id='tree-node']/ol/li/span/button");

    public SelenideElement btn_RadioButton = $x("//span[text()='Radio Button']");

    public SelenideElement btn_RadioBYes = $x("//label[@for='yesRadio']");

    public SelenideElement lbl_YesButtonSelected = $x("//p[text()='You have selected ']");

    public SelenideElement btn_Buttons = $x("//span[text()='Buttons']");

    public SelenideElement btn_DoubleClickMe = $x("//button[text()='Double Click Me']");

    public SelenideElement lbl_DoubleClickMe = $x("//p[text()='You have done a double click']");

    public SelenideElement btn_ClickMe = $x("//button[text()='Click Me']");

    public SelenideElement lbl_ClickMe = $x("//p[text()='You have done a dynamic click']");

    public SelenideElement btn_Widgets = $x("//h5[text()='Widgets']");

    public SelenideElement btn_DatePicker = $x(" //span[text()='Date Picker']");

    public SelenideElement lbl_InputDate = $x(" //input[@id='datePickerMonthYearInput']");

    public SelenideElement lbl_SelectDate = $x("  //div[text()='15']");

    public SelenideElement lbl_verifyDate = $x("  //div[text()='15']");

    public SelenideElement btn_AlertFrameWindow = $x(" //h5[text()='Alerts, Frame & Windows']");

    public SelenideElement btn_ModalDialog = $x("//span[text()='Modal Dialogs']");

    public SelenideElement btn_SmallModal = $x("//button[text()='Small modal']");

    public SelenideElement btn_CloseInModel = $x("//button[text()='Close']");

    public SelenideElement btn_Links = $x("//span[text()='Links']");

    public SelenideElement lnk_Home = $x("//a[@id='simpleLink' and text()='Home']");


}
