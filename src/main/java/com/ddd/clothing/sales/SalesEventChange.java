package com.ddd.clothing.sales;

import co.com.sofka.domain.generic.EventChange;
import com.ddd.clothing.sales.events.*;

public class SalesEventChange extends EventChange {
    public SalesEventChange(Sales sales) {
        apply((SaleCreated event) -> {
            sales.date = event.getDate();
        });

        apply((SellerCreated event) -> {
            sales.createSeller(event.getSellerID(), event.getName(), event.getPhone());
        });
    }
}
