package com.uitestingplayground;

import com.codeborne.selenide.ex.UIAssertionError;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HiddenLayers {

    @Test
    public void runHiddenLayers(){
        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Hidden Layers");
        $("#greenButton").shouldBe(visible, Duration.ofSeconds(5)).click();
        $("#blueButton").shouldBe(visible).click();
        assertThrows(UIAssertionError.class, () -> {
            $("#greenButton").click();
        });

    }
}
