package com.ddd.clothing.sales.events;

import co.com.sofka.domain.generic.DomainEvent;

import com.ddd.clothing.sales.valueObjects.OrderId;

public class OrderCreated extends DomainEvent {
    private final OrderId orderId;

    public OrderCreated(OrderId orderId) {
        super("clothing.inventory.OrderCreated");
        this.orderId = orderId;
    }

    public OrderId getOrderId() {
        return orderId;
    }
}
