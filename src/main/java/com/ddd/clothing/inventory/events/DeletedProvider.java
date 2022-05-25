package com.ddd.clothing.inventory.events;

import co.com.sofka.domain.generic.DomainEvent;

import com.ddd.clothing.inventory.valueObjects.ProviderID;

public class DeletedProvider extends DomainEvent {
    private final ProviderID providerID;

    public DeletedProvider(ProviderID providerID) {
        super("clothing.inventory.DeletedProvider");
        this.providerID = providerID;
    }

    public ProviderID getProviderID() {
        return providerID;
    }
}
