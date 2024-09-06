package chapter05;

class MyMath {
	int add(int a, int b) {
		return a + b;
	}
	
	int subtract(int a, int b) {
		return a - b;
	}
	
	int multiply(int a, int b) {
		return a * b;
	}
	
	int divide(int a, int b) {
		return a / b;
	}
	
	void noReturn() {
		System.out.println("해당 메서드는 반환값이 없습니다.");
		return;
	}
	
	String yesReturn() {
		String name = "이승아";
		return name;
	}
	
	int max(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	int min(int a, int b) {
		return a > b ? a : b;
	}
}

public class Method03 {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		System.out.println(mm.add(10, 20));
		mm.noReturn();
		
		System.out.println(mm.max(11, 12));
	}
}
