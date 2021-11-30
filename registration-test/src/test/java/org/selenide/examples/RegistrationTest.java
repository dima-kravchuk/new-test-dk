package org.selenide.examples;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationTest {

    @Test
    public void userRegistration() {

        open("http://automationpractice.com/index.php");
        $(byText("Sign in")).click();

        $(By.name("email_create")).setValue("new_test1@test.com");
        $(By.name("SubmitCreate")).click();

    }
}
