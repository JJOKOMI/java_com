package chapter03;

import java.util.Arrays;

public class C_Array {

	public static void main(String[] args) {
		int[] numbers = {3, 2, 5, 4, 1};
		
		Arrays.sort(numbers);
		System.out.println(numbers[0]);
		
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(Arrays.binarySearch(numbers, 3));
		System.out.println(Arrays.binarySearch(numbers, 6)); // 음수로 반환
		
		int[] number2 = {1, 2, 3, 4, 5};
		System.out.println(Arrays.equals(numbers, number2));
		
		int[] number3 = {1, 2, 3, 5, 5};
		System.out.println(Arrays.equals(numbers, number3));
		
		int[] example = new int[3];
		Arrays.fill(example, 10);
		
		System.out.println(Arrays.toString(example));
	}

}
