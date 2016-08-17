package com.weikun.C;

public class H {
	public static void main(String[] args) {
		Professor p=new Professor("ÄÐ");
		
		H0 h0=new H0(p,100,"mike");
		
		H0 h1=null;
		try {
			h1 = (H0)h0.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		h1.setName("alice");
		System.out.println(h1.getP().getSex());
		h1.getP().setSex("Å®");
		
		System.out.println(h0.getP().getSex());//Ê§°ÜµÄ failed
		
		System.out.println(h0.getName());
		
		
	}
}
class Professor implements Cloneable{
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Professor(String sex) {
		super();
		this.sex = sex;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
class H0 implements Cloneable{
	
	private Professor p;
	
	
	public Professor getP() {
		return p;
	}
	public void setP(Professor p) {
		this.p = p;
	}
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public H0(Professor p, int age, String name) {
		super();
		this.p = p;
		this.age = age;
		this.name = name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		H0 h1 =(H0)super.clone();
		
		h1.p= (Professor) this.p.clone();
		
		
		return h1;
	}
	
}
