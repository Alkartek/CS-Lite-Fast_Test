package com.example.steam_lite;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import dev.failsafe.internal.util.Assert;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest extends BaseTest {
    MainPage mainPage = new MainPage();
    SearchPage searchPage = new SearchPage();

    private final static String game = "Counter-Strike";

    private final static String assert_text = "Counter-Strike: Global Offensive";

    @Test
    public void cs_pro(){
        MainPage mainPage1 = new MainPage();
        mainPage1.findCS(game);
        SearchPage searchPage1 = new SearchPage();
        String result_text = searchPage1.assert_text();
        Assertions.assertTrue(result_text.equals(assert_text));
        searchPage1.click_to_cs();




    }

}