package com.uitestingplayground;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class UiPlayGround extends Base {
public void openPage(){
    open("http://www.uitestingplayground.com");
}
public void stringChallenge(String name){
    $(byText(name)).click();

}}
