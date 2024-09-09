package chapter09;

interface Fruit {
	String color();
	
	default void describe() {
		System.out.println("과일의 색상은 " + color() + "입니다.");
	}
	
	static void printType() {
		System.out.println("과일의 타입입니다.");
	}
}

class Apple implements Fruit{
	public String color() {
		return "red";
	}
}

class Orange implements Fruit {
	public String color() {
		return "orange";
	}
}

public class F_Practice {

	public static void main(String[] args) {
		Fruit apple = new Apple();
		Fruit orange = new Orange();
		
		apple.describe();
		orange.describe();
		
		Fruit.printType();
		
		

	}

}
