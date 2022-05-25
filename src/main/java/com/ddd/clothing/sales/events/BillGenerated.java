package com.ddd.clothing.sales.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.ddd.clothing.sales.valueObjects.Bill;

public class BillGenerated extends DomainEvent {
    private final Bill bill;

    public BillGenerated(Bill bill) {
        super("clothing.inventory.BillGenerated");
        this.bill = bill;
    }

    public Bill getBill() {
        return bill;
    }
}
