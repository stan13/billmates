package com.au.billmates.controller;

import com.au.billmates.entities.Housemate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/housemate")
public class HousemateController extends CrudController<Housemate> {
    @Override
    public Class<Housemate> getEntity() {
        return Housemate.class;
    }
}
