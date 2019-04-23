package com.au.billmates.controller;

import com.au.billmates.entities.AutomaticBill;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/automaticBill")
public class AutomaticBillController extends CrudController<AutomaticBill> {

    @Override
    public Class<AutomaticBill> getEntity() {
        return AutomaticBill.class;
    }
}
