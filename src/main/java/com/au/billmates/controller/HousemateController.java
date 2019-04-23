package com.au.billmates.controller;

import com.au.billmates.entities.Housemate;
import com.au.billmates.entities.Housemate_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@RestController
@RequestMapping("/housemate")
public class HousemateController extends CrudController<Housemate> {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public HousemateController(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }


    @Override
    public Class<Housemate> getEntity() {
        return Housemate.class;
    }

    @RequestMapping(value = "/password/{password}", method = RequestMethod.GET)
    public ResponseEntity<Housemate> findByPassword(@PathVariable("password") String password) {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Housemate> query = cb.createQuery(Housemate.class);
        Root<Housemate> root = query.from(Housemate.class);
        query.where(cb.equal(root.get(Housemate_.password), password));

        return ResponseEntity.ok(getEntityManager().createQuery(query).getSingleResult());
    }

    @PostMapping("/sign-up")
    public void signUp(@RequestBody Housemate housemate) {
        housemate.setPassword(bCryptPasswordEncoder.encode(housemate.getPassword()));
        getRepository().save(housemate);
    }
}
