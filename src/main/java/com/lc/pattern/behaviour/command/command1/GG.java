package com.lc.pattern.behaviour.command.command1;

import java.util.ArrayList;
import java.util.List;

public class GG extends Receiver{
	private String name;
	private List<Command> commands = new ArrayList<Command>();
	//在这里记录已经执行的命令，可以实现undo操作，这里不再模拟
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addCommand(Command command) {
		commands.add(command);
	}
	
	public void action() {
		for (Command command : commands) {
			command.execute();
		}
	}
}
