package com.au.billmates.repository;

import com.au.billmates.entities.BillFraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillFractionRepository extends JpaRepository<BillFraction, Long> {
}
