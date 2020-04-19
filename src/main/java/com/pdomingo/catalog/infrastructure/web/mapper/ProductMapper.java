package com.pdomingo.catalog.infrastructure.web.mapper;

import com.pdomingo.catalog.domain.model.Product;
import com.pdomingo.catalog.infrastructure.web.model.ProductView;

import java.util.Objects;
import java.util.stream.Collectors;

public class ProductMapper {

    public static ProductView toView(Product product) {
        return new ProductView(
                product.id().toString(),
                product.specification().name(),
                product.specification().description(),
                product.specification().brand(),
                product.specification().model(),
                product.category(),
                product.retailPrice(),
                product.stock(),
                product.images().stream().map(Objects::toString).collect(Collectors.toSet())
        );
    }
}
