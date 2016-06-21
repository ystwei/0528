import java.util.Date;

public class A {
	public void ok(Date d){
		
		d.setYear(100);//2000
	}
	public static void main(String[] args) {
		A a=new A();
		Date d=new Date();//引用类型，传递的是值（堆的地址）
		a.ok(d);
		System.out.println(d);
	}
}
