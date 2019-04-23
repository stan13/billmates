package com.au.billmates.serialised;

import com.au.billmates.entities.Bill;

import java.time.LocalDate;

public class BillJson extends AbstractEntityJson<Bill> {
    private LocalDate fromDate;
    private LocalDate toDate;
    private Long billTypeId;
    private Float amount;
}

