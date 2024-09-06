package chapter03;

public class A_Array {

	public static void main(String[] args) {
		int korean = 90;
		int math = 75;
		int english = 80;
		
		int[] array;
		array = new int[3];
		
		System.out.println(array);
		
		array[0] = 123;
		array[1] = 456;
		array[2] = 789;
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
//		System.out.println(array[3]);
		
		int[] scoreList = new int[] {90, 85, 100};
		System.out.println(scoreList[0]);
		
		char[] greet = {'h', 'e', 'l', 'l', 'o'};
		System.out.println(greet[0]);
		System.out.println(greet[1]);
		System.out.println(greet[2]);
		System.out.println(greet[3]);
		System.out.println(greet[4]);
		
		System.out.println(greet.length);
		
		
		String[] fruits = new String[3];
		System.out.println(fruits[0]);
		
		int[] original = {1, 2, 3, 4};
		int removeIndex = 2;
		int originalLength = original.length;
		
		int[] result = new int[originalLength - 1]; //3
		
		int k = 0;
		
		for(int i = 0; i < originalLength; i++) {
			if (i == removeIndex) {
				continue;
			}
			result[k] = original[i]; //k -> 0,1,2가능  
			k++;
			
		}
		System.out.println(result[0]); //1
		System.out.println(result[1]); //2
		System.out.println(result[2]); //4
		
		int[] arrayNumber = {1, 3, 5, 7, 9};
		for (int number: arrayNumber) {
			System.out.println(number);
		}
		
		
		

	}

}
 