package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pageObject.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistredWithPageObject extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void registredWithPageObject() {
            registrationPage.openPage()
                    .setFirstName("Alexey")
                    .setLastName("Dubinin")
                    .setEmail("alexdubinin88@gmail.com")
                    .setGender("Male")
                    .setNumber("6061201200")
                    .setDataOfBirth("01", "january", "2000")
                    .setSubjects("Computer Science")
                    .setHobby("Sports")
                    .setHobby("Music")
                    .setPicture("gomer.png")
                    .setAdress("Chita, st.Beketov 25, kv.28")
                    .setState("Rajasthan")
                    .setCity("Jaiselmer")
                    .submitRegistration()

                    .checkRegistrationResult("Student Name", "Alexey Dubinin")
                    .checkRegistrationResult("Student Email", "alexdubinin88@gmail.com")
                    .checkRegistrationResult("Gender", "Male")
                    .checkRegistrationResult("Mobile", "6061201200")
                    .checkRegistrationResult("Date of Birth", "01 January,2000")
                    .checkRegistrationResult("Subjects", "Computer Science")
                    .checkRegistrationResult("Hobbies", "Sports, Music")
                    .checkRegistrationResult("Picture", "gomer.png")
                    .checkRegistrationResult("Address", "Chita, st.Beketov 25, kv.28")
                    .checkRegistrationResult("State and City", "Rajasthan Jaiselmer");
        }

        @Test
        void registredWithMinimalPageObject() {
            registrationPage.openPage()
                    .setFirstName("Alexey")
                    .setLastName("Dubinin")
                    .setEmail("alexdubinin88@gmail.com")
                    .setGender("Male")
                    .setNumber("6061201200")
                    .setDataOfBirth("01", "january", "2000")
                    .submitRegistration()

                    .checkRegistrationResult("Student Name", "Alexey Dubinin")
                    .checkRegistrationResult("Student Email", "alexdubinin88@gmail.com")
                    .checkRegistrationResult("Gender", "Male")
                    .checkRegistrationResult("Mobile", "6061201200")
                    .checkRegistrationResult("Date of Birth", "01 January,2000");
                    }

        @Test
        void negativeRegistredWithPageObject() {
            registrationPage.openPage()
                    .setFirstName("Alexey")
                    .setLastName("Dubinin")
                    .setEmail("alexdubinin88@gmail.com")
                    .setGender("Male")
                    .setNumber("analytical")
                    .setDataOfBirth("01", "january", "2000")
                    .submitRegistration()
                    .chechInvalidResult();
        }

}