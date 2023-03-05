package com.example.steam_lite;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    private final SelenideElement CS = $x("//span[contains(text(),'Counter-Strike: Global Offensive')]");

    public void click_to_cs(){
        CS.click();
    }

    public String assert_text(){
        return CS.getText();
    }

}
