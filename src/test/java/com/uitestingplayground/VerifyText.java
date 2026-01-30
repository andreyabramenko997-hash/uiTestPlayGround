package com.uitestingplayground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;


public class VerifyText extends Base{
    @Test
    @DisplayName("Тестируем Verify Text")

    public void testVerifyText(){

        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Verify Text");
        $(withText("Welcome UserName!")).shouldBe(visible);
        System.out.println("Текс Welcome UserName! Найден");
    }
}
