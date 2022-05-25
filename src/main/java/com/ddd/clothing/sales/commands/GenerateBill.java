package com.ddd.clothing.sales.commands;

import co.com.sofka.domain.generic.Command;

import com.ddd.clothing.sales.valueObjects.SalesID;
import com.ddd.clothing.sales.valueObjects.Bill;

public class GenerateBill extends Command {
    private final SalesID salesID;
    private final Bill bill;

    public GenerateBill(SalesID salesID, Bill bill) {
        this.salesID = salesID;
        this.bill = bill;
    }

    public SalesID getSalesID() {
        return salesID;
    }

    public Bill getBill() {
        return bill;
    }
}
