package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxComponent {
    private final SelenideElement nameResuit = $("#output #name"),
            emailResuit = $("#output #email"),
            currentAddressResuit = $("#output #currentAddress"),
            permanentAddressResuit = $("#output #permanentAddress");


    public TextBoxComponent resultName(String value){
        nameResuit.shouldHave(text(value));

        return this;
    }
    public TextBoxComponent resultEmail(String value){
        emailResuit.shouldHave(text(value));

        return this;
    }
    public TextBoxComponent resultCurrentAddress(String value){
        currentAddressResuit.shouldHave(text(value));

        return this;
    }
    public TextBoxComponent resultPermanentAddress(String value){
        permanentAddressResuit.shouldHave(text(value));

        return this;
    }
}
