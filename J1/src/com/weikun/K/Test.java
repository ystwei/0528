package com.weikun.K;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test();
		
		t.buy(new Goods("001","ţ��",10,2));
		t.buy(new Goods("002","��ţ",20,4));
		t.buy(new Goods("001","ţ��",10,9));
		
		t.buy(new Goods("003","�ɿ���",20,19));
		List<Goods> list= Cart.getList();
		
		for(Goods g :list){
			
			System.out.println(g.getName()+":"+g.getQuantity()*g.getPrice()+"Ԫ");
		}
	}
	public void buy(Goods newGoods){
		
		List <Goods>list=Cart.getList();
		boolean flag=false;
		for(int i=0;i<list.size();i++){
			Goods oldGoods=list.get(i);//����Ʒ
			if(newGoods.getNo().equals(oldGoods.getNo())){//�����Ѿ�����������Ʒ�����������ӡ�
				
				oldGoods.setQuantity(oldGoods.getQuantity()+newGoods.getQuantity());
				flag=true;
			}
			
		}
		if(flag==false){//����Ʒ
			list.add(newGoods);
		}
		
		
	}
}
