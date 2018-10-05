package com.lc.pattern.behaviour.strategy.strategy2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public abstract class AbstractPayProcessor implements PayProcessor {
    @PostConstruct
    public void init() {
        payProcessorMap.put(this.getPayChannel(), this);
    }

    @Override
    public void process() {
        this.prePay();
        this.doPay();
        this.afterPay();
    }

    public abstract void prePay();
    public abstract void doPay();
    public abstract void afterPay();

    public abstract PayChannelEnum getPayChannel();
}
