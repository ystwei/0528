package com.weikun.command;

public class Invoker {
	
	
	public void sendCommand(Command command){
		command.execute();
	}
}
