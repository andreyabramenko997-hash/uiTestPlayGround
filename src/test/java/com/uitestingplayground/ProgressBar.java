package com.uitestingplayground;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import java.time.Duration;

import static com.codeborne.selenide.ClickOptions.usingJavaScript;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProgressBar extends Base {
    @RepeatedTest(5)
    @DisplayName("Тестируем Progress Bar")
    public void testProgressBar(){

    UiPlayGround uiPlayGround = new UiPlayGround();

    uiPlayGround.openPage();
    uiPlayGround.stringChallenge("Progress Bar");
    $("#startButton").shouldBe(visible, Duration.ofSeconds(10)).click();
    $("#progressBar").shouldHave(text("75%"),Duration.ofSeconds(50));
     Configuration.pollingInterval = 1;
    $("#stopButton").click(usingJavaScript());
    $("#result").shouldHave(text("Result: 0"));
}}
