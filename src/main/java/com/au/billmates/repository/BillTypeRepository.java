package com.au.billmates.repository;

import com.au.billmates.entities.BillType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillTypeRepository extends JpaRepository<BillType, Long> {
}
