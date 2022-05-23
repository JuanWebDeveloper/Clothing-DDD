package com.ddd.clothing.inventory.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class ProviderPhone implements ValueObject<String> {
    private final String providerPhone;

    public ProviderPhone(String providerPhone) {
        this.providerPhone = providerPhone;
    }

    @Override
    public String value() {
        return this.providerPhone;
    }
}
