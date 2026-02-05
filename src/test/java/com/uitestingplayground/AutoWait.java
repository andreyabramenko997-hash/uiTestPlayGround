package com.uitestingplayground;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@DisplayName("Тестируем Auto Wait")

public class AutoWait extends Base {
    private void visible(){
        $("#visible").click();
    }
    private void enabled(){
        $("#enabled").click();
    }
    private void editable(){
        $("#editable").click();
    }
    private void onTop(){
        $("#ontop").click();
    }
    private void nonZeroSize(){
        $("#nonzero").click();
    }
    private void apply3s(){
        $("#applyButton3").click();
    }
    private void apply5s(){
        $("#applyButton5").click();
    }
    private void apply10s(){
        $("#applyButton10").click();
    }
    private void element(){
        $("#element-type").click();
    }
    @Test
    @DisplayName("Тестируем Button Enabled")

    public void testEnabled() {

        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Auto Wait");

        System.out.println("Button enabled 5s delay");
        enabled();
        apply5s();
        $("#target").shouldNotBe(enabled);
        $("#target").shouldBe(enabled, Duration.ofSeconds(6)).click();
        $("#opstatus").shouldHave(text("Target clicked."));
        System.out.println("Button enabled");
    }

    @Test
    @DisplayName("Тестируем Button visible")
    void buttonVisible() {

        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Auto Wait");

        System.out.println("Button visible 3s delay");
        visible();
        apply3s();
        $("#target").shouldNotBe(visible);
        $("#target").shouldBe(visible, Duration.ofSeconds(5)).click();
        $("#opstatus").shouldHave(text("Target clicked."));
        System.out.println("Button visible");
    }

    @Test
    @DisplayName("Тестируем Button all checkbox")

    public void allCheckBox() {

        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Auto Wait");

        System.out.println("Button all checkbox 10s delay");
        visible();
        enabled();
        editable();
        onTop();
        nonZeroSize();
        apply10s();
        $("#target").shouldNotBe(visible);
        $("#target").shouldNotBe(enabled);
        $("#target").shouldBe(enabled, Duration.ofSeconds(12)).click();
        $("#opstatus").shouldHave(text("Target clicked."));
        System.out.println("Button clicked");
    }
    @Test
    @DisplayName("Тестируем input")

    public void inputTest() {

        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Auto Wait");

        System.out.println("Тестируем ввод, убираем видимость");
        element();
        $(byText("Input")).click();
        visible();
        apply5s();
        $("#target").shouldNotBe(visible);
        $("#target").shouldBe(visible, Duration.ofSeconds(10)).setValue("Hello!");
        enabled();
        $("#opstatus").shouldHave(text("Text: Hello!"));
        System.out.println("Text: Hello!");

        System.out.println("Тестируем ввод: ввод и редактирование");
        editable();
        apply10s();
        $("#target").shouldNotBe(editable, enabled);
        $("#target").shouldBe(editable, Duration.ofSeconds(15)).setValue("Hello World!");
        enabled();
        $("#opstatus").shouldHave(text("Text: Hello World!"));
        System.out.println("Text: Hello World!");
    }
        @Test
        @DisplayName("Тестируем text area")

        public void testTextArea() {

            UiPlayGround uiPlayGround = new UiPlayGround();

            uiPlayGround.openPage();
            uiPlayGround.stringChallenge("Auto Wait");

            System.out.println("Тестируем поле ввода, убираем видимость");
            element();
            $(byText("Textarea")).click();
            visible();
            apply5s();
            $("#target").shouldNotBe(visible);
            $("#target").shouldBe(visible, Duration.ofSeconds(10)).setValue("Привет!");
            enabled();
            $("#opstatus").shouldHave(text("Text: Привет!"));
            System.out.println("Text: Привет!");

            System.out.println("Тестируем поле ввода: ввод и редактирование");
            editable();
            apply10s();
            $("#target").shouldNotBe(editable, enabled);
            $("#target").shouldBe(editable, Duration.ofSeconds(15)).setValue("Приветствую, пользователь!");
            enabled();
            $("#opstatus").shouldHave(text("Text: Приветствую, пользователь!"));
            System.out.println("Text: Приветствую, пользователь!");
        }
        @Test
        @DisplayName("Тестируем Select")

        public void testSelect(){
            Configuration.pollingInterval = 50;

            UiPlayGround uiPlayGround = new UiPlayGround();

            uiPlayGround.openPage();
            uiPlayGround.stringChallenge("Auto Wait");

            System.out.println("Select enabled 5s delay");
            element();
            $(byText("Select")).click();
            enabled();
            apply5s();
            $("#target").shouldNotBe(enabled);
            $("#target").shouldBe(enabled, visible).pressEnter();
            $(byText("Item 3")).shouldBe(visible).click();
            $("#opstatus").shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("Selected: Item 3"));

            System.out.println("Selected: Item 3");
            editable();
            visible();
            apply3s();
            $("#target").shouldNotBe(editable, visible);
            $("#target").shouldBe(visible, Duration.ofSeconds(6)).pressEnter();
            $(byText("Item 2")).shouldBe(visible).click();
            $("#opstatus").shouldBe(visible, Duration.ofSeconds(10)).shouldHave(text("Selected: Item 2"));
            System.out.println("Selected: Item 2");


    }

    @Test
    @DisplayName("Тестируем label")

    public void labelTest() {

        UiPlayGround uiPlayGround = new UiPlayGround();

        uiPlayGround.openPage();
        uiPlayGround.stringChallenge("Auto Wait");

        System.out.println("Тестируем ввод, убираем видимость");
        element();
        $(byText("Label")).click();
        visible();
        apply10s();
        $("#target").shouldNotBe(visible);
        $("#target").shouldBe(visible, Duration.ofSeconds(15));
        enabled();
        $("#opstatus").shouldHave(text("Target element state restored."));
        System.out.println("Label найден");

        System.out.println("Тестируем label");
        editable();
        onTop();
        nonZeroSize();
        apply3s();
        $("#target").shouldBe(visible, Duration.ofSeconds(15));
        $("#opstatus").shouldHave(text("Target element state restored."));
        System.out.println("тестирование окончено");
    }
}

