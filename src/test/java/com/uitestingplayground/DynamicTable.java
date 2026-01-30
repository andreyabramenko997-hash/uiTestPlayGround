package com.uitestingplayground;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DynamicTable extends Base{
    @Test
    @DisplayName("Тестируем Dynamic Table")

    public void testDynamicTable(){

        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Dynamic Table");
        System.out.println("Ищем Столбец с CPU");
        int columnIndex =
                $$("span[role='columnheader']").texts().indexOf("CPU");
        String cpuValue = $$("div[role='row']")
                .filterBy(text("Chrome")).first()
                .$("span[role='cell']", columnIndex).getText();
        $(".bg-warning").shouldHave(text(cpuValue));

        System.out.println("Значение из таблицы: " + cpuValue);
        System.out.println("Текст в плашке: " + $(".bg-warning").getText());
    }
}
