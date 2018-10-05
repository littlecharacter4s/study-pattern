package com.lc.pattern.behaviour.strategy.strategy1;

import java.util.Arrays;

public enum BusinessEnum {
    // 速运业务线
    SY(1, "速运业务线"),
    // 家政业务线
    JZ(2, "家政业务线"),
    // 平台业务线
    PT(3, "平台业务线");

    private int code;
    private String desc;

    BusinessEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static BusinessEnum findStrategyEnum(Integer code) {
        return Arrays.stream(BusinessEnum.values()).filter(businessEnum -> businessEnum.getCode() == code).findFirst().orElse(null);
    }

    public static String getName (BusinessEnum businessEnum) {
        return "BusinessEnum." + businessEnum.name();
    }
}
