package com.lc.pattern.behaviour.state;

/**
 * ConcreteState角色
 * @author LittleCharacter
 */
public class MinusState implements State{
	@Override
	public void handle() {
		System.out.println("减法运算...");
	}
}

