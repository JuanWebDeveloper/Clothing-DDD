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
    protected SalesID salesID;
    protected Date date;
    protected ShippingDescription shippingDescription;

    public Shipments(ShipmentsID shipmentsID, SalesID salesID, AddresseeID addresseeID, DomiciliaryID domiciliaryID, Address address, ShippingDescription shippingDescription, Date date) {
        super(shipmentsID);
        subscribe(new ShipmentsEventChange(this));
        appendChange(new ShipmentCreated(
                Objects.requireNonNull(salesID),
                Objects.requireNonNull(addresseeID),
                Objects.requireNonNull(domiciliaryID),
                Objects.requireNonNull(address),
                Objects.requireNonNull(shippingDescription),
                Objects.requireNonNull(date)
        )).apply();
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

    public void editShippingDescription(AddresseeID addresseeID, Address address) {
        appendChange(new ShippingDescriptionEdited(
                Objects.requireNonNull(addresseeID),
                Objects.requireNonNull(address)
        )).apply();
    }

    public void assignTheAddressToTheAddressee(CustomerID customerID, Address address) {
        appendChange(new AddresseeAddressAssigned(
                Objects.requireNonNull(customerID),
                Objects.requireNonNull(address)
        )).apply();
    }

    public void assignToDomiciliarys(ShipmentsID shipmentsID, DomiciliaryID domiciliaryID) {
        appendChange(new DomiciliaryAssigned(
                Objects.requireNonNull(shipmentsID),
                Objects.requireNonNull(domiciliaryID)
        )).apply();
    }

    public void createShipment(SalesID salesID, AddresseeID addresseeID, DomiciliaryID domiciliaryID, Address address, ShippingDescription shippingDescription, Date date) {
        appendChange(new ShipmentCreated(
                Objects.requireNonNull(salesID),
                Objects.requireNonNull(addresseeID),
                Objects.requireNonNull(domiciliaryID),
                Objects.requireNonNull(address),
                Objects.requireNonNull(shippingDescription),
                Objects.requireNonNull(date)
        )).apply();
    }

}
