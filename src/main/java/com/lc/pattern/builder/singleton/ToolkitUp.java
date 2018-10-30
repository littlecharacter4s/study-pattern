package com.lc.pattern.builder.singleton;

/**
 * java.awt.Toolkit升级版
 * @author LittleCharacter
 */
public class ToolkitUp {
	//懒汉式
	private volatile static ToolkitUp toolkitUp;

	//私有化其空构造方法，这点很重要，不然可以new的！！！
	private ToolkitUp() {}

	public static ToolkitUp getDefaultToolkit() {
		if (toolkitUp == null) {
			synchronized (ToolkitUp.class) {
				//双重否定，我想你理解
				if (toolkitUp == null) {
					toolkitUp = new ToolkitUp();
				}
			}
		}
		return toolkitUp;
	}
}
