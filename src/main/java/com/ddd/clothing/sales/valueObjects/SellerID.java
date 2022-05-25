package com.ddd.clothing.sales.valueObjects;

import co.com.sofka.domain.generic.Identity;

public class SellerID extends Identity {
    public SellerID(String id) {
        super(id);
    }

    public SellerID() {}

    public static SellerID of(String id) {
        return new SellerID(id);
    }
}
