package com.lc.pattern.behaviour.visitor;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Client角色
 * @author LittleRW
 */
public class VisitorDemo {
	public static void main(String[] args) {
		Visitor visitor = new ShoppingCartVisitor();
		ShoppingCart sc = new ShoppingCart(visitor);

		sc.addGoods(new Book("Java编程思想", new BigDecimal(35.5), 2, "Book"));
		sc.addGoods(new Book("JVM高级特性", new BigDecimal(67.3), 3, "Book"));
		sc.addGoods(new Fruit("Apple", new BigDecimal(4.5), new BigDecimal(4.3), "Fruit"));
		sc.addGoods(new Fruit("Banana", new BigDecimal(3.9), new BigDecimal(6.7), "Fruit"));

		BigDecimal total = sc.settleAccounts();
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("总价:" + df.format(total));
	}
}
