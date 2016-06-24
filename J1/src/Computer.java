//聚合 生命周期不一样，
public class Computer {
	
	
	private You y;
	
	public void setY(You y1){
		y=y1;
	}
	
	public static void main(String[] args) {
		Computer c=new Computer();
		You y=new You();
		c.setY(y);
		
		c.y.go();
	}
}
class You{
	void go(){
		System.out.println("go");
	}
}