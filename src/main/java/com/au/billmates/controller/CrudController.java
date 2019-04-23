package com.au.billmates.controller;

import com.au.billmates.entities.AbstractEntity;
import com.au.billmates.serialised.AbstractEntityJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class CrudController<K extends AbstractEntity> {

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private JpaRepository<K, Long> repository;

    public abstract Class<K> getEntity();

//    public abstract AbstractEntityJson<K> serialise(K entity);
//
//    public abstract K deserialise(AbstractEntityJson<K> entity);

    public JpaRepository<K, Long> getRepository() {
        return repository;
    }

    public EntityManager getEntityManager() {
        return em;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<K> create(@RequestBody K entity) {
        return ResponseEntity.ok(getRepository().save(entity));
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseEntity<K> update(@RequestBody K entity) {
        return ResponseEntity.ok(getRepository().save(entity));
    }

    @RequestMapping(value = "/load", method = RequestMethod.POST)
    public ResponseEntity<K> load(@RequestBody Long id) {
        if (getRepository().existsById(id)) {
            return ResponseEntity.ok(getRepository().findById(id).get());
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @RequestMapping(value = "/loadAll", method = RequestMethod.POST)
    public ResponseEntity<List<K>> loadAll() {
        return ResponseEntity.ok(getRepository().findAll());
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void delete(@RequestBody Long id) {
        getRepository().deleteById(id);
    }
}
