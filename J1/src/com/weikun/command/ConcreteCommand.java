package com.weikun.command;

public class ConcreteCommand implements Command {
	
	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver){
		this.receiver=receiver;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.receiver.getMessage();
	}

}
