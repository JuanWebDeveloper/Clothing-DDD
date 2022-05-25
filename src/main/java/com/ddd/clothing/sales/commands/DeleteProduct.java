package com.ddd.clothing.sales.commands;

import co.com.sofka.domain.generic.Command;
import com.ddd.clothing.inventory.valueObjects.ProductID;
import com.ddd.clothing.sales.valueObjects.SalesID;

public class DeleteProduct extends Command {
    private final SalesID salesID;
    private final ProductID productID;

    public DeleteProduct(SalesID salesID, ProductID productID) {
        this.salesID = salesID;
        this.productID = productID;
    }

    public SalesID getSalesID() {
        return salesID;
    }

    public ProductID getProductID() {
        return productID;
    }
}
