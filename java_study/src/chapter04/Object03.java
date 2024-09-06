package chapter04;

class Car {
	String model;
	int year;

void displayInfo(){
	System.out.println("Model:" + model + ", year :" + year);
}

Car(String modelName, int year) {
	model = modelName;
	this.year = year;
};

}

public class Object03 {
	public static void main(String[] args) {
		Car myCar= new Car("volvo xc60", 2024);
		
		System.out.println(myCar.model);
		System.out.println(myCar.year);
		
		myCar.displayInfo();
		
	}
}