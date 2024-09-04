package chapter02;

public class C_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 8; i++) {
			int dan = i + 2;
			System.out.println("[" + dan + "단]");
			for (int j = 0; j < 9; j++) {
				int number = j + 1;
				System.out.println(dan + "x" + number + "=" + dan * number);
			}
		}
	}

}
