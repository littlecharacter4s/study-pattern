package com.lc.pattern.behaviour.state;

/**
 * ConcreteState角色
 * @author LittleCharacter
 */
public class DivideState implements State{
	@Override
	public void handle() {
		System.out.println("除法运算...");
	}
}
