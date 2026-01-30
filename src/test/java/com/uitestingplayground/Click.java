package com.uitestingplayground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Click extends Base{
    @Test
    @DisplayName("Тестируем Click")

    public void testClick(){

        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Click");

        $("#badButton.btn-primary").shouldBe(visible, Duration.ofSeconds(5)).click();
        $(".btn-success").shouldBe(visible,Duration.ofSeconds(5));

    }
}
