package com.ddd.clothing.sales.events;

import co.com.sofka.domain.generic.DomainEvent;

import com.ddd.clothing.sales.valueObjects.Name;
import com.ddd.clothing.sales.valueObjects.Phone;
import com.ddd.clothing.sales.valueObjects.SellerID;

public class SellerCreated extends DomainEvent {
    private final SellerID sellerID;
    private final Name name;
    private final Phone phone;

    public SellerCreated(SellerID sellerID, Name name, Phone phone) {
        super("clothing.inventory.SellerCreated");
        this.sellerID = sellerID;
        this.name = name;
        this.phone = phone;
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
