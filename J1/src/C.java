
public class C extends C0{
	public C(int age) {
		
		// TODO Auto-generated constructor stub
	}

//inheritance
	public static void main(String[] args) {
		C c=new C(100);
		c.age=200;
		c.go();
		
		C0 c0=new C0();
		((C)c0).mark();
		
	}
	public void mark(){
		
	}
	
}
class C0{
	C0(){//default
		
	}
	public C0(int age){
		
	}
	int age=100;
	public void go(){
		
		System.out.println("go");
	}
}