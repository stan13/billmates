package com.au.billmates.serialised;

import com.au.billmates.entities.BillFraction;

public class BillFractionJson extends AbstractEntityJson<BillFraction> {
    private Long billId;
    private Long housemateId;
    private Float amount;
}
