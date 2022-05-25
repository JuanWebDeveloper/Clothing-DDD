package com.ddd.clothing.sales;

// Sofka dependency import
import co.com.sofka.domain.generic.AggregateEvent;

// Entities import
import co.com.sofka.domain.generic.DomainEvent;
import com.ddd.clothing.sales.entities.Seller;
import com.ddd.clothing.sales.entities.Customer;
import com.ddd.clothing.sales.entities.Order;
import com.ddd.clothing.shipments.valueObjects.ShipmentsID;

// Value objects import
import com.ddd.clothing.sales.valueObjects.*;

// Events import
import com.ddd.clothing.sales.events.*;

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

    public Sales(SalesID salesID, Date date) {
        super(salesID);
        subscribe(new SalesEventChange(this));
        appendChange(new SaleCreated(salesID, date)).apply();
    }

    private Sales(SalesID salesID) {
        super(salesID);
        subscribe(new SalesEventChange(this));
    }

    // Get Event Logs
    public static Sales from(SalesID salesID, List<DomainEvent> events) {
        Sales sales = new Sales(salesID);
        events.forEach(sales::applyEvent);
        return sales;
    }
}
