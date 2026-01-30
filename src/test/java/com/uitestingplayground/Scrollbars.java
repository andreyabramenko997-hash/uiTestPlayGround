package com.uitestingplayground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Scrollbars extends Base{
    @Test
    @DisplayName("Тестируем Scrollbars")

    public void testScrollbars(){

        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Scrollbars");
        $("#hidingButton").shouldBe(visible, Duration.ofSeconds(10)).click();
    }
}
