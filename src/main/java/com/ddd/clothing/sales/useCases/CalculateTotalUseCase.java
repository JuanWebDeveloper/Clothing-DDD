package com.ddd.clothing.sales.useCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.ddd.clothing.sales.Sales;
import com.ddd.clothing.sales.commands.CalculateTotal;
import com.ddd.clothing.sales.commands.EditCustomer;

public class CalculateTotalUseCase extends UseCase<RequestCommand<CalculateTotal>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CalculateTotal> calculateTotalRequestCommand) {
        CalculateTotal command = calculateTotalRequestCommand.getCommand();
        Sales sale = Sales.from(command.getSalesID(), retrieveEvents());

        sale.calculateTotal(command.getTotal());

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}
