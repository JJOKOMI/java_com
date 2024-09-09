package chapter08;

class Parent {
	void displayInfo() {
		System.out.println("부모 클래스 입니다.");
	}
}

class Child extends Parent{
	
	@Override
	void displayInfo() {
		System.out.println("자식 클래스 입니다.");
	}
	
	void ownMethod() {
		System.out.println("자식 만의 메서드 입니다.");
	}
}

public class A_Class_Type {
	public static void main(String[] args) {
		Parent childObject = new Child();
		childObject.displayInfo();
		
		Child c1 = new Child();
		
		Parent p1 = c1;
		
		
		Parent p2 = new Child();
//		p2.ownMethod();
		Child c2 = (Child)p2;
		c2.ownMethod();
		
	}

}
