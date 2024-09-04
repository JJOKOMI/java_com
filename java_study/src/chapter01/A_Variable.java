package chapter01;

public class A_Variable {

	public static void main(String[] args) {

		//변수 : 데이터를 저장할 수 있는 메모리 '공간'
		
		// 1. 변수를 선언 : 메모리 공간 생성
		// 변수 선언 방법(그릇생성) : 데이터타입 + 변수명;
		// 변수 초기화 방법(그릇에 데이터넣기)
		// : 변수명 = 데이터값;
		
		// 변수 선언과 동시에 초기화 : 데이터 타입 + 변수명 = 데이터 값;
		
		// 2. 변수 명명 규칙 : 문자,숫자,기호 사용 .. 기호로 시작가능
		// 대소문자 구분!, 길이 제한이 없음 (Name !== name)
		// 숫자로 시작 할수없다. 기호는 _(언더스코어) 와 $만 가능
		// lowerCameCase를 사용 시작은 소문자로 시작
		// 자바의 예약어, 키워드는 변수명으로 사용 할 수 웂다
		// +상수와의 구분을 위해 전체 대문자 사용x
		
		int num = 10;
		char chr1 = '가';
		boolean bool1 = true;
		
		// 상수 : 프로그램 실행 동안 그 값이 변경되지 않는 변수, 선언과 동시에 반드시 초기화가 이루어져야함
		// 상수 선언 방법 : final 키워드를 사용하여 상수 선언
		// final + 데이터타입 + 상수명 = 데이터값;
		// 2. 상수 명명 규칙: 보통 전체대문자로 명명함, UPPER_SNACK_CASE 사용
		//ex) PI, RESIDENT_NUMBER
		
		final float PI = 3.14159f;
		final int RESIDENT_NUMBER = 1234567;
		
		System.out.println();
		//컨트롤 시프트 S 동시저장
		
		
		
		
		
		
	}

}
