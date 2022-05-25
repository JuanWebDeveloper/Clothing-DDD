package com.ddd.clothing.shipments;

// Sofka dependency import
import co.com.sofka.domain.generic.AggregateEvent;

// Value objects import
import com.ddd.clothing.shipments.valueObjects.ShipmentsID;

public class Shipments extends AggregateEvent<ShipmentsID> {
    public Shipments(ShipmentsID shipmentsID) {
        super(shipmentsID);
    }
}
