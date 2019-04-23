package com.au.billmates.controller;

import com.au.billmates.entities.Payment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController extends CrudController<Payment> {

    @Override
    public Class<Payment> getEntity() {
        return Payment.class;
    }
}
