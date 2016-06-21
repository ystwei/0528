public class Student {
	int grade;
	String name;
	String no;
	char sex;	
	public Student(String name1) {
		// TODO Auto-generated constructor stub
		name=name1;
	}
	//getter setter
	String getName(){		//¶Á
		return name;
	}	
	void setName(String name){//Ð´		
		this.name=name;		
	}
	Student(){
		name="MIKE";
		
	}
	public static void main(String[] args) {
		Student s=new Student();
		Student s1=new Student("ROSE");
		Student s2=s1;//Ò»¸ö¶Ñ
		//s.name="MIKE";		
		//System.out.println(s.name);
		
		s2.setName("MIKE");
		
		System.out.println(s2.getName());
		
	}
}
