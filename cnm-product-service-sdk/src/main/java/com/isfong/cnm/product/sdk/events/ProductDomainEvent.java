package com.isfong.cnm.product.sdk.events;

import io.eventuate.tram.events.common.DomainEvent;

public abstract class ProductDomainEvent implements DomainEvent {
    public static final String AggregateType = "com.example.product.domain.models.entities.Product";
}
