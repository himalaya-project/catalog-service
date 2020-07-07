package com.pdomingo.catalog.domain.model;

import com.pdomingo.catalog.domain.model.ids.ProductId;
import com.pdomingo.catalog.domain.model.ids.ReservationId;
import com.pdomingo.kernel.core.ddd.AggregateRoot;

import java.util.Map;

public class Reservation extends AggregateRoot<ReservationId> {

    private final ReservationId reservationId;

    private String orderId;
    private Map<ProductId, Integer> reservedStock;

    public Reservation(ReservationId reservationId, String orderId, Map<ProductId, Integer> reservedStock) {
        this.reservationId = reservationId;
        this.orderId = orderId;
        this.reservedStock = reservedStock;
    }

    @Override
    public ReservationId id() {
        return reservationId;
    }
}
