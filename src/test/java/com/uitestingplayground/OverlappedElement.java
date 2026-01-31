package com.uitestingplayground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$x;

public class OverlappedElement extends Base{
    @Test
    @DisplayName("Тестируем Overlapped Element")

    public void testOverlappedElement(){

        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Overlapped Element");
        $x("//*[@id=\"id\"]").setValue("1567");
        $x("//*[@id=\"name\"]").scrollIntoView(true).setValue("name").shouldHave(value("name"));
    }
}
