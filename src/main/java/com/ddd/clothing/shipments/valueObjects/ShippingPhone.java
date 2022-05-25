package com.ddd.clothing.shipments.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class ShippingPhone implements ValueObject<String> {
    private final String shippingPhone;

    public ShippingPhone(String shippingPhone) {
        this.shippingPhone = shippingPhone;
    }

    @Override
    public String value() {
        return this.shippingPhone;
    }
}
