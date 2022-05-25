package com.ddd.clothing.sales.useCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

import com.ddd.clothing.sales.Sales;
import com.ddd.clothing.sales.commands.EditSeller;

public class EditSellerUseCase extends UseCase<RequestCommand<EditSeller>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EditSeller> editSellerRequestCommand) {
        EditSeller command = editSellerRequestCommand.getCommand();
        Sales sale = Sales.from(command.getSalesID(), retrieveEvents());

        sale.editSeller(command.getSellerID(), command.getName(), command.getPhone());

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}