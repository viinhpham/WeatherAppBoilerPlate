package com.oddle.app.api.impl;

import com.oddle.app.api.WeatherConsumer;
import com.oddle.app.api.dto.WeatherInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Author : Vinh Pham.
 * Date: 06/07/2017.
 * Time : 13:08.
 */
@Service
public class WeatherComsumerImpl implements WeatherConsumer {
    @Autowired
    private Environment environment;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public WeatherInfoDTO getWeatherByCityName(String cityName) {
        String uri = environment.getRequiredProperty("openweather.api");
        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(uri)
                .queryParam(CITY_NAME, cityName)
                .queryParam(APPID, environment.getRequiredProperty("openweather.api_key"));

        return restTemplate.getForObject(uriComponentsBuilder.build().encode().toUri(), WeatherInfoDTO.class);
    }
}
