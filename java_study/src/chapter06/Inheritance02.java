package chapter06;

class Mammal {
	String name = "Parent";
	
	Mammal(){
		System.out.println("빈 부모 생성자 - 인스턴스 생성");
	}
	
	Mammal(String name) {
		this.name = name;
	}
}

class Cat extends Mammal {
	String name = "Child";
	
	Cat() {
		System.out.println("빈자식 생성자 ");
	}
	
	Cat(String name) {
		super(name);
	}
	
	void greet() {
		System.out.println("자식 : " + this.name);
		System.out.println("부모 : " + super.name );
	}
}

public class Inheritance02 {
	public static void main(String[] args) {
		Cat voidCat = new Cat();
		Cat myCat = new Cat("choco");
		
		voidCat.greet();
		myCat.greet();
		
		
	}
}
