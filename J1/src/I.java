
public class I extends I0{		
	@Override//@×¢½â£ºannoation
	public  void go(){		
		System.out.println("ok1");	
		
	}
	
	public static void main(String[] args) {
		int p=100;
		I i=new I();
		System.out.println(i);//getClass().getName() + '@' + Integer.toHexString(hashCode())

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "IÀà£¡";
	}
}
class I0{	
	public  void go(){
		System.out.println("ok");
	}
}
