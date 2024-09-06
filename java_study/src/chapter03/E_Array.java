package chapter03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class E_Array {

	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<String>();
		
		items.add("사과");
		items.add("연필");
		items.add("책");
		items.add("시계");
		items.add("폼롤러");
		
		Random random = new Random();
		
//		random.nextInt();
		
		String selectedItem = items.get(random.nextInt(items.size()));
		
		Scanner sc = new Scanner(System.in);
		
		String userGuess;
		while(true) {
			System.out.println("아이템을 맞춰보시오");
			userGuess = sc.nextLine();
			
			if (userGuess.equals(selectedItem)) {
				System.out.println("정답");
				break;
				
			} else if(userGuess.equals("종료")) {
				break;
				
			} else {
				System.out.println("틀렷습니다. 다시시도하소");
			}
		}
		
		sc.close();
		System.out.println("종료되었습니다.");
		
	}

}
