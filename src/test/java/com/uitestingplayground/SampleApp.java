package com.uitestingplayground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SampleApp extends Base{
    private void loginButton(){
        $("#login").shouldBe(visible).click();
    }
    @ParameterizedTest
    @CsvSource({
            "123, pwd, 'Welcome, 123!'",
            "Egor, pwd, 'Welcome, Egor!'",
            "@$!, pwd, 'Welcome, @$!'",
            "'  ', pwd, 'Welcome, !'",
            "admin, admin, 'Invalid username/password'",
            "Hacker, hackPassword, 'Invalid username/password'"
    })
    @DisplayName("Тестируем Sample App")
    public void testSampleApp(String userName, String password, String message){

        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Sample App");
        $("input[placeholder='User Name']").setValue(userName);
        $("input[name='Password']").setValue(password);
        loginButton();
        $("#loginstatus").shouldHave(text(message));
        loginButton();
    }
}
