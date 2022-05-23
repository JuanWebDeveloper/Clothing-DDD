package com.ddd.clothing.inventory.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class InventoryName implements ValueObject<String> {
    private final String inventoryName;

    public InventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    @Override
    public String value() {
        return this.inventoryName;
    }
}
