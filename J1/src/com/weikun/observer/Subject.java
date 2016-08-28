package com.weikun.observer;

import java.util.ArrayList;
import java.util.List;


public abstract class Subject extends Object{
	
	private List<Observer> list=new ArrayList<Observer>();
	public void atteach(Observer o){//加入观察者
		list.add(o);
	}
	public void detteach(Observer o){//删除观察者
		list.remove(o);
	}
	public void Notify(){//遍历观察者
		for(Observer o :list){
			
			o.update();
		}
	}
}
