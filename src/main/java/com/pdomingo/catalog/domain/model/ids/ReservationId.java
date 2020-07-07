package com.pdomingo.catalog.domain.model.ids;

import com.pdomingo.kernel.core.ddd.DelegatedIdentifier;

import java.util.UUID;

public class ReservationId extends DelegatedIdentifier<UUID> {
    public ReservationId(UUID value) {
        super(value);
    }

    public ReservationId(String value) {
        super(UUID.fromString(value));
    }
}
