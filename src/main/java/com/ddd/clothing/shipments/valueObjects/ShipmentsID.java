package com.ddd.clothing.shipments.valueObjects;

import co.com.sofka.domain.generic.Identity;

public class ShipmentsID extends Identity {
    public ShipmentsID(String id) {
        super(id);
    }

    public ShipmentsID() {}

    public static ShipmentsID of(String id) {
        return new ShipmentsID(id);
    }
}
