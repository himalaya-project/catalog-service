package com.pdomingo.catalog.infrastructure.repository;

import com.pdomingo.catalog.domain.model.Product;
import com.pdomingo.catalog.domain.model.Specification;
import com.pdomingo.catalog.domain.model.ids.ImageId;
import com.pdomingo.catalog.domain.model.ids.ProductId;
import com.pdomingo.catalog.domain.port.secondary.ProductRepository;
import org.javamoney.moneta.Money;
import org.springframework.stereotype.Repository;

import java.security.SecureRandom;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class ProductRepositoryAdapter implements ProductRepository {

    private static final SecureRandom rnd = new SecureRandom();

    private static final Product sample = new Product(
            new ProductId(UUID.randomUUID()),
            new Specification(
                "Sample",
                "Description",
                "Brand",
                "Model"
            ),
            "Category",
            Money.of(rnd.nextInt(1000), "EUR"),
            1,
            List.of(new ImageId(UUID.randomUUID()), new ImageId(UUID.randomUUID()))
    );

    @Override
    public Optional<Product> findById(ProductId productId) {
        return Optional.of(sample);
    }
}
