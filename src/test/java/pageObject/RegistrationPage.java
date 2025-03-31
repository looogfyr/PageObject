package pageObject;

import com.codeborne.selenide.SelenideElement;
import pageObject.components.CalendarComponents;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class RegistrationPage {

    private SelenideElement firstNameInput = $("#firstName"),

    lastNameInput = $("#lastName"),

    userEmailInput = $("#userEmail"),

    genderWrapper = $("#genterWrapper"),

    userNumberInput = $("#userNumber"),

    calendarInput = $("#dateOfBirthInput"),

    subjectSet = $("#subjectsInput"),

    setHobby = $("#hobbiesWrapper"),

    setPicture = $("#uploadPicture"),

    setAdress = $("#currentAddress"),

    setState = $("#react-select-3-input"),

    setCity = $("#react-select-4-input"),

    submitRegistration = $("#submit"),

    resultDialog = $(".modal-content") ;


    CalendarComponents calendarComponents = new CalendarComponents();


    public RegistrationPage openPage() {
        open("/automation-practice-form");

        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setEmail(String value) {
        userEmailInput.setValue(value);

        return this;

    }

    public RegistrationPage setGender(String value) {
        genderWrapper.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public RegistrationPage setDataOfBirth(String day, String month, String year) {
        calendarInput.click();
        calendarComponents.setData(day, month, year);

        return this;
    }

    public RegistrationPage setSubjects(String value) {
        subjectSet.setValue("Computer Science").pressEnter();

        return this;
    }

    public RegistrationPage setHobby(String value) {
        setHobby.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setPicture(String value) {
        setPicture.uploadFromClasspath("gomer.png");

        return this;
    }

    public RegistrationPage setAdress(String value) {
        setAdress.setValue(value);

        return this;
    }

    public RegistrationPage setState(String value) {
        setState.setValue("Rajasthan").pressEnter();

        return this;
    }

    public RegistrationPage setCity(String value) {
        setCity.setValue("Jaiselmer").pressEnter();

        return this;
    }
    public RegistrationPage submitRegistration() {
        submitRegistration.scrollTo().click();

        return this;
    }
    public RegistrationPage checkRegistrationResult(String key, String value) {
        $(".table-responsive").$(byText(key)).parent().shouldHave(text(value));
    return this;
    }
    public void chechInvalidResult(){
        resultDialog.shouldNot(appear);
    }

}
