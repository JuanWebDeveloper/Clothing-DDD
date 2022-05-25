package com.ddd.clothing.shipments.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class Address implements ValueObject<String> {
    private final String address;

    public Address(String address) {
        this.address = address;
    }

    @Override
    public String value() {
        return this.address;
    }
}
