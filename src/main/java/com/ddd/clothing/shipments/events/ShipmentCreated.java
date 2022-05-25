package com.ddd.clothing.shipments.events;

import co.com.sofka.domain.generic.DomainEvent;


import com.ddd.clothing.sales.valueObjects.SalesID;
import com.ddd.clothing.sales.valueObjects.Date;

import com.ddd.clothing.shipments.valueObjects.Address;
import com.ddd.clothing.shipments.valueObjects.AddresseeID;
import com.ddd.clothing.shipments.valueObjects.DomiciliaryID;
import com.ddd.clothing.shipments.valueObjects.ShippingDescription;

public class ShipmentCreated extends DomainEvent {
    private final SalesID salesID;
    private final AddresseeID addresseeID;
    private final DomiciliaryID domiciliaryID;
    private final Address address;
    private final ShippingDescription shippingDescription;
    private Date date;

    public ShipmentCreated(SalesID salesID, AddresseeID addresseeID, DomiciliaryID domiciliaryID, Address address, ShippingDescription shippingDescription, Date date) {
        super("clothing.inventory.ShipmentCreated");
        this.salesID = salesID;
        this.addresseeID = addresseeID;
        this.domiciliaryID = domiciliaryID;
        this.address = address;
        this.shippingDescription = shippingDescription;
        this.date = date;
    }

    public AddresseeID getAddresseeID() {
        return addresseeID;
    }

    public DomiciliaryID getDomiciliaryID() {
        return domiciliaryID;
    }

    public Address getAddress() {
        return address;
    }
}
