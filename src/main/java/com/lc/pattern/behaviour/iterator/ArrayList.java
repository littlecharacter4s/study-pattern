package com.lc.pattern.behaviour.iterator;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/**
 * java.util.ArrayList
 * @author LittleCharacter
 * @param <E>
 */
public class ArrayList<E> implements List<E>{
	//ArrayList默认长度
	private static final int DEFAULT_CAPACITY = 10;
	//空元素对象数组
	private static final Object[] EMPTY_ELEMENTDATA = {};
	//元素对象数组，用来接收及操作传来的泛型对象
	private transient Object[] elementData;
	private int size = 0;

	public ArrayList() {
		super();
		elementData = EMPTY_ELEMENTDATA;
	}

	@Override
	public void add(E o) {
		if (elementData == EMPTY_ELEMENTDATA) {
			//初始化数组长度
			elementData = Arrays.copyOf(elementData, DEFAULT_CAPACITY);
		} else if (size == elementData.length) {
			//延长数据长度
			elementData = Arrays.copyOf(elementData, elementData.length + (elementData.length >> 1));
		}
		//把泛型直接放到对象数组里
		elementData[size++] = o;
	}

	@Override
	@SuppressWarnings("unchecked")
	public E get(int index) {
		//强转E是不会出现异常的，从头到尾操作的都是同一种类型对象
		return (E) elementData[index];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Iterator<E> iterator() {
		//实现迭代器
		return new Iterator<E>() {
			private int cursor = 0;
			@Override
			public boolean hasNext() {
				return cursor < size;
			}

			@Override
			@SuppressWarnings("unchecked")
			public E next() {
				if (cursor >= size)
					throw new NoSuchElementException();
				if (cursor >= elementData.length)
					throw new ConcurrentModificationException();
				//强转E是不会出现异常的，从头到尾操作的都是同一种类型对象
				return (E)elementData[cursor++];
			}
		};
	}
}
