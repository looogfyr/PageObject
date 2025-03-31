package pageObject.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {
    private SelenideElement userName = $("#userName"),
            userEmail = $("#userEmail"),
            currentAddress = $("#currentAddress"),
            permanentAddress = $("#permanentAddress"),
            submitButton = $("#submit"),
            checkInfo = $("#output");

    public TextBoxPage openBox() {
        open("/text-box");

        return this;
    }

    public TextBoxPage setUserName(String value) {
        userName.setValue("Alexey");

        return this;
    }

    public TextBoxPage setUsEmail(String value) {
        userEmail.setValue("AlexGG@BBC.com");

        return this;
    }

    public TextBoxPage setCorrendAddress(String value) {
        currentAddress.setValue("Great Beketov Street");

        return this;
    }

    public TextBoxPage setPermanentAddress(String value) {
        permanentAddress.setValue("Big Gtreat Beketov Street");

        return this;
    }

    public TextBoxPage submitPress() {
        submitButton.click();
        return this;
    }
    public TextBoxPage checkUpData(String value) {
       checkInfo.shouldHave(text(value));
       return this;
    }

}



