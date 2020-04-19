package com.pdomingo.catalog.domain.port.primary.usecase;

import com.pdomingo.catalog.domain.model.ids.ProductId;
import com.pdomingo.catalog.infrastructure.web.model.ProductView;

import java.util.Collection;

public interface FetchProduct {

    ProductView fetchSingle(ProductId productId);
    Collection<ProductView> fetchMultiple(Collection<ProductId> productIds);
}
