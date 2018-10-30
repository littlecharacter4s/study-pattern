package com.lc.pattern.behaviour.visitor;

import java.math.BigDecimal;

/**
 * 具体元素（ConcreteElement）角色
 * @author LittleRW
 */
public class Fruit implements Goods{
	private String name;
	private BigDecimal price;
	private BigDecimal weight;
	private String type;

	public Fruit(String name, BigDecimal price, BigDecimal weight, String type) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
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

	public BigDecimal getWeight() {
		return weight;
	}
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
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
