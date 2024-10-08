package chapter09;

interface Flyable{
	int MAX_SPEED = 100;
	
	void fly();
	
	default void land() {
		System.out.println("Landing");
	}
	
	static int getWingCount() {
		return 2;
	}
}

class Bird implements Flyable {
	public void fly() {
		System.out.println("새는 최대 속력이" + MAX_SPEED + "입니다.");
	}
	
	@Override
	public void land() {
		System.out.println("Landing...");
	}
}

public class C_Interface {
	public static void main(String[] args) {
		Bird bird = new Bird();
		
		bird.fly();
		bird.land();
		System.out.println(Flyable.getWingCount());
	}

}
