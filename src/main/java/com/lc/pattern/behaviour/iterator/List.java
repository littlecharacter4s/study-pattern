package com.lc.pattern.behaviour.iterator;

/**
 * java.util.List
 * @param <E>
 * @author LittleCharacter
 */
public interface List<E> extends Collection<E>  {
	//添加了除Collection接口之外的一些方法，这里为了模拟，只写一个
	E get(int index);
}
