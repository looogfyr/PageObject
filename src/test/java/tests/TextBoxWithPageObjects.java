package tests;

import org.junit.jupiter.api.Test;
import pageObject.components.TextBoxPage;

import static com.codeborne.selenide.Selenide.sleep;

public class TextBoxWithPageObjects extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void textBoxWithPageObject() {
    textBoxPage.openBox()
               .setUserName("Alexey")
               .setUsEmail("AlexGG@BBC.com")
               .setCorrendAddress("Great Beketov Street")
               .setPermanentAddress("Big Gtreat Beketov Street")
               .submitPress()

               .checkUpData("Alexey")
               .checkUpData("AlexGG@BBC.com")
               .checkUpData("Great Beketov Street")
               .checkUpData("Big Gtreat Beketov Street");
    }
}
