package com.uitestingplayground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class Visibility extends Base{
    @Test
    @DisplayName("Тестируем Visibility")

    public void testVisibility(){

        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Visibility");
        $("#hideButton").shouldBe(visible).click();
        $("#transparentButton").shouldBe(hidden);
        $("#removedButton").shouldBe(hidden);
        $("#invisibleButton").shouldBe(hidden);
        $("#zeroWidthButton").shouldBe(hidden);
        $("#notdisplayedButton").shouldBe(hidden);
        $("#hidingLayer").shouldBe(visible);
        $("#offscreenButton").shouldBe(hidden);

    }

}
