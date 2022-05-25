package com.ddd.clothing.sales.valueObjects;

import co.com.sofka.domain.generic.ValueObject;
import com.ddd.clothing.inventory.entities.Product;
import com.ddd.clothing.sales.entities.Order;

public class Total implements ValueObject<Double> {
    private Double countTotal = 0.0;
    private final OrderId orderId;

    public Total(OrderId orderId) {
        this.orderId = orderId;
    }

    public Double addingTotalOfProducts() {
        Order order = new Order(orderId);

        for (Product product : order.getOrderProducts()) {
            countTotal += product.PriceProduct().getPriceProduct() * product.QuantityProducts().value();
        }

        return countTotal;
    }

    @Override
    public Double value() {
        return countTotal;
    }
}