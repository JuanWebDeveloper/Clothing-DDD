package com.ddd.clothing.sales.useCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

import com.ddd.clothing.sales.Sales;
import com.ddd.clothing.sales.commands.AddProduct;

public class AddProductUseCase extends UseCase<RequestCommand<AddProduct>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddProduct> addProductRequestCommand) {
        AddProduct command = addProductRequestCommand.getCommand();
        Sales sale = Sales.from(command.getSalesID(), retrieveEvents());

        sale.addProduct(command.getProductID(), command.getInventoryName(), command.getProductDescription(), command.getPriceProduct(), command.getQuantityProducts());

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
