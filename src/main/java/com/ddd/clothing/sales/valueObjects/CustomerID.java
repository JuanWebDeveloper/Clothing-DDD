package com.ddd.clothing.sales.valueObjects;

import co.com.sofka.domain.generic.Identity;

public class CustomerID extends Identity {
    private CustomerID(String id) {
        super(id);
    }

    public CustomerID() {}

    public static CustomerID of(String id) {
        return new CustomerID(id);
    }
}
