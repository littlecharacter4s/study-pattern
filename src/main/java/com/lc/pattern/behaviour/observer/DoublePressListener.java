package com.lc.pattern.behaviour.observer;

public class DoublePressListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource().getClass().getName());
		System.out.println("button double pressed!");
	}
}
