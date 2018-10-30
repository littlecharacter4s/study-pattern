package com.lc.pattern.behaviour.iterator;

import java.util.NoSuchElementException;

/**
 * java.util.LinkedList
 * @author LittleCharacter
 * @param <E>
 */
public class LinkedList<E> implements List<E>{
	private Node first = null;
	private Node last = null;
	private int size = 0;
	@Override
	public void add(E o) {
		Node e = new Node(o, null);
		if (null == first) {
			first = e;
			last = e;
		}
		last.next = e;
		last = e;	
		size ++;
	}
	
	@Override
	public E get(int index) {
		if (index >= size) {
			throw new NoSuchElementException();
		}
		Node e = first;
		for (int i = 0; i < index; i++) {
			e = e.next;
		}
		return e.data;
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
			public E next() {
				if (cursor >= size)
	                throw new NoSuchElementException();
				Node e = first;
				for (int i = 0; i < cursor; i++) {
					e = e.next;
				}
				cursor ++;
				return e.data;
			}
		};
	}

	/**
	 * 节点对象
	 * @author LittleCharacter
	 */
	private class Node {
        private E data;
        private Node next;

        Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
