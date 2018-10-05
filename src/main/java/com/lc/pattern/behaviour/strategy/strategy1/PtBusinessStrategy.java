package com.lc.pattern.behaviour.strategy.strategy1;

import com.lc.pattern.annotation.Strategy;

@Strategy("BusinessEnum.PT")
public class PtBusinessStrategy implements BusinessStrategy {
    @Override
    public void operate() {
        System.out.println("I am PtBusinessStrategy!");
    }
}
