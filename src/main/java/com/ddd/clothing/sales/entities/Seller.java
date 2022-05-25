package com.ddd.clothing.sales.entities;

import co.com.sofka.domain.generic.Entity;

// Value objects import
import com.ddd.clothing.sales.valueObjects.SellerID;
import com.ddd.clothing.sales.valueObjects.Name;
import com.ddd.clothing.sales.valueObjects.Phone;

import java.util.Objects;

public class Seller extends Entity<SellerID> {
    protected SellerID sellerID;
    protected Name sellerName;
    protected Phone sellerPhone;

    public Seller(SellerID sellerID, Name sellerName, Phone sellerPhone) {
        super(sellerID);
        this.sellerName = sellerName;
        this.sellerPhone = sellerPhone;
    }

    public Seller(SellerID sellerID) {
        super(sellerID);
    }

    // Methods Of The Entity
    public void sellerNameChange(Name newSellerName) {
        this.sellerName = Objects.requireNonNull(newSellerName);
    }

    public void sellerPhoneChange(Phone newSellerPhone) {
        this.sellerPhone = Objects.requireNonNull(newSellerPhone);
    }

    // Show The Entity Properties
    public SellerID getSellerID() {
        return sellerID;
    }

    public Name getSellerName() {
        return sellerName;
    }

    public Phone getSellerPhone() {
        return sellerPhone;
    }
}
