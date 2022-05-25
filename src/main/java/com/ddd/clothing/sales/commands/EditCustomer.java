package com.ddd.clothing.sales.commands;

import co.com.sofka.domain.generic.Command;

import com.ddd.clothing.sales.valueObjects.SalesID;
import com.ddd.clothing.sales.valueObjects.CustomerID;
import com.ddd.clothing.sales.valueObjects.Name;
import com.ddd.clothing.sales.valueObjects.Phone;

public class EditCustomer extends Command {
    private final SalesID salesID;
    private final CustomerID customerID;
    private final Name name;
    private final Phone phone;

    public EditCustomer(SalesID salesID, CustomerID customerID, Name name, Phone phone) {
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
