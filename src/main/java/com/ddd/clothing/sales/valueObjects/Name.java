package com.ddd.clothing.sales.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class Name implements ValueObject<String> {
    private final String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public String value() {
        return this.name;
    }
}
