package com.ddd.clothing.sales.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.ddd.clothing.sales.valueObjects.Payment;

public class SalePaid extends DomainEvent {
    private final Payment payment;

    public SalePaid(Payment payment) {
        super("clothing.inventory.SalePaid");
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }
}
