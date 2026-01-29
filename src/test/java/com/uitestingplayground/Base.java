package com.uitestingplayground;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class Base {
    @BeforeAll
    static void setup(){
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 5000;
        Configuration.pageLoadTimeout = 5000;
        Configuration.holdBrowserOpen = false;
        Configuration.fastSetValue = false;
        Configuration.clickViaJs = false;

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true).savePageSource(false));
    }

    @AfterEach
    void tearDown(){
//        Selenide.closeWebDriver();
    }


}
