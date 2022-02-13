package kur.alexei.drivers;


import com.codeborne.selenide.WebDriverProvider;
import config.BrowserstackConfig;
import io.appium.java_client.android.AndroidDriver;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackMobileDriver implements WebDriverProvider {
    public static BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class, System.getProperties());

    public static URL getBrowserstackUrl() {
        try {
            return new URL(config.url());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {

        // Set your access credentials
        desiredCapabilities.setCapability("browserstack.user", config.userName());
        desiredCapabilities.setCapability("browserstack.key", config.accessKey());
        // Set URL of the application under test
        desiredCapabilities.setCapability("app", config.appUrl());
        // Specify device and os_version for testing
        desiredCapabilities.setCapability("device", config.device());
        desiredCapabilities.setCapability("os_version", config.os_version());
        // Set other BrowserStack capabilities
        desiredCapabilities.setCapability("project", "First Java Project");
        desiredCapabilities.setCapability("build", "Java Android");
        desiredCapabilities.setCapability("name", "wiki_test");

        return new AndroidDriver(getBrowserstackUrl(), desiredCapabilities);
    }
}
