package com.pdomingo.catalog.domain.model.ids;

import com.pdoming.kernel.core.ddd.DelegatedIdentifier;

import java.util.UUID;

public class ImageId extends DelegatedIdentifier<UUID> {
    public ImageId(UUID value) {
        super(value);
    }

    public ImageId(String value) {
        super(UUID.fromString(value));
    }
}
