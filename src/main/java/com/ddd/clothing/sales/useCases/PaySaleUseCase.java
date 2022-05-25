package com.ddd.clothing.sales.useCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.ddd.clothing.sales.Sales;
import com.ddd.clothing.sales.commands.PaySale;

public class PaySaleUseCase extends UseCase<RequestCommand<PaySale>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<PaySale> paySaleRequestCommand) {
        PaySale command = paySaleRequestCommand.getCommand();
        Sales sale= Sales.from(command.getSalesID(), retrieveEvents());

        sale.paySale(command.getPayment());

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
