package com.lc.pattern.behaviour.strategy;

import com.lc.pattern.behaviour.strategy.strategy1.BusinessEnum;
import com.lc.pattern.behaviour.strategy.strategy1.StrategyFactory;
import com.lc.pattern.behaviour.strategy.strategy2.PayChannelEnum;
import com.lc.pattern.behaviour.strategy.strategy2.PayProcessor;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan("com.lc.pattern.behaviour.strategy")
public class StrategyDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(StrategyDemo.class);
        PayProcessor.payProcessorMap.get(PayChannelEnum.ALI_PAY).process();
        PayProcessor.payProcessorMap.get(PayChannelEnum.WECHAT_PAY).process();

        StrategyFactory.getStrategy(BusinessEnum.getName(BusinessEnum.SY)).operate();
        StrategyFactory.getStrategy(BusinessEnum.getName(BusinessEnum.JZ)).operate();
        StrategyFactory.getStrategy(BusinessEnum.getName(BusinessEnum.PT)).operate();
    }
}
