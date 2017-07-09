package com.oddle.app.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Author: Vinh Pham
 * Date: 06/07/2017
 * Time: 00:58
 */
@MappedSuperclass
@Getter
@Setter
public class BaseEntity {
    @Id
    @GeneratedValue
    public Long id;
}
