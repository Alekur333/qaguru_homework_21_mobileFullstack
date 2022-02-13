package config;

import org.aeonbits.owner.Config;

//@Config.Sources({
//        "classpath:config/${environmentBrowser}.properties"
//})

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/real.properties"
})
public interface RealConfig extends Config {
    String url();

    String app();

    String platformName();

    String deviceName();

    String appPackage();

    String appActivity();

}
