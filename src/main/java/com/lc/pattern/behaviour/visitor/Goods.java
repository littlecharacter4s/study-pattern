package com.lc.pattern.behaviour.visitor;

import java.math.BigDecimal;

/**
 * 抽象元素（Element）角色
 * @author LittleRW
 */
public interface Goods {
	String goodsType();
	BigDecimal accept(Visitor visitor);
}
