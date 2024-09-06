package chapter07;

public class Example {
	
	
	public int publicVar = 1;
	
	protected int protectedVar = 2;
	
	int defaultVar = 3;
	
	private int privateVar = 4;
	
	public void ex1() {
		System.out.println(publicVar);
		System.out.println(protectedVar);
		System.out.println(defaultVar);
		System.out.println(privateVar);
	}
	
	protected void ex2() {
		System.out.println(protectedVar);
	}
	
	void ex3() {
		System.out.println(defaultVar);
	}
	
	private void ex4() {
		System.out.println(privateVar);
	}
}
