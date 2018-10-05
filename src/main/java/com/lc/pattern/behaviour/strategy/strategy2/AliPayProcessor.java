package com.lc.pattern.behaviour.strategy.strategy2;

import org.springframework.stereotype.Component;

@Component
public class AliPayProcessor extends AbstractPayProcessor {
    @Override
    public void prePay() {
        System.out.println("阿里支付前处理...");
    }

    @Override
    public void doPay() {
        System.out.println("阿里支付支付");
    }

    @Override
    public void afterPay() {
        System.out.println("阿里支付后处理...");
    }

    @Override
    public PayChannelEnum getPayChannel() {
        return PayChannelEnum.ALI_PAY;
    }
}
