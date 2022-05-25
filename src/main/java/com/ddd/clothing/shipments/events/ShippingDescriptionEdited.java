package com.ddd.clothing.shipments.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.ddd.clothing.shipments.valueObjects.Address;
import com.ddd.clothing.shipments.valueObjects.AddresseeID;
import com.ddd.clothing.shipments.valueObjects.ShippingDescription;

public class ShippingDescriptionEdited extends DomainEvent {
    private final AddresseeID addresseeID;
    private final Address address;

    public ShippingDescriptionEdited(AddresseeID addresseeID, Address address) {
        super("clothing.inventory.ShippingDescriptionEdited");
        this.addresseeID = addresseeID;
        this.address = address;
    }

    public AddresseeID getAddresseeID() {
        return addresseeID;
    }

    public Address getAddress() {
        return address;
    }
}
