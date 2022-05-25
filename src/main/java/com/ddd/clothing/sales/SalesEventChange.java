package com.ddd.clothing.sales;

import co.com.sofka.domain.generic.EventChange;
import com.ddd.clothing.sales.entities.*;
import com.ddd.clothing.sales.events.*;
import com.ddd.clothing.sales.valueObjects.Payment;
import com.ddd.clothing.sales.valueObjects.Total;

public class SalesEventChange extends EventChange {
    public SalesEventChange(Sales sales) {
        apply((SaleCreated event) -> {
            sales.date = event.getDate();
        });

        apply((SellerCreated event) -> {
            sales.createSeller(event.getSellerID(), event.getName(), event.getPhone());
        });

        apply((CustomerCreated event) -> {
            sales.createCustomer(event.getCustomerID(), event.getName(), event.getPhone());
        });

        apply((AssignedCustomer event) -> {
            sales.customer = new Customer(event.getCustomerID(), event.getName(), event.getPhone());
        });

        apply((AssignedSeller event) -> {
            sales.seller = new Seller(event.getSellerID(), event.getName(), event.getPhone());
        });

        apply((SellerEdited event) -> {
            var newSeller = new Seller(event.getSellerID(), event.getName(), event.getPhone());
            sales.seller = newSeller;
        });

        apply((CustomerEdited event) -> {
            sales.editCustomer(event.getCustomerID(), event.getName(), event.getPhone());
        });

        apply((ProductAdded event) -> {
            sales.order.addProductToOrder(event.getProductID(), event.getInventoryName(), event.getProductDescription(), event.getPriceProduct(), event.getQuantityProducts());
        });

        apply((ProductDeleted event) -> {
            sales.order.removeProductToOrder(event.getProductID());
        });

        apply((OrderCreated event) -> {
            sales.order = new Order(event.getOrderId());
        });

        apply((TotalCalculated event) -> {
            sales.total = new Total(sales.order.identity());
        });

        apply((BillGenerated event) -> {
            sales.bill = event.getBill();
        });

        apply((SalePaid event) -> {
            sales.payment = new Payment(Payment.Phase.PAID_OUT);
        });
    }
}
