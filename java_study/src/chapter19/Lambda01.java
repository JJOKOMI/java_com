package chapter19;

//람다 표현식
public class Lambda01 {
	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println("프로그램 실행");
		};
	}
}
