package chapter05;

class Operator {
	int a, b;
	
	int add() {
		return a + b;
	}
	int subtract() {
		return a - b;
	}
	
	static int multiply(int a, int b) {
		return a * b;
	}
	static int divide(int a, int b) {
		return a / b;
	}
}



public class Method04 {
	public static void main(String[] args) {
		System.out.println("===인스턴스 메서드===");
		Operator op = new Operator();
		
		op.a = 10;
		op.b = 20;
		
		System.out.println(op.add());
		System.out.println(op.subtract());
		
		System.out.println("===정적 메서드===");
		int result1 = Operator.multiply(10, 20);
		int result2 = Operator.divide(10, 20);

		System.out.println(result1);
		System.out.println(result2);
	}

}
