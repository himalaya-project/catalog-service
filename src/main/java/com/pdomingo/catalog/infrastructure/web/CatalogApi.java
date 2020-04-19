package com.pdomingo.catalog.infrastructure.web;

import com.pdomingo.catalog.domain.model.ids.ProductId;
import com.pdomingo.catalog.domain.port.primary.usecase.FetchProduct;
import com.pdomingo.catalog.infrastructure.web.model.ProductView;
import com.pdomingo.order.infrastructure.web.model.ShoppingCartView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping(Endpoints.CATALOG_BASE_PATH)
@RequiredArgsConstructor
public class CatalogApi {

    private final FetchProduct fetchProduct;

    @GetMapping(Endpoints.FETCH_PRODUCT)
    public ProductView fetchProduct(@PathVariable String productId) {
        ProductView productView = fetchProduct.fetchSingle(new ProductId(productId));

        return productView;
    }

    @PostMapping
    public Map<String, Collection<ProductView>> fetchMultipleProduct(@RequestBody Map<String, Collection<String>> productIds) {

        Collection<ProductId> products = productIds.get("productIds").stream()
                .map(ProductId::new)
                .collect(Collectors.toList());
        Collection<ProductView> productsView = fetchProduct.fetchMultiple(products);

        return Map.of("products", productsView);
    }

}
