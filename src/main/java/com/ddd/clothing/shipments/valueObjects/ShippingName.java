package com.ddd.clothing.shipments.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class ShippingName implements ValueObject<String> {
    private final String shippingName;

    public ShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    @Override
    public String value() {
        return this.shippingName;
    }
}
