package com.lc.pattern.behaviour.observer;

/**
 * java.awt.event.WindowEvent
 * @author LittleCharacter
 */
public class WindowEvent {
	private Long when;
	private Object source;
	public WindowEvent(Long when, Object source) {
		this.when = when;
		this.source = source;
	}
	/**
	 * 获取触发时间
	 * @return
	 */
	public long getWhen() {
		return when;
	}

	/**
	 * 获取事件源
	 * @return
	 */
	public Object getSource() {
		return source;
	}
}
