package chapter05;

class Calc {
	int a, b;
	int c, d;
	double x, y;
	
	int add (int a, int b) {
		return a + b ;
	}
//	long add (int c, int d) {
//		return c + d;
//	}
	double add(double x, double y) {
		return x + y;
	}
	double add(int a, double y) {
		return a + y;
	}
	double add(double x, int b) {
		return x + b;
	}
	int add (int a, int b, int c) {
		return a + b + c;
	}
}

public class Overloading01 {

	public static void main(String[] args) {
		Calc calculator = new Calc();
		
		System.out.println(calculator.add(10, 20));
		System.out.println(calculator.add(10.0, 20.5));
		System.out.println(calculator.add(10, 20.3));
		System.out.println(calculator.add(10.1, 20));
		System.out.println(calculator.add(10.1, 20));

	}

}
