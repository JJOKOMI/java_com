package chapter09;

abstract class MobileApp {
	abstract void execute();
	
	void appInfo() {
		System.out.println("This is a mobile app");
	}
}

class GameApp extends MobileApp {
	void execute() {
		System.out.println("Game app executes");
	}
}

class SocialApp extends MobileApp {
	String name;
	
	SocialApp(String name) {
		this.name = name;
	}
	@Override
	void execute() {
		System.out.println(name + " app executes");
	}
	
	@Override
	void appInfo() {
		System.out.println(name + " app is most popular social app");
	}
}

public class E_Practice {
	public static void main(String[] args) {
		MobileApp myGameApp = new GameApp();
		SocialApp mySocialApp = new SocialApp("Facebook");
		
		myGameApp.execute();
		myGameApp.appInfo();
		
		mySocialApp.execute();
		mySocialApp.appInfo();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
