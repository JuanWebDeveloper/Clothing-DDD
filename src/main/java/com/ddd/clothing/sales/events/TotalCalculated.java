package com.ddd.clothing.sales.events;

import co.com.sofka.domain.generic.DomainEvent;

import com.ddd.clothing.sales.valueObjects.Total;

public class TotalCalculated extends DomainEvent {
    private final Total total;

    public TotalCalculated(Total total) {
        super("clothing.inventory.TotalCalculated");
        this.total = total;
    }

    public Total getTotal() {
        return this.total;
    }
}
