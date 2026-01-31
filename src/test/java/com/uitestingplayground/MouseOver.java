package com.uitestingplayground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MouseOver extends Base {
    @Test
    @DisplayName("Тестируем Mouse Over")

    public void testMouseOver(){

        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Mouse Over");
        $("a[title='Click me']").doubleClick();
        $("#clickCount").shouldBe(visible).shouldHave(text("2"));
       for (int a =0; a < 5; a++) {
           $("a[title='Link Button']").click();}
       $("#clickButtonCount").shouldBe(visible).shouldHave(text("5"));


    }
}
