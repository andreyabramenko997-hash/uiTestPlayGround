package com.uitestingplayground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class FileUpload extends Base {
    @Test
    @DisplayName("Тестируем File Upload")

    public void testDragnDrop() {
        File file = new File("src/test/resources/files/test.txt");
        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("File Upload");
        switchTo().frame($("iframe"));
        $("#browse").uploadFile(file);
        executeJavaScript(
                "var source = document.querySelector('#browse');" +
                        "var target = document.querySelector('.upload-box');" +
                        "var event = new CustomEvent('drop');" +
                        "event.dataTransfer = { files: source.files };" +
                        "target.dispatchEvent(event);"
        );
        $(".success-file").shouldHave(text("file(s) selected"));
    }

    @Test
    @DisplayName("Тестируем Upload")

    public void uploadTest() {
        File file = new File("src/test/resources/files/test.txt");
        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("File Upload");
        switchTo().frame($("iframe"));
        $("#browse").should(exist).uploadFile(file);
        $(".success-file").shouldHave(text("file(s) selected"));
    }

}



