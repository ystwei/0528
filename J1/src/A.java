import java.util.Date;

public class A {
	public void ok(Date d){
		
		d.setYear(100);//2000
	}
	public static void main(String[] args) {
		A a=new A();
		Date d=new Date();//�������ͣ����ݵ���ֵ���ѵĵ�ַ��
		a.ok(d);
		System.out.println(d);
	}
}
