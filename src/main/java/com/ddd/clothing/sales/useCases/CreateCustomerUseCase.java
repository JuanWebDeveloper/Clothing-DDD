package com.ddd.clothing.sales.useCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

import com.ddd.clothing.sales.Sales;
import com.ddd.clothing.sales.commands.CreateCustomer;

public class CreateCustomerUseCase extends UseCase<RequestCommand<CreateCustomer>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateCustomer> assignCustomerRequestCommand) {
        CreateCustomer command = assignCustomerRequestCommand.getCommand();
        Sales sale = Sales.from(command.getSalesID(), retrieveEvents());

        sale.createCustomer(command.getCustomerID(), command.getName(), command.getPhone());

        emit().onResponse((new ResponseEvents(sale.getUncommittedChanges())));
    }
}
