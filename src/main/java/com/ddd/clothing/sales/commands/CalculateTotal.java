package com.ddd.clothing.sales.commands;

import co.com.sofka.domain.generic.Command;
import com.ddd.clothing.sales.valueObjects.SalesID;
import com.ddd.clothing.sales.valueObjects.Total;

public class CalculateTotal extends Command {
    private final SalesID salesID;
    private final Total total;

    public CalculateTotal(SalesID salesID, Total total) {
        this.salesID = salesID;
        this.total = total;
    }

    public SalesID getSalesID() {
        return salesID;
    }

    public Total getTotal() {
        return total;
    }
}
