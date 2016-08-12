
public class G  extends G0{
	int age=100;
	public G(int age){		
		this.age=age;
		
	}
	public G(){		
		System.out.println("3");
	}
	public static void main(String[] args) {
		new G();
	}
	{		//argument
		System.out.println("1");
	}
}
class G0{
	public G0(){		
		System.out.println("4");
	}
	{
		System.out.println("5");
		
	}
	{		
		System.out.println("2");
		
	}
	
}
