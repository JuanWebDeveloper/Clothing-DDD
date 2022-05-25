package com.ddd.clothing.sales.commands;

import co.com.sofka.domain.generic.Command;
import com.ddd.clothing.sales.valueObjects.Date;
import com.ddd.clothing.sales.valueObjects.SalesID;

public class CreateSale extends Command {
    private final SalesID salesID;
    private final Date date;

    public CreateSale(SalesID salesID, Date date) {
        this.salesID = salesID;
        this.date = date;
    }

    public SalesID getSalesID() {
        return salesID;
    }

    public Date getDate() {
        return date;
    }
}
