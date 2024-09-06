package chapter07;

class MyFinalClass {
	final int FINAL_VALIABLE = 30;
	
	public final void myMethod() {
		System.out.println("재정의 할 수 없는 메서드");
		
	}
}


final class ChildClass extends MyFinalClass {
//	public void myMethod() {
//		
//	}
}

//class GrandSon extends ChildClass {
	
//

public class D_Final {
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.myMethod();
		
		
	}

}
