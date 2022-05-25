package com.ddd.clothing.shipments.entities;

// Imports of the customer
import com.ddd.clothing.sales.entities.Customer;
import com.ddd.clothing.sales.valueObjects.CustomerID;

// Value objects import
import com.ddd.clothing.shipments.valueObjects.AddresseeID;
import com.ddd.clothing.shipments.valueObjects.Address;
import com.ddd.clothing.shipments.valueObjects.ShippingName;
import com.ddd.clothing.shipments.valueObjects.ShippingPhone;

public class Addressee extends Customer {
    protected AddresseeID addresseeID;
    protected Address address;
    protected ShippingName shippingName;
    protected ShippingPhone shippingPhone;

    public Addressee(CustomerID customerID, AddresseeID addresseeID, Address address, ShippingName shippingName, ShippingPhone shippingPhone) {
        super(customerID);
        this.addresseeID = addresseeID;
        this.address = address;
        this.shippingName = shippingName;
        this.shippingPhone = shippingPhone;
    }

    public Address getAddress() {
        return address;
    }
}
