package com.lc.pattern.behaviour.mediator;

import java.util.List;

/**
 * Colleague角色
 * @author LittleCharacter
 */
public abstract class Person {
	String name;
	String attr;
	String target;
	Mediator mediator;
	abstract List<String> request(String question);
	abstract String response();
}

