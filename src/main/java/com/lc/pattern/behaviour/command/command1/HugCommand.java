package com.lc.pattern.behaviour.command.command1;

public class HugCommand extends Command{
	@Override
	public void execute() {
		System.out.println("hug mm...");
	}

	@Override
	public void undo() {
		System.out.println("undo hug...");
	}
}
