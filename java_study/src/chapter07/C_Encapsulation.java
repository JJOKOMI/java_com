package chapter07;

class Student {
	private String name;
	private int age;
	private int score;
	public String setName;
	
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("유효하지않은나이입니다.");
		}else {
			this.age = age;
		}
	}
}

public class C_Encapsulation {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName = ("이승아");
		student1.setAge(90);
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		
		student1.setAge(-10);
		
		
		
		
		
	}
}