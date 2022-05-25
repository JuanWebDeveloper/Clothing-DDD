package com.ddd.clothing.sales.events;

import co.com.sofka.domain.generic.DomainEvent;

import com.ddd.clothing.sales.valueObjects.CustomerID;
import com.ddd.clothing.sales.valueObjects.Name;
import com.ddd.clothing.sales.valueObjects.Phone;

public class AssignedCustomer extends DomainEvent {
    private final CustomerID customerID;
    private final Name name;
    private final Phone phone;

    public AssignedCustomer(CustomerID customerID, Name name, Phone phone) {
        super("clothing.inventory.AssignedCustomer");
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
