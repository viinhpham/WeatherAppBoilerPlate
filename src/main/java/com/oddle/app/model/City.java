package com.oddle.app.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Author: Vinh Pham
 * Date: 06/07/2017
 * Time: 00:57
 */
@Entity
@Getter
@Setter
public class City extends BaseEntity {
    private String name;
    private String country;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<WeatherLog> weatherLogs;
}
