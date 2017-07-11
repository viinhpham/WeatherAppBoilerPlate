package com.oddle.app.api.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Author: Vinh Pham
 * Date: 09/07/2017
 * Time: 00:46
 */
@Getter
@Setter
public class WeatherDTO {
    private Long id;
    private String main;
    private String description;
    private String icon;
}
