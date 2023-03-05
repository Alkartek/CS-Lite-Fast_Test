package com.example.steam_lite;

import com.codeborne.selenide.SelenideElement;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;

import java.security.Key;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// page_url = https://www.jetbrains.com/
public class MainPage {

    private final SelenideElement FIND = $x("//input[@id=\"store_nav_search_term\"]");

    public void findCS(String game){
        FIND.sendKeys(game);
        FIND.sendKeys(Keys.ENTER);

    }


}