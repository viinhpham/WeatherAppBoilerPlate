package com.oddle.app.model;

import javax.persistence.Entity;

/**
 * Author: Vinh Pham
 * Date: 06/07/2017
 * Time: 00:58
 */
@Entity
public class WeatherLog extends BaseEntity {

    private Long dateLog;
    private Float windSpeed;
    private Integer cloudPercentage;
    private Float temp;
    private Float hpa;

}
