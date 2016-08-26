package com.weikun.K;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test();
		
		t.buy(new Goods("001","牛奶",10,2));
		t.buy(new Goods("002","奶牛",20,4));
		t.buy(new Goods("001","牛奶",10,9));
		
		t.buy(new Goods("003","巧克力",20,19));
		List<Goods> list= Cart.getList();
		
		for(Goods g :list){
			
			System.out.println(g.getName()+":"+g.getQuantity()*g.getPrice()+"元");
		}
	}
	public void buy(Goods newGoods){
		
		List <Goods>list=Cart.getList();
		boolean flag=false;
		for(int i=0;i<list.size();i++){
			Goods oldGoods=list.get(i);//老商品
			if(newGoods.getNo().equals(oldGoods.getNo())){//代表已经存在了老商品，因此数量相加。
				
				oldGoods.setQuantity(oldGoods.getQuantity()+newGoods.getQuantity());
				flag=true;
			}
			
		}
		if(flag==false){//新商品
			list.add(newGoods);
		}
		
		
	}
}
