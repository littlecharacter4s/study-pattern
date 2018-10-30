package com.lc.pattern.behaviour.command.command2;

import java.util.ArrayList;
import java.util.List;

public class HugCommand extends Command{
	private List<Receiver> receivers = new ArrayList<Receiver>();
	
	public void addReceiver(Receiver receiver) {
		receivers.add(receiver);
	}
	
	@Override
	public void execute() {
		for (Receiver receiver : receivers) {
			receiver.action();
		}
	}
}
