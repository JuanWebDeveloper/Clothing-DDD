package com.ddd.clothing.shipments.valueObjects;

import co.com.sofka.domain.generic.Identity;

public class DomiciliaryID extends Identity {
    private DomiciliaryID(String id) {
        super(id);
    }

    public DomiciliaryID() {}

    public static DomiciliaryID of(String id){
        return new DomiciliaryID(id);
    }
}
