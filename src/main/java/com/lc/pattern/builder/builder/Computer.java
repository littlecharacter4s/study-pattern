package com.lc.pattern.builder.builder;

/**
 * Product角色
 * @author LittleRW
 */
public class Computer {
	private Cpu cpu;
	private Memory memory;
	private Video video;
	
	public Cpu getCpu() {
		return cpu;
	}
	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	
	public Memory getMemory() {
		return memory;
	}
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
	
	public Video getVideo() {
		return video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}
}

class Cpu{
	private String name;

	public Cpu(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 	
}

class Memory{
	private String name;
	
	public Memory(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 	
}

class Video{
	private String name;
	
	public Video(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 	
}
