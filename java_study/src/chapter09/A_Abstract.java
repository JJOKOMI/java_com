package chapter09;

abstract class Human {
	abstract void work();
}

class Police extends Human {
	void work() {
		System.out.println("경찰은 치안 유지 업무를 담당하소");
	}
}

class Student extends Human {
	void work() {
		System.out.println("학생은 공부를 합니다");
	}
}

abstract class Animal {
	abstract void makeSound();
	
	void eat() {
		System.out.println("동물은 먹이를 먹습니다.");
	}
}

class Cat extends Animal {
	void makeSound() {
		System.out.println("냐옹");
	}
	
	@Override
	void eat() {
		System.out.println("고양이는 츄르를 먹습니다.");
	}
}

class Dog extends Animal {
	void makeSound() {
		System.out.println("멍멍");
	}
}

public class A_Abstract {
	public static void main(String[] args) {
	
		Police police = new Police();
		police.work();
		
		Student student = new Student();
		student.work();
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.eat();
		cat.makeSound();
		
		dog.eat();
		dog.makeSound();
	}

}
