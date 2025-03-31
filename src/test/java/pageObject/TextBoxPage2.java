package pageObject.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage2 {
    private SelenideElement userName = $("#userName"),
            userEmail = $("#userEmail"),
            currentAddress = $("#currentAddress"),
            permanentAddress = $("#permanentAddress"),
            submitButton = $("#submit"),
            checkInfo = $("#output");

    public TextBoxPage2 openBox() {
        open("/text-box");

        return this;
    }

    public TextBoxPage2 setUserName(String value) {
        userName.setValue("Alexey");

        return this;
    }

    public TextBoxPage2 setUsEmail(String value) {
        userEmail.setValue("AlexGG@BBC.com");

        return this;
    }

    public TextBoxPage2 setCorrendAddress(String value) {
        currentAddress.setValue("Great Beketov Street");

        return this;
    }

    public TextBoxPage2 setPermanentAddress(String value) {
        permanentAddress.setValue("Big Gtreat Beketov Street");

        return this;
    }

    public TextBoxPage2 submitPress() {
        submitButton.click();
        return this;
    }
    public TextBoxPage2 checkUpData(String value) {
        checkInfo.shouldHave(text(value));
        return this;
    }

}



