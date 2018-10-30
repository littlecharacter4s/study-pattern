package com.lc.pattern.behaviour.command.command2;

public class GG1 extends Receiver{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void action() {
		System.out.println("gg1 hug...");
	}
}
