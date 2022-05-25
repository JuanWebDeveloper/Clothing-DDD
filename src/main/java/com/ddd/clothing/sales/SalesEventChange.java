package com.ddd.clothing.sales;

import co.com.sofka.domain.generic.EventChange;
import com.ddd.clothing.sales.entities.*;
import com.ddd.clothing.sales.events.*;

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
    }
}
