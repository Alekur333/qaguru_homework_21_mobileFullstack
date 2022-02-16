package kur.alexei.drivers;


import com.codeborne.selenide.WebDriverProvider;
import config.RealConfig;
import config.SelenoidConfig;
import io.appium.java_client.android.AndroidDriver;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static kur.alexei.utils.FileUtils.getAbsolutePath;


public class SelenoidMobileDriver implements WebDriverProvider {
    public static SelenoidConfig config = ConfigFactory.create(SelenoidConfig.class, System.getProperties());

    public static URL getSelenoidUrl() {
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
//        desiredCapabilities.setCapability("app", apkUrl());
        desiredCapabilities.setCapability("locale", "en");
        desiredCapabilities.setCapability("language", "en");
        desiredCapabilities.setCapability("platformName", config.platformName());
        desiredCapabilities.setCapability("deviceName", config.deviceName());
        desiredCapabilities.setCapability("appPackage", config.appPackage());
        desiredCapabilities.setCapability("appActivity", config.appActivity());

        return new AndroidDriver(getSelenoidUrl(), desiredCapabilities);
    }


    private URL apkUrl() {
        try {
            return new URL("https://github.com/wikimedia/apps-android-wikipedia/releases/download/latest/app-alpha-universal-release.apk");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
