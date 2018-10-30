package com.lc.pattern.behaviour.command.command2;

public class CommandDemo {
	public static void main(String[] args) {		
		HugCommand command = new HugCommand();
		command.addReceiver(new GG1());
		command.addReceiver(new GG2());
		MM mm = new MM("xbfan", command);
		mm.command();
	}
}
