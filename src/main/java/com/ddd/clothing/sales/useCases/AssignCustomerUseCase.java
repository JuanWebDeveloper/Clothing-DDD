package com.ddd.clothing.sales.useCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

import com.ddd.clothing.sales.Sales;
import com.ddd.clothing.sales.commands.AssignCustomer;

public class AssignCustomerUseCase extends UseCase<RequestCommand<AssignCustomer>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AssignCustomer> assignCustomerRequestCommand) {
        AssignCustomer command = assignCustomerRequestCommand.getCommand();
        Sales sale = Sales.from(command.getSalesID(), retrieveEvents());

        sale.assignCustomer(command.getCustomerID(), command.getName(), command.getPhone());

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
