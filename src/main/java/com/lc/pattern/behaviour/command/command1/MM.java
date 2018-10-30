package com.lc.pattern.behaviour.command.command1;

public class MM {
	private String name;
	private Receiver receiver;

	public MM(String name, Receiver receiver) {
		super();
		this.name = name;
		this.receiver = receiver;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void command() {
		receiver.action();
	}
}

