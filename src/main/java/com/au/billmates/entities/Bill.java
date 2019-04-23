package com.au.billmates.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bill")
public class Bill extends AbstractEntity {

    @Column(name = "from_date")
    private LocalDate fromDate;

    @Column(name = "to_date")
    private LocalDate toDate;

    @ManyToOne
    @JoinColumn(name = "bill_type_id", referencedColumnName = "id")
    private BillType billType;

    @ManyToOne
    @JoinColumn(name = "automatic_bill_id", referencedColumnName = "id")
    private AutomaticBill automaticBill;

    @Column(name = "amount")
    private Float amount;

}
