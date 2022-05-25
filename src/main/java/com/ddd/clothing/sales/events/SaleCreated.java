package com.ddd.clothing.sales.events;

import co.com.sofka.domain.generic.DomainEvent;

import com.ddd.clothing.sales.valueObjects.Date;
import com.ddd.clothing.sales.valueObjects.SalesID;

public class SaleCreated extends DomainEvent {
    private final SalesID salesID;
    private final Date date;

    public SaleCreated(SalesID salesID, Date date) {
        super("clothing.inventory.SaleCreated");
        this.salesID = salesID;
        this.date = date;
    }

    public SalesID getSalesID() {
        return salesID;
    }

    public Date getDate() {
        return date;
    }
}

