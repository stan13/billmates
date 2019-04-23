package com.au.billmates.repository;

import com.au.billmates.entities.Housemate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HousemateRepository extends JpaRepository<Housemate, Long> {
    Housemate findByUsername(String username);
}
