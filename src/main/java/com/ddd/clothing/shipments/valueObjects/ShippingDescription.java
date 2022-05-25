package com.ddd.clothing.shipments.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class ShippingDescription implements ValueObject<String> {
    private final String shippingDescription;

    public ShippingDescription(String shippingDescription) {
        this.shippingDescription = shippingDescription;
    }

    @Override
    public String value() {
        return this.shippingDescription;
    }
}
