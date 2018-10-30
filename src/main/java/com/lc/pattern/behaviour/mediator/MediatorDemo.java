package com.lc.pattern.behaviour.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 主类
 * @author LittleCharacter
 */
public class MediatorDemo {
	public static void main(String[] args) {
		HouseMediator hm = new HouseMediator();
		HouseSeller hs = new HouseSeller("zhangsan", "seller", "buyer", hm);
		HouseBuyer hb = new HouseBuyer("lisi", "buyer", "seller", hm);
		HouseRenter hr = new HouseRenter("wangwu", "renter", "tenant", hm);
		HouseTenant ht = new HouseTenant("zhaoliu", "tenant", "renter", hm);
		hm.addPerson(hs)
				.addPerson(hb)
				.addPerson(hr)
				.addPerson(ht);
		List<String> list = new ArrayList<String>();

		list = hs.request("有人买房子吗？");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("--------------------------------------");

		list = hb.request("有人卖房子吗？");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("------------------------------------------");

		list = hr.request("有人租赁房子吗？");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("-------------------------------------------");

		list = ht.request("有人出租房子吗？");
		for (String s : list) {
			System.out.println(s);
		}
	}
}
