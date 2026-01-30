package com.uitestingplayground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.confirm;

public class ClassAttribute extends Base {
    @Test
    @DisplayName("Тестируем Class Attribute")
    public void runClassAttribute(){
        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Class Attribute");
        $(".btn-success").shouldBe(visible,Duration.ofSeconds(5)).click();
        $(".btn-primary").shouldBe(visible,Duration.ofSeconds(5)).click();
        confirm();
        $(".btn-warning").shouldBe(visible,Duration.ofSeconds(5)).click();

    }
}
