package com.ddd.clothing.shipments.valueObjects;

import co.com.sofka.domain.generic.Identity;

public class AddresseeID extends Identity {
    private AddresseeID (String id) {
        super(id);
    }

    public AddresseeID() {}

    public static AddresseeID of(String id) {
        return new AddresseeID(id);
    }
}
