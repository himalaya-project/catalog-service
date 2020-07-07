package com.pdomingo.catalog.domain.event;

import java.util.Map;

public class ProductReservationCommand {

    private String orderId;
    private Map<String, Integer> reserveRequest;

}
