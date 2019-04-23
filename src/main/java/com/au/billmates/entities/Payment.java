package com.au.billmates.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "payment")
public class Payment extends AbstractEntity {

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "amount")
    private Float amount;

    @ManyToOne
    @JoinColumn(name = "housemate_id", referencedColumnName = "id")
    private Housemate housemate;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Housemate getHousemate() {
        return housemate;
    }

    public void setHousemate(Housemate housemate) {
        this.housemate = housemate;
    }
}
