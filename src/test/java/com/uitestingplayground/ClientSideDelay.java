package com.uitestingplayground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ClientSideDelay extends Base {
    @Test
    @DisplayName("Тестируем Client Side Delay")
    public void testClientSideDelay(){
        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Client Side Delay");
        $("#ajaxButton").shouldBe(visible, Duration.ofSeconds(10)).click();
        $(byText("Data calculated on the client side.")).shouldBe(visible,Duration.ofSeconds(30));

    }
}
