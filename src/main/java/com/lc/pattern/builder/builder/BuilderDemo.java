package com.lc.pattern.builder.builder;

import java.util.HashMap;
import java.util.Map;

public class BuilderDemo {
	public static void main(String[] args) {
		Map<String, ComputerBuilder> map = new HashMap<>();
		map.put("Lenovo", new LenovoComputerBuilder());
		map.put("Mac", new MacComputerBuilder());
		ComputerDirector cd = new XComputerDirector(map);
		Computer computer = cd.directComputer();
		
		System.out.println(computer.getCpu().getName());
		System.out.println(computer.getMemory().getName());
		System.out.println(computer.getVideo().getName());
	}
}
