package com.au.billmates.controller;

import com.au.billmates.entities.User;
import com.au.billmates.entities.User_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@RestController("/user")
public class UserController extends CrudController<User> {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserController(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public Class<User> getEntity() {
        return User.class;
    }

    @PostMapping("/sign-up")
    public void signUp(@RequestBody User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        getRepository().save(user);
    }

    @RequestMapping(value = "/username/{username}", method = RequestMethod.GET)
    public ResponseEntity<User> findByUsername(@PathVariable("username") String username) {
        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<User> query = cb.createQuery(User.class);
        Root<User> root = query.from(User.class);
        query.where(cb.equal(root.get(User_.username), username));

        return ResponseEntity.ok(getEntityManager().createQuery(query).getSingleResult());
    }
}
