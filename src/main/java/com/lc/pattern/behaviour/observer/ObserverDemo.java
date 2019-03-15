package com.lc.pattern.behaviour.observer;

import com.lc.pattern.util.PropertyUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * 主类
 * @author LittleCharacter
 * 注：https://blog.csdn.net/maijia0754/article/details/80604444
 */
public class ObserverDemo {
	private static List<WindowListener> windowListeners = new ArrayList<WindowListener>();
	private static ObserverDemo observer = null;

	public static void main(String[] args) {
		observer = new ObserverDemo();
		Button button = new Button();
		Properties props = PropertyUtil.getProperties("com/lc/dp/behaviour/observer/observer.properties");
		if (null != props) {
			try {
				String[] sos = props.getProperty("sigleObservers").split(",");
				for (int i = 0; i < sos.length; i++) {
					Class<?> c = Class.forName(sos[i]);
					button.addSinglePressListener((ActionListener) c.newInstance());
				}
				String[] dos = props.getProperty("doubleObservers").split(",");
				for (int i = 0; i < dos.length; i++) {
					Class<?> c = Class.forName(dos[i]);
					button.addDoublePressListener((ActionListener) c.newInstance());
				}
			} catch (ClassNotFoundException e) {
				System.out.println("反射获取类异常！");
			} catch (InstantiationException e) {
				System.out.println("对象实例化异常！");
			} catch (IllegalAccessException e) {
				System.out.println("非法创建对象异常！");
			}
		}

		button.singlePressed();//此句是是button按钮被按下时，系统的派发机制调用的，这里直接写出，不模拟界面点击按钮
		button.doublePressed();//此句是是button按钮被双击时，系统的派发机制调用的，这里直接写出，不模拟界面点击按钮

		addWindowListener(new WindowListener() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println(e.getSource().getClass().getName());
				System.out.println("window closed！");
			}
		});

		close();//此句是是窗口关闭时，系统的派发机制调用的，这里直接写出，不模拟界面点击关闭
	}

	public static void close() {
		//新建事件对象，把事件的信息传递给监听者
		WindowEvent e = new WindowEvent(System.currentTimeMillis(), observer);

		for (int i = 0; i < windowListeners.size(); i++) {
			WindowListener listener = windowListeners.get(i);
			//把事件对象传递给监听者
			listener.windowClosing(e);
		}
	}

	/**
	 * 给窗口添加监听者
	 * @param listener
	 */
	public static void addWindowListener(WindowListener listener) {
		windowListeners.add(listener);
	}
}
