package com.lc.pattern.behaviour.mediator;

import java.util.List;

/**
 * ConcreteColleague角色
 * @author LittleCharacter
 */
public class HouseRenter extends Person{
	public HouseRenter(String name,String attr, String target, Mediator mediator) {
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
		return mediator.setMessage("我出租房子，请电联：15692714765！", this);
	}
}
