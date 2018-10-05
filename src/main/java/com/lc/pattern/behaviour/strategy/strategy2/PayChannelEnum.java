package com.lc.pattern.behaviour.strategy.strategy2;

import java.util.Arrays;

public enum PayChannelEnum {
    // 支付宝支付
    ALI_PAY(1, "支付宝支付"),
    // 微信支付
    WECHAT_PAY(2, "微信支付");

    private int code;
    private String desc;

    PayChannelEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static PayChannelEnum findStrategyEnum(Integer code) {
        return Arrays.stream(PayChannelEnum.values()).filter(payChannelEnum -> payChannelEnum.getCode() == code).findFirst().orElse(null);
    }
}
