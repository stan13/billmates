package com.au.billmates.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "housemate")
public class Housemate extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "house_id", referencedColumnName = "id")
    private House house;

    @OneToMany(targetEntity = BillFraction.class, mappedBy = "housemate")
    private Set<BillFraction> billFractions = new HashSet<>();

    @OneToMany(targetEntity = Payment.class, mappedBy = "housemate")
    private Set<Payment> payments = new HashSet<>();

    @Column(name = "admin")
    private Boolean admin = false;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
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

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
}
