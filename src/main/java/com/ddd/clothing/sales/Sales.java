package com.ddd.clothing.sales;

// Sofka dependency import
import co.com.sofka.domain.generic.AggregateEvent;

// Value objects import
import com.ddd.clothing.sales.valueObjects.SalesID;

public class Sales extends AggregateEvent<SalesID> {
    public Sales(SalesID salesID) {
        super(salesID);
    }
}
