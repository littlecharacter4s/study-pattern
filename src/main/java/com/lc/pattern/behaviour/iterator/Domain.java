package com.lc.pattern.behaviour.iterator;

/**
 * 实体类
 * @author LittleCharacter
 */
public class Domain {
	private int id;
	private String name;
	
	public Domain(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Domain[id=" + id + ",name=" + name + "]";
	}
}
