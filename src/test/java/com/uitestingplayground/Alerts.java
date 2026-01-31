package com.uitestingplayground;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class Alerts extends Base{
    @Test
    @DisplayName("Тестируем Alerts")

    public void testAlerts(){

        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Alerts");
        $("#alertButton").click();
        confirm("Today is a working day.\nOr less likely a holiday.");
        sleep(1500);
        $("#confirmButton").click();
        confirm("Today is Friday.\nDo you agree?");
        sleep(1500);
        confirm("Yes");
        $("#promptButton").click();
        Selenide.prompt("Choose \"cats\" or 'dogs'.\nEnter your value:", "котики котята");
        sleep(1500);
        confirm("User value: котики котята");


    }
}
