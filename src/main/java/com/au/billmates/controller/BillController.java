package com.au.billmates.controller;

import com.au.billmates.entities.Bill;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bill")
public class BillController extends CrudController<Bill> {

    @Override
    public Class<Bill> getEntity() {
        return Bill.class;
    }
}
