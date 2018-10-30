package com.lc.pattern.behaviour.visitor;

import java.math.BigDecimal;

/**
 * 具体元素（ConcreteElement）角色
 * @author LittleRW
 */
public class Book implements Goods{
	private String name;
	private BigDecimal price;
	private int count;
	private String type;
	
	public Book(String name, BigDecimal price, int count, String type) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
		this.type = type;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String goodsType() {
		return type;
	}
	
	@Override
	public BigDecimal accept(Visitor visitor) {
		return visitor.visit(this);
	}
}
