package com.pdomingo.catalog.domain.port.secondary;

import com.pdomingo.kernel.core.ddd.Repository;
import com.pdomingo.catalog.domain.model.Product;
import com.pdomingo.catalog.domain.model.ids.ProductId;

public interface ProductRepository extends Repository<Product, ProductId> {
}
