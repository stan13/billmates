package com.au.billmates.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bill_type")
public class BillType extends AbstractEntity {

    @Column(name = "name")
    private String name;
}
