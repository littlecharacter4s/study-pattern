package com.lc.pattern.behaviour.iterator;

/**
 * java.lang.Iterable
 * @param <T>
 * @author LittleCharacter
 */
public interface Iterable<T> {
	Iterator<T> iterator();
}
