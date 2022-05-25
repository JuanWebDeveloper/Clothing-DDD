package com.ddd.clothing.sales.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class Phone implements ValueObject<String> {
    private final String phone;

    public Phone(String phone) {
        this.phone = phone;
    }

    @Override
    public String value() {
        return this.phone;
    }
}
