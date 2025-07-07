package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TextBoxPage {
    private final SelenideElement userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            submitInput = $("#submit");

    public TextBoxPage openForm(){
        open("/text-box");

        return this;
    }
    public TextBoxPage removePage() {
        executeJavaScript("$('footer').remove();");
        executeJavaScript("$('#fixedban').remove();");
        return this;
    }

    public TextBoxPage setName(String value){
        userNameInput.setValue(value);

        return this;
    }
    public TextBoxPage setEmail(String value){
        userEmailInput.setValue(value);

        return this;
    }
    public TextBoxPage setCurrentAddress(String value){
        currentAddressInput.setValue(value);

        return this;
    }
    public TextBoxPage setPermanentAddress(String value){
        permanentAddressInput.setValue(value);

        return this;
    }
    public TextBoxPage clickSubmit(){
        submitInput.click();

        return this;
    }
}
