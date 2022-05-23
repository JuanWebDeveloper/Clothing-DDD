package com.ddd.clothing.inventory.valueObjects;

import co.com.sofka.domain.generic.Identity;

public class ProviderID extends Identity {
    private ProviderID(String id) {
        super(id);
    }

    public ProviderID() {}

    public static ProviderID of(String id) {
        return new ProviderID(id);
    }
}
