package com.github.sebapd.weatherstrip.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "weather")
public class WeatherConfig {

    private String appid;
    private String url;

}
