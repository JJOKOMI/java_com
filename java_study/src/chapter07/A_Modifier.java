package chapter07;

import otherPackage.ParentClass;
// 접근 제어자(Modifier)
// : 클래스, 메서드, 변수의 접근 범위를 제어

// 1. 접근 제어자의 종류
// : private, default, protected, public
// >> 접근 제어자가 지정되지 않은 경우 default(기본값)으로 지정

// 2. 접근 제어자의 범위
// public > protected > (default) > private

// 1) private
// : 같은 클래스 내에서만 접근 가능
class PrivateClass {
	private int myField;
	private void myMethod() {}
}

// 2) default
// : 같은 패키지 내라면 중복 X
// : 패키지 외부에서는 접근 X
// >> 패키지 내부에서는 중복 X, 접근 O
class DefaultClass {
	// 같은 패키지 내의 다른 클래스들에 접근 가능
	int myField;
	void myMethod() {}
}

class ProtectedClass extends ParentClass{
	protected int myField;
	
	public ProtectedClass() {
		System.out.println(protectedField);
	}
	
}

public class A_Modifier {
	public static void main(String[] args) {
		PrivateClass pc = new PrivateClass();
		// pc.myField;
		// >> private 설정 된 속성과 메서드는 해당 클래스 내부에서만 읽을 수 있음
		
		DefaultClass dc = new DefaultClass();
		dc.myField = 10;
		dc.myMethod();
		
		ProtectedClass pc2 = new ProtectedClass();
//		pc2.exampleMethod();
	}
}