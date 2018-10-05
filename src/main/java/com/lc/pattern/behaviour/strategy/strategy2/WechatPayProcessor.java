package com.lc.pattern.behaviour.strategy.strategy2;

import org.springframework.stereotype.Component;

@Component
public class WechatPayProcessor extends AbstractPayProcessor {
    @Override
    public void prePay() {
        System.out.println("微信支付前处理...");
    }

    @Override
    public void doPay() {
        System.out.println("微信支付支付");
    }

    @Override
    public void afterPay() {
        System.out.println("微信支付后处理...");
    }

    @Override
    public PayChannelEnum getPayChannel() {
        return PayChannelEnum.WECHAT_PAY;
    }
}
