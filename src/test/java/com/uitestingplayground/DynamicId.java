package com.uitestingplayground;

import org.junit.jupiter.api.RepeatedTest;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class DynamicId extends Base {
    @RepeatedTest(5)
    void run(){
        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Dynamic ID");
        $(byText("Button with Dynamic ID")).shouldBe(visible,enabled).click();


    }


}
