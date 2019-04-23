package com.au.billmates.controller;

import com.au.billmates.entities.AutomaticBillFraction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/automaticBillFraction")
public class AutomaticBillFractionController extends CrudController<AutomaticBillFraction> {

    @Override
    public Class<AutomaticBillFraction> getEntity() {
        return AutomaticBillFraction.class;
    }
}
