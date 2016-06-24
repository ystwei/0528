//×éºÏ
public class Bird  {
	private Animal a;
	
	public Bird(){
		a=new Animal();
	}
	
	public static void main(String[] args) {
		Bird b=new Bird();
		
		b.a.go();
	}

}
class Animal{
	public void go(){
		System.out.println("go");
	}
}
