package com.au.billmates.serialised;

import com.au.billmates.entities.Payment;

import java.time.LocalDateTime;

public class PaymentJson extends AbstractEntityJson<Payment> {
    private LocalDateTime date;
    private Float amount;
}
