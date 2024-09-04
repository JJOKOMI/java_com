package chapter01;

public class C_TypeConversion {

	public static void main(String[] args) {
//		자바 형 변환 (= 묵시적 형 변환)
//		하나의 타입을 다른 타입으로 바꾸는 것
//		
//		자료형의 크기에 따른 형 변환 규칙을 파악해야한다.
//		byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
//		
//		메모리 설계 상 정수 타입보다 실수 타입이 더 크다.
		
//		자동 형 변환 (= 묵시적 형 변환)
		 byte smallBowl = 10;
		 int bigBowl = 10000;
		 
		 //작은 범위의 타입을 큰 타입으로 넣을때는 자동으로 형 변환을 컴파일러가 수행한다.
		 bigBowl = smallBowl;
		 
		 byte a =32;
		 short b = a;
		 int c = b;
		 long d = c;
		 
		 float e = d; // 실수는 정수 자료형보다 크다.
		 
		 //강제 형 변환 : 크기가 작은 자료형으로의 변환
		 int number1 = 1234;
		 float fNumber1 = number1; // 값 손실이 일어나지 않았기 때문에 들어가짐
		 
		 float fNumber2 = 3.14f;
//		 int number2 = fNumber2; 실수를 정수로 타입 변환 시 오류
		 
//		 강제 형 변환 방법
//		 : (작은변환자료형)큰데이터값;
		 int number2 = (int)fNumber2;
		 System.out.println(number2); // 실수를 정수로 변환 시: 소수점 이하의 데이터가 버려짐
		 
//		 char 자료형의 형 변환
		 
		 
	}

}
