package com.oddle.app.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Author: Vinh Pham
 * Date: 09/07/2017
 * Time: 23:09
 */
@Getter
@Setter
public class SysDTO {
    private long id;
    private int type;
    private float message;
    private String country;
    @JsonProperty("sunrise")
    private long sunRise;
    @JsonProperty("sunset")
    private long sunSet;
}
