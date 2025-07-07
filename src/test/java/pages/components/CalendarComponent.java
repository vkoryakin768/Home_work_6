package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate(String day, String month, String year){
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOption("1996");
        $(".react-datepicker__day--023").click();
    }

}
