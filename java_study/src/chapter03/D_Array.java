package chapter03;

import java.util.ArrayList;
import java.util.Arrays;

public class D_Array {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		
		System.out.println(Arrays.toString(numbers));
		
		Integer a = 123;
		System.out.println(a);
		
		ArrayList<Integer> arrayList = new ArrayList<>(5);
		
		System.out.println(arrayList);
		
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		
		System.out.println(arrayList);
		
		arrayList.set(1, 50);
		System.out.println(arrayList);
		
		arrayList.remove(2);
		System.out.println(arrayList);
		
		System.out.println(arrayList.size());
		
		arrayList.add(1, 123);
		System.out.println(arrayList);
		
		System.out.println(arrayList.get(1));
	}

}
