package com.ddd.clothing.shipments.events;

import co.com.sofka.domain.generic.DomainEvent;

import com.ddd.clothing.shipments.valueObjects.DomiciliaryID;
import com.ddd.clothing.shipments.valueObjects.ShipmentsID;

public class DomiciliaryAssigned extends DomainEvent {
    private final ShipmentsID shipmentsID;
    private final DomiciliaryID domiciliaryID;

    public DomiciliaryAssigned(ShipmentsID shipmentsID, DomiciliaryID domiciliaryID) {
        super("clothing.inventory.DomiciliaryAssigned");
        this.shipmentsID = shipmentsID;
        this.domiciliaryID = domiciliaryID;
    }

    public ShipmentsID getShipmentsID() {
        return this.shipmentsID;
    }

    public DomiciliaryID getDomiciliaryID() {
        return this.domiciliaryID;
    }
}
