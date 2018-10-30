package com.lc.pattern.behaviour.visitor;

import java.math.BigDecimal;

/**
 * 抽象访问者（Visitor）角色
 * @author LittleRW
 */
public interface Visitor {
	BigDecimal visit(Book book);
	BigDecimal visit(Fruit fruit);
}
