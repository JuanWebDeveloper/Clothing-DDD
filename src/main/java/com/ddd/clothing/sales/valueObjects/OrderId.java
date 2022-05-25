package com.ddd.clothing.sales.valueObjects;

import co.com.sofka.domain.generic.Identity;

public class OrderId extends Identity {
    private OrderId(String id) {
        super(id);
    }

    public OrderId() {}

    public static OrderId of(String id) {
        return new OrderId(id);
    }
}
