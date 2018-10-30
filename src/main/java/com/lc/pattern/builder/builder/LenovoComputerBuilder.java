package com.lc.pattern.builder.builder;

/**
 * 具体Builder角色
 * @author LittleRW
 */
public class LenovoComputerBuilder implements ComputerBuilder{

	@Override
	public Cpu buildeCpu() {
		return new Cpu("Lenovo cpu...");//这里可以联合工厂方法模式
	}

	@Override
	public Memory buildeMemory() {
		return new Memory("Lenovo memory...");
	}

	@Override
	public Video buildeVideo() {
		return new Video("Lenovo video...");
	}

}
