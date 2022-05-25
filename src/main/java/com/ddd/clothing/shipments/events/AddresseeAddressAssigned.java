package com.ddd.clothing.shipments.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.ddd.clothing.sales.valueObjects.CustomerID;
import com.ddd.clothing.shipments.valueObjects.Address;

public class AddresseeAddressAssigned extends DomainEvent {
    private final CustomerID customerID;
    private final Address address;

    public AddresseeAddressAssigned(final CustomerID customerID, final Address address) {
        super("clothing.inventory.AddresseeAddressAssigned");
        this.customerID = customerID;
        this.address = address;
    }

    public CustomerID getCustomerID() {
        return this.customerID;
    }

    public Address getAddress() {
        return this.address;
    }
}
