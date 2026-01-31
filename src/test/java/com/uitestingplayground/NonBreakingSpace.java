package com.uitestingplayground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;

public class NonBreakingSpace extends Base {
    @Test
    @DisplayName("Тестируем Non-Breaking Space")

    public void testNonBreakingSpace(){

        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Non-Breaking Space");
        $x("//button[contains(., 'My') and contains(., 'Button')]").click();
    }
}
