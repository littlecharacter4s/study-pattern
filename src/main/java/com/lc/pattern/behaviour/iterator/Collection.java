package com.lc.pattern.behaviour.iterator;

import java.lang.Iterable;

/**
 * java.util.Collection
 * @param <E>
 * @author LittleCharacter
 */
public interface Collection<E> extends Iterable<E> {
	void add(E o);
	int size();
	Iterator<E> iterator();
}
