package com.ddd.clothing.shipments;

// Sofka dependency import
import co.com.sofka.domain.generic.AggregateEvent;

// Imports of the sales
import com.ddd.clothing.sales.valueObjects.Date;
import com.ddd.clothing.sales.valueObjects.SellerID;

// Value objects import
import com.ddd.clothing.shipments.valueObjects.AddresseeID;
import com.ddd.clothing.shipments.valueObjects.ShipmentsID;
import com.ddd.clothing.shipments.valueObjects.ShippingDescription;

public class Shipments extends AggregateEvent<ShipmentsID> {
    protected AddresseeID addresseeID;
    protected SellerID sellerID;
    protected Date date;
    protected ShippingDescription shippingDescription;


    public Shipments(ShipmentsID shipmentsID) {
        super(shipmentsID);
    }
}
