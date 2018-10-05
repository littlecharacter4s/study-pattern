package com.lc.pattern.behaviour.strategy.strategy2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public interface PayProcessor {
    static Map<PayChannelEnum, PayProcessor> payProcessorMap = new ConcurrentHashMap<>();

    void process();
}
