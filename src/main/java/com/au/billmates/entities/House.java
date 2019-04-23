package com.au.billmates.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "house")
public class House extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "icon")
    private String icon;

    //private Set<Housemate> housemates;
}
