package com.lc.pattern.behaviour.state;

/**
 * 主类
 * @author LittleCharacter
 */
public class StateDemo {
	public static void main(String[] args) {
		Calculator calculator = new Calculator(new AddState());
		calculator.operate();
		calculator.setState(new MinusState());
		calculator.operate();
		calculator.setState(new MultiplyState());
		calculator.operate();
		calculator.setState(new DivideState());
		calculator.operate();
	}
}
