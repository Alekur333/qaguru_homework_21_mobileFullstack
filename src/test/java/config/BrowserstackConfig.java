package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/browserstack.properties"
})
public interface BrowserstackConfig extends Config {

    String userName();

    String accessKey();

    String url();

    String appUrl();

    String videoUrl();

    String device();

    String os_version();
}
