package com.lc.pattern.behaviour.command.command1;

public class ShoppingCommand extends Command{
	@Override
	public void execute() {
		System.out.println("do shopping...");
	}

	@Override
	public void undo() {
		System.out.println("undo shopping...");
	}
}
