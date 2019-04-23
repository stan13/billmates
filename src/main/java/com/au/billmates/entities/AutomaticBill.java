package com.au.billmates.entities;

import com.au.billmates.domain.TimeUnit;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "automatic_bill")
public class AutomaticBill extends AbstractEntity {

    @Column(name = "repeat_unit")
    @Enumerated
    private TimeUnit repeatUnit;

    @Column(name = "repeat_number")
    private Integer repeatNumber;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "amount")
    private Float amount;

    @ManyToOne
    @JoinColumn(name = "house_id", referencedColumnName = "id")
    private House house;

    @ManyToOne
    @JoinColumn(name = "bill_type_id", referencedColumnName = "id")
    private BillType billType;

    @OneToMany(targetEntity = AutomaticBillFraction.class, mappedBy = "automaticBill")
    private Set<AutomaticBillFraction> automaticBillFractions = new HashSet<>();

    @OneToMany(targetEntity = Bill.class, mappedBy = "automaticBill")
    private Set<Bill> bills = new HashSet<>();

    public TimeUnit getRepeatUnit() {
        return repeatUnit;
    }

    public void setRepeatUnit(TimeUnit repeatUnit) {
        this.repeatUnit = repeatUnit;
    }

    public Integer getRepeatNumber() {
        return repeatNumber;
    }

    public void setRepeatNumber(Integer repeatNumber) {
        this.repeatNumber = repeatNumber;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }

    public Set<AutomaticBillFraction> getAutomaticBillFractions() {
        return automaticBillFractions;
    }

    public void setAutomaticBillFractions(Set<AutomaticBillFraction> automaticBillFractions) {
        this.automaticBillFractions = automaticBillFractions;
    }

    public Set<Bill> getBills() {
        return bills;
    }

    public void setBills(Set<Bill> bills) {
        this.bills = bills;
    }
}
