package com.pdomingo.catalog.domain.event;

import com.pdomingo.catalog.domain.model.ids.ReservationId;
import com.pdomingo.kernel.core.ddd.BaseDomainEvent;

import java.time.Instant;

public class ProductReservationFailedEvent extends BaseDomainEvent<ReservationId> {
    public ProductReservationFailedEvent(ReservationId sourceId, Instant timestamp) {
        super(sourceId, timestamp);
    }
}
