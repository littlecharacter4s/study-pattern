package com.lc.pattern.behaviour.mediator;

import java.util.List;

/**
 * ConcreteColleague角色
 * @author LittleCharacter
 */
public class HouseBuyer extends Person{
	public HouseBuyer(String name,String attr, String target, Mediator mediator) {
		super();
		this.name = name;
		this.attr = attr;
		this.target = target;
		this.mediator = mediator;
	}

	@Override
	List<String> request(String question) {
		return mediator.getMessage(question, this);
	}

	@Override
	String response() {
		return mediator.setMessage("我买房子，请电联：17792718765！", this);
	}
}
