package com.oddle.app.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Author: Vinh Pham
 * Date: 09/07/2017
 * Time: 00:55
 */
@Getter
@Setter
public class MainDTO {
    private float temp;
    private int pressure;
    private int humidity;
    @JsonProperty("temp_min")
    private float tempMin;
    @JsonProperty("temp_max")
    private float tempMax;

}
