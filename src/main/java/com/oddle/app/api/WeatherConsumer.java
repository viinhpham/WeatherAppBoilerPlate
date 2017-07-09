package com.oddle.app.api;

import com.oddle.app.api.dto.WeatherInfoDTO;

/**
 * Author : Vinh Pham.
 * Date: 06/07/2017.
 * Time : 13:07.
 */
public interface WeatherConsumer {
    String CITY_NAME = "q";
    String APPID = "appid";
    WeatherInfoDTO getWeatherByCityName(String cityName);
}
