package com.ddd.clothing.sales.useCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

import com.ddd.clothing.sales.Sales;
import com.ddd.clothing.sales.commands.CreateOrder;

public class CreateOrderUseCase extends UseCase<RequestCommand<CreateOrder>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateOrder> createOrderRequestCommand) {
        CreateOrder command = createOrderRequestCommand.getCommand();
        Sales sale = Sales.from(command.getSalesID(), retrieveEvents());

        sale.createOrder(command.getOrderId());

        emit().onResponse((new ResponseEvents(sale.getUncommittedChanges())));
    }
}
