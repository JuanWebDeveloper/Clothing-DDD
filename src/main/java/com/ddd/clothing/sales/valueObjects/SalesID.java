package com.ddd.clothing.sales.valueObjects;

import co.com.sofka.domain.generic.Identity;

public class SalesID extends Identity {
    private SalesID(String id) {
        super(id);
    }

    public SalesID() {}

    public static SalesID of(String id) {
        return new SalesID(id);
    }
}
