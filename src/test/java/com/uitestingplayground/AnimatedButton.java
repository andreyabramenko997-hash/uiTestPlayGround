package com.uitestingplayground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AnimatedButton extends Base{
    @Test
    @DisplayName("Тестируем Animated Button")

    public void testAnimatedButton(){

        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Animated Button");
        $("#animationButton").shouldBe(visible, Duration.ofSeconds(10)).click();
        $(byText("Animation done")).shouldBe(visible, Duration.ofSeconds(10));
        $("#movingTarget").shouldNotHave(cssClass("spin"), Duration.ofSeconds(10)).click();
    }
}
