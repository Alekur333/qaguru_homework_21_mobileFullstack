package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/selenoid.properties"
})
public interface SelenoidConfig extends Config {
    String userName();

    String password();

    String url();

    String deviceName();

    String version();

    String app();

    String apkUrl();

    String platformName();

    String appPackage();

    String appActivity();
}
