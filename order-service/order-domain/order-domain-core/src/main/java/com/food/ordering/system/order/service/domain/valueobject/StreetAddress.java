package com.food.ordering.system.order.service.domain.valueobject;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@AllArgsConstructor
@EqualsAndHashCode(exclude = {"id"})
public class StreetAddress {

    private final UUID id;
    private final String street;
    private final String city;
    private final String postalCode;

}
