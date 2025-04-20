package com.food.ordering.system.domain.valueobject;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@EqualsAndHashCode
public abstract class BaseId<T> {
    private final T value;
}
