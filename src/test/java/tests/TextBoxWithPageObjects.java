package tests;

import org.junit.jupiter.api.Test;
import pageObject.components.TextBoxPage2;

public class TextBoxWithPageObjects extends TestBase {
    TextBoxPage2 textBoxPage2 = new TextBoxPage2();

    @Test
    void textBoxWithPageObject() {
        textBoxPage2.openBox()
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
