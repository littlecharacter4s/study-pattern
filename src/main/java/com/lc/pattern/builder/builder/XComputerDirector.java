package com.lc.pattern.builder.builder;

import java.util.Map;

/**
 * 具体Director角色
 * @author LittleRW
 */
public class XComputerDirector implements ComputerDirector{
	private Map<String, ComputerBuilder> map;

	public XComputerDirector(Map<String, ComputerBuilder> map) {
		super();
		this.map = map;
	}

	@Override
	public Computer directComputer() {
		Cpu cpu = map.get("Lenovo").buildeCpu();
		Memory memory = map.get("Mac").buildeMemory();
		Video video = map.get("Lenovo").buildeVideo();

		Computer computer = new Computer();
		computer.setCpu(cpu);
		computer.setMemory(memory);
		computer.setVideo(video);

		return computer;
	}

}
