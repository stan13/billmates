package com.au.billmates.entities;

import com.au.billmates.domain.TimeUnit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "automatic_bill")
public class AutomaticBill extends AbstractEntity {

    @Column(name = "repeat_unit")
    @Enumerated
    private TimeUnit repeatUnit;

    @Column(name = "repeat_number")
    private Integer repeatNumber;

    @Column(name = "start_date")
    private LocalDate startDate;
}
