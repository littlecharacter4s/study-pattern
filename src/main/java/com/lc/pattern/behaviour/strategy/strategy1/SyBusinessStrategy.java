package com.lc.pattern.behaviour.strategy.strategy1;

import com.lc.pattern.annotation.Strategy;

@Strategy("BusinessEnum.SY")
public class SyBusinessStrategy implements BusinessStrategy {
    @Override
    public void operate() {
        System.out.println("I am SyBusinessStrategy!");
    }
}
