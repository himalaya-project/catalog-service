package com.pdomingo.catalog.domain.model;

import com.pdomingo.kernel.core.util.MorePreconditions;

public class Specification {
    private final String name;
    private final String description;
    private final String brand;
    private final String model;

    public Specification(String name, String description, String brand, String model) {
        this.name = MorePreconditions.checkNotEmptyOrNull(name, "name");
        this.description = MorePreconditions.checkNotEmptyOrNull(description, "description");
        this.brand = MorePreconditions.checkNotEmptyOrNull(brand, "brand");
        this.model = MorePreconditions.checkNotEmptyOrNull(model, "model");
    }

    public String name() {
        return name;
    }

    public String description() {
        return description;
    }

    public String brand() {
        return brand;
    }

    public String model() {
        return model;
    }
}
