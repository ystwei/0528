
public class B {
	public void ok(String s){
		
		s="456";
	}
	public static void main(String[] args) {
		B b=new B();
		String s="123";
		b.ok(s);
		System.out.println(s);
	}
}
