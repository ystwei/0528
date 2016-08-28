package com.weikun.decorator;

public class Game extends GirlDecorator {
	private Girl girl;
	public Game(Girl girl){
		this.girl=girl;
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return this.girl.getDesc()+"+ÍæÓÎÏ·";
	}

}
