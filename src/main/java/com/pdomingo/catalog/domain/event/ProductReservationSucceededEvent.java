package com.pdomingo.catalog.domain.event;

import com.pdomingo.catalog.domain.model.ids.ReservationId;
import com.pdomingo.kernel.core.ddd.BaseDomainEvent;

import java.time.Instant;

public class ProductReservationSucceededEvent extends BaseDomainEvent<ReservationId> {
    public ProductReservationSucceededEvent(ReservationId sourceId, Instant timestamp) {
        super(sourceId, timestamp);
    }
}
