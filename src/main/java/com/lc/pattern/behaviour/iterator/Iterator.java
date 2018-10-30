package com.lc.pattern.behaviour.iterator;

/**
 * java.util.Iterator
 * @param <E>
 * @author LittleCharacter
 */
public interface Iterator<E> extends java.util.Iterator<E> {
	boolean hasNext();
	E next();

	@Override
	default void remove() {

	}
	//void remove();模拟功能就不实现太多
}
