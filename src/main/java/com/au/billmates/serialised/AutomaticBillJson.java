package com.au.billmates.serialised;

import com.au.billmates.domain.TimeUnit;
import com.au.billmates.entities.AutomaticBill;

import java.time.LocalDate;

public class AutomaticBillJson extends AbstractEntityJson<AutomaticBill> {
    private TimeUnit repeatUnit;
    private Integer repeatNumber;
    private LocalDate startDate;
}
