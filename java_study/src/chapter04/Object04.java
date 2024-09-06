package chapter04;

class Book {
	String title;
	int number;


Book(String title,int number){
	this.title = title;
	this.number = number;
	
  }
}

public class Object04 {

	public static void main(String[] args) {
		Book myBook = new Book("노인과바다", 1);
		
		System.out.println(myBook.title);
		System.out.println(myBook.number);


	}

}
