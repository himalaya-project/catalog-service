package com.pdomingo.catalog.infrastructure.web.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.money.MonetaryAmount;
import java.util.Collection;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record ProductView(
        String productId,
        String name,
        String description,
        String brand,
        String model,
        String category,
        MonetaryAmount retailPrice,
        long stock,
        Collection<String> images
) {}
