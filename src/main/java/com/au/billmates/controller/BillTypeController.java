package com.au.billmates.controller;

import com.au.billmates.entities.BillType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billType")
public class BillTypeController extends CrudController<BillType> {

    @Override
    public Class<BillType> getEntity() {
        return BillType.class;
    }
}
