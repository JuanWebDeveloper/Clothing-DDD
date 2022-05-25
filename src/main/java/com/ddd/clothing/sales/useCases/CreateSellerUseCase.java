package com.ddd.clothing.sales.useCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.ddd.clothing.sales.Sales;
import com.ddd.clothing.sales.commands.CreateSeller;
import com.ddd.clothing.sales.commands.EditSeller;

public class CreateSellerUseCase extends UseCase<RequestCommand<CreateSeller>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateSeller> createSellerRequestCommand) {
        CreateSeller command = createSellerRequestCommand.getCommand();
        Sales sale = Sales.from(command.getSalesID(), retrieveEvents());

        sale.createSeller(command.getSellerID(), command.getName(), command.getPhone());

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}