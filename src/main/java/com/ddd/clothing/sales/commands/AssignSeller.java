package com.ddd.clothing.sales.commands;

import co.com.sofka.domain.generic.Command;

import com.ddd.clothing.sales.valueObjects.SalesID;
import com.ddd.clothing.sales.valueObjects.SellerID;
import com.ddd.clothing.sales.valueObjects.Name;
import com.ddd.clothing.sales.valueObjects.Phone;

public class AssignSeller extends Command {
    private final SalesID salesID;
    private final SellerID sellerID;
    private final Name name;
    private final Phone phone;

    public AssignSeller(SalesID salesID, SellerID sellerID, Name name, Phone phone) {
        this.salesID = salesID;
        this.sellerID = sellerID;
        this.name = name;
        this.phone = phone;
    }

    public SalesID getSalesID() {
        return salesID;
    }

    public SellerID getSellerID() {
        return sellerID;
    }

    public Name getName() {
        return name;
    }

    public Phone getPhone() {
        return phone;
    }
}
