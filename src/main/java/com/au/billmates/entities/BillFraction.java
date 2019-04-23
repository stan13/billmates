package com.au.billmates.entities;

import javax.persistence.*;

@Entity
@Table(name = "bill_fraction")
public class BillFraction extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "bill_id", referencedColumnName = "id")
    private Bill bill;

    @ManyToOne
    @JoinColumn(name = "housemate_id", referencedColumnName = "id")
    private Housemate housemate;

    @Column(name = "amount")
    private Float amount;
}
