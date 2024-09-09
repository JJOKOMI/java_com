package chapter10;

import java.util.Calendar;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연도: yyyy, 월: 1-12, 일: 1-31");
		int birthYear = sc.nextInt();
		int birthMonth = sc.nextInt();
		int birthDay = sc.nextInt();
		
		Calendar today = Calendar.getInstance() ;
		
		Calendar birthday = Calendar.getInstance();
		
		birthday.set(Calendar.YEAR, birthYear);
		birthday.set(Calendar.MONTH, birthMonth - 1);
		birthday.set(Calendar.DAY_OF_MONTH, birthDay);
		
		if(birthday.before(today)) {
			birthday.set(Calendar.YEAR, today.get(Calendar.YEAR) + 1);
		}
		
		long difference
		= (birthday.getTimeInMillis() - today.getTimeInMillis())
		/ (1000 * 60 * 60 * 24);
		
		System.out.println("남은 생일은:" + difference);
	}

}
