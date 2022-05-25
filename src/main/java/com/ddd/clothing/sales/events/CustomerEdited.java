package com.ddd.clothing.sales.events;

import co.com.sofka.domain.generic.DomainEvent;

import com.ddd.clothing.sales.valueObjects.CustomerID;
import com.ddd.clothing.sales.valueObjects.Name;
import com.ddd.clothing.sales.valueObjects.Phone;

public class CustomerEdited extends DomainEvent {
    protected final CustomerID customerID;
    protected final Name name;
    protected final Phone phone;

    public CustomerEdited(CustomerID customerID, Name name, Phone phone) {
        super(("clothing.inventory.CustomerEdited"));
        this.customerID = customerID;
        this.name = name;
        this.phone = phone;
    }

    public CustomerID getCustomerID() {
        return customerID;
    }

    public Name getName() {
        return name;
    }

    public Phone getPhone() {
        return phone;
    }
}
