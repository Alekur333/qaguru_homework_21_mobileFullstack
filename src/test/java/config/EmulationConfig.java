package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/emulation.properties"
})
public interface EmulationConfig extends Config {

    String url();

    String app();

    String platformName();

    String deviceName();

    String appPackage();

    String appActivity();

}
