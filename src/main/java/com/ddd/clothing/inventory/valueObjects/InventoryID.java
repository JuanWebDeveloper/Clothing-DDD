package com.ddd.clothing.inventory.valueObjects;

import co.com.sofka.domain.generic.Identity;

public class InventoryID extends Identity {
    private InventoryID(String id) {
        super(id);
    }

    public InventoryID() {}

    public static InventoryID of(String id) {
        return new InventoryID(id);
    }
}
