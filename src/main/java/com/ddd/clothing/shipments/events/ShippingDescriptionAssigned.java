package com.ddd.clothing.shipments.events;

import co.com.sofka.domain.generic.DomainEvent;

import com.ddd.clothing.shipments.valueObjects.ShipmentsID;
import com.ddd.clothing.shipments.valueObjects.ShippingDescription;

public class ShippingDescriptionAssigned extends DomainEvent {
    private final ShipmentsID shipmentsID;
    private final ShippingDescription shippingDescription;

    public ShippingDescriptionAssigned(ShipmentsID shipmentsID, ShippingDescription shippingDescription) {
        super("clothing.inventory.ShippingDescriptionAssigned");
        this.shipmentsID = shipmentsID;
        this.shippingDescription = shippingDescription;
    }

    public ShipmentsID getShipmentsID() {
        return shipmentsID;
    }

    public ShippingDescription getShippingDescription() {
        return shippingDescription;
    }
}
