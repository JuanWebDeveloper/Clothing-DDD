package com.ddd.clothing.sales.useCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

import com.ddd.clothing.sales.Sales;
import com.ddd.clothing.sales.commands.CreateSale;

public class CreateSaleUseCase extends UseCase<RequestCommand<CreateSale>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateSale> createSaleRequestCommand) {
        CreateSale command = createSaleRequestCommand.getCommand();
        Sales sale = new Sales(command.getSalesID(), command.getDate());

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}

