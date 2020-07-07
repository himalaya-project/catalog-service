package com.pdomingo.catalog.domain.model;

import com.pdomingo.kernel.core.ddd.AggregateRoot;
import com.pdomingo.kernel.core.util.MorePreconditions;
import com.pdomingo.catalog.domain.model.ids.ImageId;
import com.pdomingo.catalog.domain.model.ids.ProductId;

import javax.money.MonetaryAmount;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;

public class Product extends AggregateRoot<ProductId> {

    private final ProductId productId;
    private Specification specs;
    private String category;
    private MonetaryAmount retailPrice;
    private long stock;
    private Collection<ImageId> images;

    public Product(ProductId productId, Specification specs, String category,
                   MonetaryAmount retailPrice, long stock, Collection<ImageId> images)
    {
        this.productId = Objects.requireNonNull(productId);
        this.specs = Objects.requireNonNull(specs);
        this.category = MorePreconditions.checkNotEmptyOrNull(category, "category");
        this.retailPrice = Objects.requireNonNull(retailPrice);
        this.stock = stock;
        this.images = Optional.ofNullable(images).orElseGet(Collections::emptyList);
    }

    @Override
    public ProductId id() {
        return productId;
    }

    public Specification specification() {
        return specs;
    }

    public String category() {
        return category;
    }

    public MonetaryAmount retailPrice() {
        return retailPrice;
    }

    public long stock() {
        return stock;
    }

    public Collection<ImageId> images() {
        return images;
    }
}
