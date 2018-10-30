package com.lc.pattern.builder.builder;

/**
 * 抽象Builder角色
 * @author LittleRW
 */
public interface ComputerBuilder {
	Cpu buildeCpu();
	Memory buildeMemory();
	Video buildeVideo();
}
