package com.lc.pattern.behaviour.command.command1;

public class CommandDemo {
	public static void main(String[] args) {		
		GG gg = new GG();
		gg.addCommand(new HugCommand());
		gg.addCommand(new ShoppingCommand());
		MM mm = new MM("xiaoxia", gg);
		mm.command();
	}
}
