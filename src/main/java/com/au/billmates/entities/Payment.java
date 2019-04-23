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
}
