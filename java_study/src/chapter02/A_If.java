package chapter02;

import java.util.Scanner;

public class A_If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("x에 숫자를 입력해주세요");
		int x = sc.nextInt();
		System.out.println("y에 숫자를 입력해주세요");
		int y = sc.nextInt();
		
		String funtionScope = null;
		
		if(x > 0 && y > 0){
			funtionScope = "제 1사분면";
		} else if(x < 0 && y > 0 ){
			funtionScope = "제 2사분면";
		} else if(x < 0 && y < 0 ){
			funtionScope = "제 3사분면";
		} else if(x > 0 && y < 0 ) {
			funtionScope = "제 4사분면";
		}
		System.out.println("결과 : "+ funtionScope);
	}

}
