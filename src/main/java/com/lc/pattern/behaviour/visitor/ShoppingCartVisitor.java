package com.lc.pattern.behaviour.visitor;

import java.math.BigDecimal;

/**
 * 具体访问者（ConcreteVisitor）角色
 * @author LittleRW
 */
public class ShoppingCartVisitor implements Visitor{
	@Override
	public BigDecimal visit(Book book) {
		//可以加一些折扣策略 -> Strategy(策略模式)
		BigDecimal total = new BigDecimal(0);
		BigDecimal price = book.getPrice();
		int count = book.getCount();
		total = price.multiply(new BigDecimal(count));
		//System.out.println(book.getName() + ":" + total);
		return total;
	}

	@Override
	public BigDecimal visit(Fruit fruit) {
		//可以加一些折扣策略 -> Strategy(策略模式)
		BigDecimal total = new BigDecimal(0);
		BigDecimal price = fruit.getPrice();
		BigDecimal weight = fruit.getWeight();
		total = price.multiply(weight);
		//System.out.println(fruit.getName() + ":" + total);
		return total;
	}
}

