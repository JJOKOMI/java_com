package chapter11;

import java.util.HashSet;
import java.util.Set;

public class D_Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("자바");
		set.add("파이썬");
		set.add("C++");
		set.add("자바스크립트");
		
		System.out.println(set);
		
		set.remove("자바");
		System.out.println(set);
		
		set.add("C++");
		System.out.println(set);
		
		System.out.println(set.size());
		
		System.out.println(set.contains("자바스크립트"));
		
		set.clear();
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
	}
}
