package chapter01;

import java.util.Scanner;

public class D_IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//스캐너 사용 방법
//		sc.next(); //입력내용을 문자열로 반환
//		sc.nextLine(); // 엔터까지의 전체 라인을 문자열로 반환
//		sc.nextInt(); //정수 데이터
//		sc.nextDouble(); // 실수 데이터
		
		System.out.println("정수를 입력해주세요");
		
		int age = sc.nextInt();
		System.out.println("입력한 나이 : " + age);
		
		
		
		
	}

}
