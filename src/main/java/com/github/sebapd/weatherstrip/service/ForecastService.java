package com.github.sebapd.weatherstrip.service;


import com.github.sebapd.weatherstrip.config.WeatherConfig;
import com.github.sebapd.weatherstrip.model.weather.Forecast;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor
@Service
public class ForecastService {

    private final WeatherConfig weatherConfig;
    private final RestTemplate restTemplate;

    public Forecast getForecast(String cityName){
        return restTemplate.getForObject(weatherConfig.getUrl()+ cityName + weatherConfig.getAppid(), Forecast.class);
    }
    public Forecast getForecast(String cityName, String stateCode){
        return restTemplate.getForObject(weatherConfig.getUrl()+ cityName + "," + stateCode + weatherConfig.getAppid(), Forecast.class);
    }
    public Forecast getForecast(String cityName, String stateCode, String countryCode){
        return restTemplate.getForObject(weatherConfig.getUrl()+ cityName + "," + stateCode + "," + countryCode + weatherConfig.getAppid(), Forecast.class);
    }
}
