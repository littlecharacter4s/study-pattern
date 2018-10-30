package com.lc.pattern.behaviour.state;

/**
 * Context角色
 * @author LittleCharacter
 */
public class Calculator {
	private State state;

	public Calculator(State state) {
		super();
		this.state = state;
	}

	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}

	public void operate(){
		state.handle();
	}
}
