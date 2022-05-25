package com.ddd.clothing.sales.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class Payment implements ValueObject<Payment.Phase> {
    private final Phase phase;

    public Payment(Phase phase) {
        this.phase = phase;
    }

    @Override
    public Phase value() {
        return phase;
    }

    public enum Phase {
        PAID_OUT,
        WITHOUT_PAYMENT
    }
}
