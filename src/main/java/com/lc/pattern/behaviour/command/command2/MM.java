package com.lc.pattern.behaviour.command.command2;

public class MM {
	private String name;
	private Command command;

	public MM(String name, Command command) {
		super();
		this.name = name;
		this.command = command;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void command() {
		command.execute();
	}
}

