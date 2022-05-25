package com.ddd.clothing.sales.commands;

import co.com.sofka.domain.generic.Command;
import com.ddd.clothing.sales.valueObjects.CustomerID;
import com.ddd.clothing.sales.valueObjects.Name;
import com.ddd.clothing.sales.valueObjects.Phone;
import com.ddd.clothing.sales.valueObjects.SalesID;

public class AssignCustomer extends Command {
    private final SalesID salesID;
    private final CustomerID customerID;
    private final Name name;
    private final Phone phone;

    public AssignCustomer(SalesID salesID, CustomerID customerID, Name name, Phone phone) {
        this.salesID = salesID;
        this.customerID = customerID;
        this.name = name;
        this.phone = phone;
    }

    public SalesID getSalesID() {
        return this.salesID;
    }

    public CustomerID getCustomerID() {
        return this.customerID;
    }

    public Name getName() {
        return this.name;
    }

    public Phone getPhone() {
        return this.phone;
    }
}