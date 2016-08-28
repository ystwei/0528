package com.weikun.command;

public class Test {
	public static void main(String[] args) {
		
		Receiver rec=new Receiver();
		Command command=new ConcreteCommand(rec);
		Invoker in=new Invoker();
		in.sendCommand(command);
	}

}
