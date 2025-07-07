package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.ResultComponent;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage  {

    private  final SelenideElement firstNameInput = $("#firstName"),
             lastNameInput = $("#lastName"),
             userEmailInput = $("#userEmail"),
             clickGender = $("label[for='gender-radio-1']"),
             userNumberInput = $("#userNumber"),
             dateOfBirthInput = $("#dateOfBirthInput"),
             subjectsInput = $("#subjectsInput"),
             hobbiesInput = $("label[for='hobbies-checkbox-1']"),
             pictureInput = $("#uploadPicture"),
             addressInput = $("#currentAddress"),
             stateInput = $("#react-select-3-input"),
             cityInput = $("#react-select-4-input"),
             submitInput = $("#submit");

    CalendarComponent calendarComponent = new CalendarComponent();
    ResultComponent resultComponent = new ResultComponent();

    public RegistrationPage openPage(){
        open("/automation-practice-form");
    return this;
    }
    public RegistrationPage removePage(){
        executeJavaScript("$('footer').remove();");
        executeJavaScript("$('#fixedban').remove();");
        return this;
    }

    public RegistrationPage setFirstName(String value){
        firstNameInput.setValue(value);

        return this;
    }
    public RegistrationPage setLastName(String value){
        lastNameInput.setValue(value);

        return this;
    }
    public RegistrationPage setUserEmail(String value){
        userEmailInput.setValue(value);

        return this;
    }
    public RegistrationPage setGender(){
        clickGender.click();

        return this;
    }
    public RegistrationPage setNumber(String value){
        userNumberInput.setValue(value);

        return this;
    }
    public  RegistrationPage setDateOfBirth(String day, String month, String yaer){
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, yaer);

        return this;
    }
    public RegistrationPage setSubjects(String value){
        subjectsInput.setValue(value).pressEnter();

        return this;
    }
    public RegistrationPage setHobbies(){
        hobbiesInput.click();

        return this;
    }
    public RegistrationPage setPicture(String value){
        pictureInput.uploadFromClasspath(value);

        return this;
    }
    public RegistrationPage setAddress(String value){
        addressInput.setValue(value);
        return this;
    }
    public RegistrationPage setStateAndCity(String state, String city){
        stateInput.setValue(state).pressEnter();
        cityInput. setValue(city).pressEnter();
        return this;
    }
    public RegistrationPage submit(){
        submitInput.click();
        return this;
    }
    public RegistrationPage checkFinalResult(String value){
        resultComponent.verifyResult(value);

        return this;
    }
    public RegistrationPage resultWindow(){
        resultComponent.resultWindow();
        return this;
    }

}
