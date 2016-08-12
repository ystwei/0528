
public class H extends H0{
	public static void main(String[] args) {
		new H("");
		System.out.println("4");
	}
	{
		System.out.println("8");
	}
	{
		System.out.println("2");
	}
	public H(){		
		super(100);
		System.out.println("1");
	}
	public H(String name){
		this();
		System.out.println("3");
	}
}
class H0{	
	// 5 6 2 1 4	
	{
		System.out.println("5");		
	}
	public H0(){
		System.out.println("6");
	}	
	public H0(int age){
		System.out.println("7");
	}
}