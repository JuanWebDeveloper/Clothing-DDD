package com.ddd.clothing.shipments;

// Sofka dependency import
import co.com.sofka.domain.generic.AggregateEvent;

// Imports of the sales
import com.ddd.clothing.sales.valueObjects.*;

// Value objects import
import com.ddd.clothing.shipments.valueObjects.*;

// Events import
import com.ddd.clothing.shipments.events.*;

import java.util.Objects;

public class Shipments extends AggregateEvent<ShipmentsID> {
    protected AddresseeID addresseeID;
    protected SellerID sellerID;
    protected Date date;
    protected ShippingDescription shippingDescription;


    public Shipments(ShipmentsID shipmentsID, SellerID sellerID, AddresseeID addresseeID, DomiciliaryID domiciliaryID, Address address, ShippingDescription shippingDescription, Date date) {
        super(shipmentsID);
        subscribe(new ShipmentsEventChange(this));
        appendChange(new ShipmentCreated(
                Objects.requireNonNull(sellerID),
                Objects.requireNonNull(addresseeID),
                Objects.requireNonNull(domiciliaryID),
                Objects.requireNonNull(address),
                Objects.requireNonNull(shippingDescription),
                Objects.requireNonNull(date)
        ));
    }

    private Shipments(ShipmentsID shipmentsID) {
        super(shipmentsID);
        subscribe(new ShipmentsEventChange(this));
    }

    // Behaviors Of The Aggregate
    public void assignShippingDescription(ShipmentsID shipmentsID, ShippingDescription shippingDescription) {
        appendChange(new ShippingDescriptionAssigned(
                Objects.requireNonNull(shipmentsID),
                Objects.requireNonNull(shippingDescription)
        )).apply();
    }
}
