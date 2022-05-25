package com.ddd.clothing.sales.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date implements ValueObject<String> {
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private final LocalDateTime date = LocalDateTime.now();

    public Date() {
    }

    @Override
    public String value() {
        return formatter.format(date);
    }
}
