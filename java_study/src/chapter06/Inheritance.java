package chapter06;

class Parent {
}

class Child extends Parent {
}

class Animal {
	String name;
}

// dog자식 클래스는 animal 부모 클래스의 상속을 받음
class Dog extends Animal {
	
	void bark() {
		System.out.println("강쥐가 짖습니다.");
	}
}

class Tv {
	boolean power;
	int channel;
	
	void power() {
		power = !power;
		
	}
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

class smartTv extends Tv{
	boolean ott;
	
	void displayOtt(String platform) {
		if(ott) {
			System.out.println(platform);
		} else {
			System.out.println("ott 연결이 되지 않았습니다.");
		}
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Dog choco = new Dog();
		choco.name = "초코";
		System.out.println(choco.name);
		
		smartTv stv = new smartTv();
		stv.channel = 10;
		stv.channelUp();
		stv.channelUp();
		stv.channelUp();
		System.out.println(stv.channel);
		
		stv.displayOtt("Netflix");
		stv.ott = true;
		stv.displayOtt("Netflix");
	}
}
