package com.lc.pattern.behaviour.visitor;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 对象结构（ObiectStructure）角色
 * @author LittleRW
 */
public class ShoppingCart {
	private Visitor visitor;
	private List<Goods> goodsList = new ArrayList<Goods>();
	
	public ShoppingCart(Visitor visitor) {
		super();
		this.visitor = visitor;
	}

	public void addGoods(Goods goods) {
		goodsList.add(goods);
	}
	
	public BigDecimal settleAccounts(){
		BigDecimal total = new BigDecimal(0);
		Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
		for (Goods goods1 : goodsList) {
			String type = goods1.goodsType();
			BigDecimal typeTotal = new BigDecimal(0);
			if (!map.containsKey(type)) {
				for (Goods goods2 : goodsList) {
					if (type.equals(goods2.goodsType())) {
						BigDecimal nameTotal = goods2.accept(visitor);
						typeTotal = typeTotal.add(nameTotal);
						total = total.add(nameTotal);
					}
				}
				map.put(type, typeTotal);
			}
		}
		
		DecimalFormat df = new DecimalFormat("0.00");
		for (Map.Entry<String, BigDecimal> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + df.format(entry.getValue()));
		}
		
		return total;
	}
}
