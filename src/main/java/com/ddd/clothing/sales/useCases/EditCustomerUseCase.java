package com.ddd.clothing.sales.useCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

import com.ddd.clothing.sales.Sales;
import com.ddd.clothing.sales.commands.EditCustomer;

public class EditCustomerUseCase extends UseCase<RequestCommand<EditCustomer>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EditCustomer> editCustomerRequestCommand) {
        EditCustomer command = editCustomerRequestCommand.getCommand();
        Sales sale = Sales.from(command.getSalesID(), retrieveEvents());

        sale.editCustomer(command.getCustomerID(), command.getName(), command.getPhone());

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
