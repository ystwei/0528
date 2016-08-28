package com.weikun.observer;

import java.util.ArrayList;
import java.util.List;


public abstract class Subject extends Object{
	
	private List<Observer> list=new ArrayList<Observer>();
	public void atteach(Observer o){//����۲���
		list.add(o);
	}
	public void detteach(Observer o){//ɾ���۲���
		list.remove(o);
	}
	public void Notify(){//�����۲���
		for(Observer o :list){
			
			o.update();
		}
	}
}
