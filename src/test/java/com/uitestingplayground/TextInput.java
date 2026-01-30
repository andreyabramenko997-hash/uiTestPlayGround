package com.uitestingplayground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class TextInput extends Base{
    @DisplayName("Тестируем Text Input")
    @ParameterizedTest
    @CsvSource({
       "Test, Test",
       "Hello, Hello",
       "919, 919",
       "#@#$, #@#$",
       "Dlinnoe Predlojenie S Probelami, Dlinnoe Predlojenie S Probelami"
    })

    public void testTextInput(String inputData, String dataVisible){
        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Text Input");
        $("#newButtonName").shouldBe(visible, Duration.ofSeconds(5)).setValue(inputData);
        $("#updatingButton").shouldBe(visible).click();
        $("#updatingButton").shouldHave(text(dataVisible));

    }
}
