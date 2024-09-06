package chapter02;

import java.util.Scanner;

public class E_Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isRun = true;
		
		System.out.println("프로그램 시작");
		
		while(isRun) {
			System.out.println("[회원 조회]");
			System.out.println("1. 회원 번호로 조회");
			System.out.println("2. 회원 이름으로 조회");
			System.out.println("b. 뒤로가");
			
			System.out.println("메뉴 선택 : ");
			
			String selectedMenu = sc.nextLine();
			
			switch (selectedMenu) {
			case "1":
				System.out.println("회원 등록 기능입니다.");
				break;
			case "2":
				System.out.println("회원 이름으로 조회합니다.");
				break;
			case "3":
				System.out.println("회원 탈퇴 기능입니다.");
				break;
			case "q":
				System.out.println("프로그램을 종료합니다.");
				isRun = false;
				break;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
				
			}
		}
		System.out.println("프로그램 종료");
	}

}
