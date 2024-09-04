package chapter01;

public class B_DataType {

	public static void main(String[] args) {
		
		
		/*
		 * 데이터 타입 (자료형, Data Type)
		 * 자바는 강타입 언어이다. 
		 * 모든 변수 선언시 반드시 데이터 타입을 명시 해야한다.
		 * 
		 * 1. 데이터 타입 종류 : 기본 타입과 참조 타입이 있다.
		 * 기본타입 : 변수 선언 시 해당되는 자료형의 크기 만큼 메모리 할당,실질적인 데이터가 저장
		 * 참조타입 : 객체의 참조(메모리 주소)를 저장하는 변수 타입
		 * 
		 * 2. 기본 자료형
		 * : 총 8가지의 기본형 타입이 존재한다.
		 * byte(1), short(2), long(8), float(4)
		 * int(4), double(8), char(2), boolean(1)
		 * 
		 */
		
		int age; // 변수 선언
		age = 30; // 변수 초기화
		int height = 169; //변수 선언과 동시에 초기화
		long bitNumber = 100000000l;//숫자뒤에 알파벳 l.L사용
		System.out.println(age);
		System.out.println(height);
		
		// 문자형
		//char : 하나의 문자를 저장하기 위한 변수를 선언 할 때 사용, 단일문자저장, 문자형의 데이터의 경우
		char grade = 'A';
		char lastName = '이';
		
		float weight = 70.9f;
		double weight2 = 35.1231231321;
		
		
//		참조자료형
//		기본 자료형을 기초로 만들어진 자료형
//		실제 데이터  값이 아니라 데이터가 저장된 주소값을 가지는 자료형
//		
//		종류 >> String : 문자열을 저장하는데 사용
//		Array >> 배열을 저장하는데 사용
//		
		
		String name = "이승아";
		int[] scores = {90,80,70};
		
	}

}
