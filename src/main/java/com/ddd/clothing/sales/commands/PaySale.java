package com.ddd.clothing.sales.commands;

import co.com.sofka.domain.generic.Command;

import com.ddd.clothing.sales.valueObjects.Payment;
import com.ddd.clothing.sales.valueObjects.SalesID;

public class PaySale extends Command {
    private SalesID salesID;
    private final Payment payment;

    public PaySale(SalesID salesID, Payment payment) {
        this.salesID = salesID;
        this.payment = payment;
    }

    public SalesID getSalesID() {
        return salesID;
    }

    public Payment getPayment() {
        return payment;
    }
}

