package chapter11;

import java.util.ArrayList;
import java.util.LinkedList;

public class B_List {
	public static void main(String[] args) {
		System.out.println("ArrayList");
		
		ArrayList<String> strArray = new ArrayList<String>();
		
		System.out.println(strArray.size());
		
		strArray.add("JAVA");
		strArray.add("PYTHON");
		strArray.add("JS");
		strArray.add("TS");
		
		System.out.println(strArray.size());
		System.out.println(strArray);
		
		strArray.add(1, "REACT");
		System.out.println(strArray);
		
		String element = strArray.get(1);
		System.out.println(element);
		
		System.out.println(strArray.remove(1));
		System.out.println(strArray);
		
		System.out.println(strArray.set(1, "C++"));
		System.out.println(strArray);
		
		System.out.println("LinkedList");
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("Apple");
		linkedList.add("Banana");
		linkedList.add("Orange");
		
		System.out.println(linkedList);
		
		linkedList.add(1, "Mango");
		System.out.println(linkedList);
		
		String fruitElement = linkedList.get(2);
		System.out.println(fruitElement);
		
		String isFruit1 = "Orange";
		String isFruit2 = "Strawberry";
		
		System.out.println(linkedList.contains(isFruit1));
		System.out.println(linkedList.contains(isFruit2));
		
		linkedList.clear();
		System.out.println(linkedList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
	}

}
