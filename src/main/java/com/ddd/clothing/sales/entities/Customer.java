package com.ddd.clothing.sales.entities;

import co.com.sofka.domain.generic.Entity;

// Value objects import
import com.ddd.clothing.sales.valueObjects.CustomerID;
import com.ddd.clothing.sales.valueObjects.Name;
import com.ddd.clothing.sales.valueObjects.Phone;

import java.util.Objects;

public class Customer extends Entity<CustomerID> {
    protected Name customerName;
    protected Phone customerPhone;

    public Customer(CustomerID customerID, Name customerName, Phone customerPhone) {
        super(customerID);
        this.customerName = customerName;
        this.customerPhone = customerPhone;
    }

    public Customer(CustomerID customerID) {
        super(customerID);
    }

    // Show The Entity Properties
    public Name getCustomerName() {
        return customerName;
    }

    public Phone getCustomerPhone() {
        return customerPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerName, customer.customerName) && Objects.equals(customerPhone, customer.customerPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), customerName, customerPhone);
    }
}
