package chapter11;

import java.util.HashMap;
import java.util.Map;

public class E_Map {
	public static void main(String[] args) {
		Map<String, Integer> students = new HashMap<String, Integer>();
		
		students.put("이승아", 30);
		students.put("이도경", 30);
		students.put("김명진", 34);
		
		System.out.println(students);
		
		System.out.println(students.get("이도경"));
		
		students.remove("이승아");
		System.out.println(students);
		
		System.out.println(students.containsKey("이도경"));
		System.out.println(students.containsKey("이지훈"));
		
		System.out.println(students.size());
		
		System.out.println(students.keySet());
		System.out.println(students.values());
		
		
		
	}
}























