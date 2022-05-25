package com.ddd.clothing.sales.useCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

import com.ddd.clothing.inventory.valueObjects.*;
import com.ddd.clothing.sales.Sales;
import com.ddd.clothing.sales.commands.DeleteProduct;

public class DeleteProductUseCase extends UseCase<RequestCommand<DeleteProduct>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<DeleteProduct> deleteProductRequestCommand) {
        DeleteProduct command = deleteProductRequestCommand.getCommand();
        Sales sale = Sales.from(command.getSalesID(), retrieveEvents());

        sale.addProduct(
            ProductID.of("One Piece"),
            new InventoryName("Wano"),
            new ProductDescription("The best anime of the world"),
            new PriceProduct(10.0),
            new QuantityProducts(5)
        );

        sale.deleteProduct(command.getProductID());

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
