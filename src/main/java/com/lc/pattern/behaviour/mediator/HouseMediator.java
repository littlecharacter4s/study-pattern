package com.lc.pattern.behaviour.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteMediator角色
 * @author LittleCharacter
 */
public class HouseMediator extends Mediator{
	private List<Person> personList = new ArrayList<Person>();
	
	public HouseMediator addPerson(Person person) {
		personList.add(person);
		return this;
	}

	@Override
	List<String> getMessage(String question, Person person) {
		List<String> answerList = new ArrayList<String>();
		System.out.println(person.name + " say:" + question);
		for (Person p : personList) {
			if (p.name.equals(person.name) || !p.attr.equals(person.target)) {
				continue;
			}
			answerList.add(p.response());
		}
		return answerList;
	}

	@Override
	String setMessage(String answer, Person person) {
		return person.name + " say:" + answer;
	}
}
