package com.ddd.clothing.sales;

// Sofka dependency import
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

// Entities import
import com.ddd.clothing.sales.entities.Seller;
import com.ddd.clothing.sales.entities.Customer;
import com.ddd.clothing.sales.entities.Order;

// Value objects import
import com.ddd.clothing.sales.valueObjects.*;
import com.ddd.clothing.shipments.valueObjects.ShipmentsID;
import com.ddd.clothing.inventory.valueObjects.*;

// Events import
import com.ddd.clothing.sales.events.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    // Behaviors Of The Aggregate
    public void createSeller(SellerID sellerID, Name name, Phone phone) {
        appendChange(new SellerCreated(
                Objects.requireNonNull(sellerID),
                Objects.requireNonNull(name),
                Objects.requireNonNull(phone)
        )).apply();
    }

    public void createCustomer(CustomerID customerID, Name name, Phone phone) {
        appendChange(new CustomerCreated(
                Objects.requireNonNull(customerID),
                Objects.requireNonNull(name),
                Objects.requireNonNull(phone)
        )).apply();
    }

    public void assignCustomer(CustomerID customerID, Name name, Phone phone) {
        appendChange(new AssignedCustomer(
                Objects.requireNonNull(customerID),
                Objects.requireNonNull(name),
                Objects.requireNonNull(phone)
        )).apply();
    }

    public void assignSeller(SellerID sellerID, Name name, Phone phone) {
        appendChange(new AssignedSeller(
                Objects.requireNonNull(sellerID),
                Objects.requireNonNull(name),
                Objects.requireNonNull(phone)
        )).apply();
    }

    public void editSeller(SellerID sellerID, Name name, Phone phone) {
        appendChange(new SellerEdited(
                Objects.requireNonNull(sellerID),
                Objects.requireNonNull(name),
                Objects.requireNonNull(phone)
        )).apply();
    }

    public void editCustomer(CustomerID customerID, Name name, Phone phone) {
        appendChange(new CustomerEdited(
                Objects.requireNonNull(customerID),
                Objects.requireNonNull(name),
                Objects.requireNonNull(phone)
        )).apply();
    }

    public void addProduct(ProductID productID, InventoryName inventoryName, ProductDescription productDescription, PriceProduct priceProduct, QuantityProducts quantityProducts) {
        appendChange(new ProductAdded(
                Objects.requireNonNull(productID),
                Objects.requireNonNull(inventoryName),
                Objects.requireNonNull(productDescription),
                Objects.requireNonNull(priceProduct),
                Objects.requireNonNull(quantityProducts)
        )).apply();
    }

    public void deleteProduct(ProductID productID) {
        appendChange(new ProductDeleted(
                Objects.requireNonNull(productID)
        )).apply();
    }

    public void createOrder(OrderId orderID) {
        appendChange(new OrderCreated(Objects.requireNonNull(orderID))).apply();
    }

    public void calculateTotal(Total total) {
        appendChange(new TotalCalculated(Objects.requireNonNull(total))).apply();
    }

    public void generateBill(Bill bill) {
        appendChange(new BillGenerated(Objects.requireNonNull(bill))).apply();
    }

    public void paySale(Payment payment) {
        appendChange(new SalePaid(Objects.requireNonNull(payment))).apply();
    }

    // Domain events
    public void domainEventToCreateCustomer(CustomerID customerID, Name name, Phone phone) {
        for (Customer customer : customers) {
            if (customer.identity().equals(customerID)) {
                throw new IllegalArgumentException("Customer already exists");
            } else {
                Customer newCustomer = new Customer(customerID, name, phone);
                customers.add(newCustomer);
            }
        }
    }

    public void domainEventToEditCustomer(CustomerID customerID, Name name, Phone phone) {
        for (Customer customer : customers) {
            if (customer.identity().equals(customerID)) {
                customer.customerNameChange(name);
                customer.customerPhoneChange(phone);
            } else {
                throw new IllegalArgumentException("Customer does not exist");
            }
        }
    }

    public void domainEventToDeleteCustomer(CustomerID customerID) {
        for (Customer customer : customers) {
            if (customer.identity().equals(customerID)) {
                customers.remove(customer);
            } else {
                throw new IllegalArgumentException("Customer does not exist");
            }
        }
    }

    public Optional<Customer> domainEventSearchCustomerByID(CustomerID customerID) {
        for (Customer customer : customers) {
            if (customer.identity().equals(customerID)) {
                return Optional.of(customer);
            } else {
                throw new IllegalArgumentException("Customer does not exist");
            }
        }

        return Optional.empty();
    }

    public void domainEventToCreateSeller(SellerID sellerID, Name name, Phone phone) {
        for (Seller seller : sellers) {
            if (seller.identity().equals(sellerID)) {
                throw new IllegalArgumentException("Seller already exists");
            } else {
                Seller newSeller = new Seller(sellerID, name, phone);
                sellers.add(newSeller);
            }
        }
    }

    public void domainEventToEditSeller(SellerID sellerID, Name name, Phone phone) {
        for (Seller seller : sellers) {
            if (seller.identity().equals(sellerID)) {
                seller.sellerNameChange(name);
                seller.sellerPhoneChange(phone);
            } else {
                throw new IllegalArgumentException("Seller does not exist");
            }
        }
    }

    public void domainEventToDeleteSeller(SellerID sellerID) {
        for (Seller seller : sellers) {
            if (seller.identity().equals(sellerID)) {
                sellers.remove(seller);
            } else {
                throw new IllegalArgumentException("Seller does not exist");
            }
        }
    }

    public Optional<Seller> domainEventSearchSellerByID(SellerID sellerID) {
        for (Seller seller : sellers) {
            if (seller.identity().equals(sellerID)) {
                return Optional.of(seller);
            } else {
                throw new IllegalArgumentException("Seller does not exist");
            }
        }

        return Optional.empty();
    }
}
