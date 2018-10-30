package com.lc.pattern.behaviour.mediator;

import java.util.List;

/**
 * Mediator角色
 * @author LittleCharacter
 */
public abstract class Mediator {
	abstract List<String> getMessage(String question, Person person);
	abstract String setMessage(String answer, Person person);
}
