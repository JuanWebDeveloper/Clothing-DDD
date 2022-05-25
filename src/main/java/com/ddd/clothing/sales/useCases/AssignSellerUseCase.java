package com.ddd.clothing.sales.useCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

import com.ddd.clothing.sales.Sales;
import com.ddd.clothing.sales.commands.AssignSeller;

public class AssignSellerUseCase extends UseCase<RequestCommand<AssignSeller>, ResponseEvents> {
    public void executeUseCase(RequestCommand<AssignSeller> assignSellerRequestCommand) {
        AssignSeller command = assignSellerRequestCommand.getCommand();
        Sales sale = Sales.from(command.getSalesID(), retrieveEvents());

        sale.assignSeller(command.getSellerID(), command.getName(), command.getPhone());

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
