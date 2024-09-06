package chapter06;

class Data1 {
	int value;
}

class Data2 {
	int value;
	
	Data2 (int x) {
		value = x;
	}
}

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {}
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class Constructor {

	public static void main(String[] args) {
		Data1 data1 = new Data1();
		data1.value = 10;
		
	}

}
