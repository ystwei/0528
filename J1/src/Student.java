public class Student {
	int grade;
	String name;
	String no;
	private char sex='M';	
	public Student(String name1) {
		// TODO Auto-generated constructor stub
		name=name1;
	}
	
	public int getGrade() {
		
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {//dll
		if(sex!='M'){
			this.sex='M';
		}else{
			this.sex = sex;
		}
		
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
	
	
}
