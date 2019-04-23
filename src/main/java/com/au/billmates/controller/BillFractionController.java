package com.au.billmates.controller;

import com.au.billmates.entities.BillFraction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billFraction")
public class BillFractionController extends CrudController<BillFraction> {

    @Override
    public Class<BillFraction> getEntity() {
        return BillFraction.class;
    }
}
