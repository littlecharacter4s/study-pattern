package com.lc.pattern.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * java.awt.Button
 * @author LittleCharacter
 */
public class Button implements Component{
	private List<ActionListener> singlePressListenerList = new ArrayList<ActionListener>();
	private List<ActionListener> doublePressListenerList = new ArrayList<ActionListener>();

	/**
	 * 按钮被单击
	 */
	public void singlePressed() {
		//新建事件对象，把事件的信息传递给监听者
		ActionEvent e = new ActionEvent(System.currentTimeMillis(), this);

		for (int i = 0; i < singlePressListenerList.size(); i++) {
			ActionListener listener = singlePressListenerList.get(i);
			//把事件对象传递给监听者
			listener.actionPerformed(e);
		}
	}

	/**
	 * 按钮被双击
	 */
	public void doublePressed() {
		ActionEvent e = new ActionEvent(System.currentTimeMillis(), this);

		for (int i = 0; i < doublePressListenerList.size(); i++) {
			ActionListener listener = doublePressListenerList.get(i);
			listener.actionPerformed(e);
		}
	}

	/**
	 * 给按钮添加单击监听者
	 * @param listener
	 */
	public void addSinglePressListener(ActionListener listener) {
		singlePressListenerList.add(listener);
	}

	/**
	 * 给按钮添加双击监听者
	 * @param listener
	 */
	public void addDoublePressListener(ActionListener listener) {
		doublePressListenerList.add(listener);
	}

	//还可以添加其他的监听
	/*
	public void addXXListener(MXXListener listener) {
		mActionListenerList.add(listener);
	}
	*/
}

