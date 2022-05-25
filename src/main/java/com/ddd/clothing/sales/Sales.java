package com.ddd.clothing.sales;

// Sofka dependency import
import co.com.sofka.domain.generic.AggregateEvent;

// Entities import
import com.ddd.clothing.sales.entities.Seller;
import com.ddd.clothing.sales.entities.Customer;
import com.ddd.clothing.sales.entities.Order;
import com.ddd.clothing.shipments.valueObjects.ShipmentsID;

// Value objects import
import com.ddd.clothing.sales.valueObjects.*;

import java.util.ArrayList;
import java.util.List;

public class Sales extends AggregateEvent<SalesID> {
    protected List<Seller> sellers = new ArrayList<>();
    protected Seller seller;
    protected Name name;
    protected Phone phone;
    protected List<Customer> customers = new ArrayList<>();
    protected Customer customer;
    protected Date date;
    protected Order order;
    protected ShipmentsID shipmentsID;
    protected Payment payment;
    protected Total total;
    protected Bill bill;

    public Sales(SalesID salesID) {
        super(salesID);
    }
}
