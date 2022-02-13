package kur.alexei.drivers;


import com.codeborne.selenide.WebDriverProvider;
import config.RealConfig;
import io.appium.java_client.android.AndroidDriver;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static kur.alexei.utils.FileUtils.getAbsolutePath;


public class SelenoidMobileDriver implements WebDriverProvider {
    public static RealConfig config = ConfigFactory.create(RealConfig.class, System.getProperties());

    public static URL getBrowserstackUrl() {
        try {
            return new URL(config.url());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {

        desiredCapabilities.setCapability("app",
                getAbsolutePath(config.app()));
        desiredCapabilities.setCapability("locale", "en");
        desiredCapabilities.setCapability("language", "en");
        desiredCapabilities.setCapability("platformName", config.platformName());
        desiredCapabilities.setCapability("deviceName", config.deviceName());
        desiredCapabilities.setCapability("appPackage", config.appPackage());
        desiredCapabilities.setCapability("appActivity", config.appActivity());

        return new AndroidDriver(getBrowserstackUrl(), desiredCapabilities);
    }
}
