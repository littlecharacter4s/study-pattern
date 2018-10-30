package com.lc.pattern.behaviour.command.command1;

/**
 * 抽象命令(接口或者抽象类)
 * @author LittleCharacter
 */
public abstract class Command {
	public abstract void execute();
	//Command设计模式的初衷：实现undo功能
	public abstract void undo();
}
