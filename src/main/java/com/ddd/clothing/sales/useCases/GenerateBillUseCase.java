package com.ddd.clothing.sales.useCases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.ddd.clothing.sales.Sales;
import com.ddd.clothing.sales.commands.GenerateBill;

public class GenerateBillUseCase extends UseCase<RequestCommand<GenerateBill>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<GenerateBill> generateBillRequestCommand) {
        GenerateBill command = generateBillRequestCommand.getCommand();
        Sales sale = Sales.from(command.getSalesID(), retrieveEvents());

        sale.generateBill(command.getBill());

        emit().onResponse(new ResponseEvents(sale.getUncommittedChanges()));
    }
}