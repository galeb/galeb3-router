package io.galeb.core.loadbalance.impl;

import io.galeb.core.loadbalance.LoadBalancePolicy;

public class RandomPolicy extends LoadBalancePolicy {

    @Override
    public int getChoice() {
        int chosen = (int) (Math.random() * (hosts.size() - Float.MIN_VALUE));
        last.lazySet(chosen);
        return chosen;
    }

}