package chapter19;

//익명 클래스
// : 클래스를 정의하면서 동시에 객체를 생성하는 방법
// 이름이 없기 때문에 재사용x 일회성 사용 객체 정의에 유용

interface Animal {
	void sound();
	
}

abstract class Vehicle {
	abstract void run();
}

public class Anonymous {
	public static void main(String[] args) {
		Animal dog = new Animal() {
			
			@Override
			public void sound() {
				System.out.println("멍멍");
			}
		};
		
		dog.sound();
		
		Vehicle car = new Vehicle() {
			
			@Override
			void run() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}











