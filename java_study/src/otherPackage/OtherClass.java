package otherPackage;
import chapter07.Example;

public class OtherClass {
	public static void main(String[] args) {
		Example ex = new Example();
		
		System.out.println(ex.publicVar);
//		System.out.println(ex.protectedVar);
//		System.out.println(ex.defaultVar);
//		System.out.println(ex.privateVar);
		
		
		ex.ex1();
	}
}
