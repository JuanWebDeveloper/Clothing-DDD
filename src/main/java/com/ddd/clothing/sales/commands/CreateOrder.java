package com.ddd.clothing.sales.commands;

import co.com.sofka.domain.generic.Command;

import com.ddd.clothing.sales.valueObjects.SalesID;
import com.ddd.clothing.sales.valueObjects.OrderId;

public class CreateOrder extends Command {
    private final SalesID salesID;
    private final OrderId orderId;

    public CreateOrder(SalesID salesID, OrderId orderId) {
        this.salesID = salesID;
        this.orderId = orderId;
    }

    public SalesID getSalesID() {
        return this.salesID;
    }

    public OrderId getOrderId() {
        return this.orderId;
    }
}
