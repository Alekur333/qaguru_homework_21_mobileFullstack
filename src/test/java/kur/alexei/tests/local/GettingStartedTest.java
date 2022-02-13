package kur.alexei.tests.local;

import io.appium.java_client.MobileBy;
import kur.alexei.tests.TestBase;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class GettingStartedTest extends TestBase {

    String skipBtn = "org.wikipedia:id/fragment_onboarding_skip_button";
    String forwardBtn = "org.wikipedia:id/fragment_onboarding_forward_button";

    @Test
    @DisplayName("Проверка экранов начального входа")
    @Tag("local")
    void startedScreensTest() {

        step("Проверка экрана 1", () -> {
            $(MobileBy.id(skipBtn)).shouldBe(visible);
            $(MobileBy.id(forwardBtn)).shouldBe(visible).click();
        });


        step("Проверка экрана 2", () -> {
            $(MobileBy.id("org.wikipedia:id/primaryTextView")).shouldHave(text("New ways to explore"));
            $(MobileBy.id("org.wikipedia:id/imageViewCentered")).shouldBe(visible);
            $(MobileBy.id(skipBtn)).shouldBe(visible);
            $(MobileBy.id(forwardBtn)).shouldBe(visible).click();
        });

        step("Проверка экрана 3", () -> {
            $(MobileBy.id("org.wikipedia:id/secondaryTextView"))
                    .shouldHave(text("You can make reading lists from articles you want to read later," +
                            " even when you’re offline. Login to your Wikipedia account to sync your " +
                            "reading lists. Join Wikipedia"));
            $(MobileBy.id(skipBtn)).shouldBe(visible);
            $(MobileBy.id(forwardBtn)).shouldBe(visible).click();
        });

        step("Проверка экрана 4", () -> {
            $(MobileBy.id("org.wikipedia:id/switchView")).shouldBe(visible);
            $(MobileBy.id("org.wikipedia:id/fragment_onboarding_done_button"))
                    .shouldHave(text("GET STARTED")).click();
        });
    }
}
