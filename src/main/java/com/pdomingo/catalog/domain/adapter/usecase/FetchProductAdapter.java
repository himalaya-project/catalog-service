package com.pdomingo.catalog.domain.adapter.usecase;

import com.pdomingo.catalog.domain.model.Product;
import com.pdomingo.catalog.domain.model.ids.ProductId;
import com.pdomingo.catalog.domain.port.primary.usecase.FetchProduct;
import com.pdomingo.catalog.domain.port.secondary.ProductRepository;
import com.pdomingo.catalog.infrastructure.web.mapper.ProductMapper;
import com.pdomingo.catalog.infrastructure.web.model.ProductView;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class FetchProductAdapter implements FetchProduct {

    private final ProductRepository productRepository;

    @Override
    public ProductView fetchSingle(ProductId productId) {
         return productRepository.findById(productId)
            .map(ProductMapper::toView)
            .orElseThrow();
    }

    @Override
    public Collection<ProductView> fetchMultiple(Collection<ProductId> productIds) {
        return productIds.stream().map(this::fetchSingle).collect(Collectors.toList());
    }
}
