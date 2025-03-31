package pageObject.components;

import pageObject.RegistrationPage;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponents {
    public void setData(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("January");
        $(".react-datepicker__year-select").selectOption("2000");
        $(".react-datepicker__day--001").click();
    }
}
