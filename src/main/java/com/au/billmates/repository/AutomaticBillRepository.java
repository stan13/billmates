package com.au.billmates.repository;

import com.au.billmates.entities.AutomaticBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomaticBillRepository extends JpaRepository<AutomaticBill, Long> {
}
