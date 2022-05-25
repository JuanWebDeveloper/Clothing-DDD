package com.ddd.clothing.shipments.events;

import co.com.sofka.domain.generic.DomainEvent;

import com.ddd.clothing.sales.valueObjects.CustomerID;
import com.ddd.clothing.shipments.valueObjects.ShippingName;
import com.ddd.clothing.shipments.valueObjects.ShippingPhone;

public class NameAndPhoneAssignedAddressee extends DomainEvent {
    private final CustomerID customerID;
    private final ShippingName shippingName;
    private final ShippingPhone shippingPhone;

    public NameAndPhoneAssignedAddressee(CustomerID customerID, ShippingName shippingName, ShippingPhone shippingPhone) {
        super("clothing.inventory.NameAndPhoneAssignedAddressee");
        this.customerID = customerID;
        this.shippingName = shippingName;
        this.shippingPhone = shippingPhone;
    }

    // Show The Properties Of The Entities Of The Aggregate
    public CustomerID getCustomerID() {
        return customerID;
    }

    public ShippingName getShippingName() {
        return shippingName;
    }

    public ShippingPhone getShippingPhone() {
        return shippingPhone;
    }
}
