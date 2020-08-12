package com.github.sebapd.weatherstrip.api;

import com.github.sebapd.weatherstrip.model.weather.Forecast;
import com.github.sebapd.weatherstrip.service.ForecastService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class WeatherController {

    private final ForecastService forecastService;

    @GetMapping("/{city_name}")
    public Forecast getCity(@PathVariable(name = "city_name") String cityName){
        return forecastService.getForecast(cityName);
    }

    @GetMapping("/{city_name},{state_code}")
    public Forecast getCity(@PathVariable(name = "city_name") String cityName,
                            @PathVariable(name = "state_code") String stateCode){
        return forecastService.getForecast(cityName,stateCode);
    }

    @GetMapping("/{city_name},{state_code},{country_code}")
    public Forecast getCity(@PathVariable(name = "city_name") String cityName,
                            @PathVariable(name = "state_code") String stateCode,
                            @PathVariable(name = "country_code") String countryCode){
        return forecastService.getForecast(cityName,stateCode,countryCode);
    }
}
