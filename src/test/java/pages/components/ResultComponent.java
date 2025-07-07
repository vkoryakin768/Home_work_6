package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ResultComponent {
    private final SelenideElement tableRespons = $(".table-responsive"),
    tableRsult = $(".modal-content");

    public ResultComponent verifyResult(String value) {
        tableRespons.shouldHave(text(value));

        return this;

    }
    public ResultComponent resultWindow(){
        tableRsult.shouldNot(appear);

        return this;
    }
}
