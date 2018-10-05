package com.lc.pattern.behaviour.strategy.strategy1;

import com.lc.pattern.annotation.Strategy;
import com.lc.pattern.util.SpringUtil;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {
    private StrategyFactory() {
    }

    private static class StrategyFactoryInner {
        private StrategyFactoryInner() {
        }

        private static Map<String, BusinessStrategy> strategyMap = new HashMap<>();

        static {
            SpringUtil.getApplicationContext()
                    .getBeansWithAnnotation(Strategy.class)
                    .forEach((key, value) -> strategyMap.put(key, (BusinessStrategy) value));
        }
    }

    public static BusinessStrategy getStrategy(String strategy) {
        return StrategyFactoryInner.strategyMap.get(strategy);
    }
}
