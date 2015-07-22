package io.galeb.core.loadbalance.hash;

import io.galeb.core.loadbalance.impl.HashPolicy;

public interface ExtractableKey {

    public ExtractableKey NULL = new ExtractableKey() {
        // NULL
    };

    default ExtractableKey from(String from) {
        return this;
    }

    default String get(Object extractable) {
        return HashPolicy.DEFAULT_KEY;
    }

}