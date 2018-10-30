package com.lc.pattern.behaviour.state;

/**
 * ConcreteState角色
 * @author LittleCharacter
 */
public class MultiplyState implements State{
	@Override
	public void handle() {
		System.out.println("乘法运算...");
	}
}
