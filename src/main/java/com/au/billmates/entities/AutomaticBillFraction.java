package com.au.billmates.entities;

import javax.persistence.*;

@Entity
@Table(name = "automatic_bill_fraction")
public class AutomaticBillFraction extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "housemate_id", referencedColumnName = "id")
    private Housemate housemate;

    @ManyToOne
    @JoinColumn(name = "automatic_bill_id", referencedColumnName = "id")
    private AutomaticBill automaticBill;

    @Column(name = "percentage")
    private Float percentage;

    public Housemate getHousemate() {
        return housemate;
    }

    public void setHousemate(Housemate housemate) {
        this.housemate = housemate;
    }

    public AutomaticBill getAutomaticBill() {
        return automaticBill;
    }

    public void setAutomaticBill(AutomaticBill automaticBill) {
        this.automaticBill = automaticBill;
    }

    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }
}
