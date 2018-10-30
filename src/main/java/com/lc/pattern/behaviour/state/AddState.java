package com.lc.pattern.behaviour.state;

/**
 * ConcreteState角色
 * @author LittleCharacter
 */
public class AddState implements State{
	@Override
	public void handle() {
		System.out.println("加法运算...");
	}
}

