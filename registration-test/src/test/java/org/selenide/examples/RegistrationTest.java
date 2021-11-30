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

        $(By.name("email_create")).setValue("new_test1111111111@test.com");
        $(By.name("SubmitCreate")).click();

        $(By.name("customer_firstname")).setValue("new_test1");
        $(By.name("customer_lastname")).setValue("lastname");
        $(By.name("passwd")).setValue("12345");
        $(By.name("address1")).setValue("Kyiv");
        $(By.name("city")).setValue("Kyiv");
        $(By.name("id_state")).selectOptionByValue("1");
        $(By.name("postcode")).setValue("54321");
        $(By.name("id_country")).selectOptionByValue("21");
        $(By.name("phone_mobile")).setValue("380671234567");
        $(By.name("alias")).setValue("Kyiv");

        $(By.name("submitAccount")).click();
    }
}
