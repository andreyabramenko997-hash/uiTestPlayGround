package com.uitestingplayground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class DisabledInput extends Base{
    @Test
    @DisplayName("Тестируем Disabled Input")

    public void testDisabledInput() {

        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Disabled Input");
        $("#enableButton").shouldBe(visible, Duration.ofSeconds(10)).click();
        $("#inputField").shouldBe(disabled);
        $("#inputField").shouldBe(enabled, Duration.ofSeconds(10)).setValue("InputEnanled");
        $("#opstatus").click();
        $("#opstatus").shouldHave(text("Value changed to: InputEnanled"));

    }
}
