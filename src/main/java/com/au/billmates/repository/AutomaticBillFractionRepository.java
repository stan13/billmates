package com.au.billmates.repository;

import com.au.billmates.entities.AutomaticBillFraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomaticBillFractionRepository extends JpaRepository<AutomaticBillFraction, Long> {
}
