package com.au.billmates.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "housemate")
public class Housemate extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToMany(targetEntity = BillFraction.class, mappedBy = "housemate")
    private Set<BillFraction> billFractions = new HashSet<>();

    @OneToMany(targetEntity = Payment.class, mappedBy = "housemate")
    private Set<Payment> payments = new HashSet<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<BillFraction> getBillFractions() {
        return billFractions;
    }

    public void setBillFractions(Set<BillFraction> billFractions) {
        this.billFractions = billFractions;
    }

    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }
}
