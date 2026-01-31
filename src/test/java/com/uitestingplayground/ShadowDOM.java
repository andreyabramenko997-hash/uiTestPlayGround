package com.uitestingplayground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class ShadowDOM extends Base{
    @Test
    @DisplayName("Тестируем Shadow DOM")

    public void testShadowDOM() throws UnsupportedFlavorException, IOException {

        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Shadow DOM");
        executeJavaScript("document.querySelector('guid-generator').shadowRoot.querySelector('#buttonGenerate').click()");
        executeJavaScript("document.querySelector('guid-generator').shadowRoot.querySelector('#buttonCopy').click()");
        String siteText = executeJavaScript(
                "return document.querySelector('guid-generator').shadowRoot.querySelector('#editField').value"
        );
        System.out.println("В буфере:" + siteText);

}
    }