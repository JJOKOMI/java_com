package chapter08;

class Vehicle {
	void display() {
		System.out.println("운송 수단 ");
	}
}

class Bus extends Vehicle {
	@Override
	void display() {
		System.out.println("버스를 타고갑니다.");
	}
}

class Subway extends Vehicle {
	@Override
	void display() {
		System.out.println("지하철을 타고갑니다.");
	}
}

public class B_Polymorphism {
	public static void main(String[] args) {
		Vehicle myVehicle = new Vehicle();
		Vehicle myBus = new Bus();
		Vehicle mySubway = new Subway();
		
		if (myBus instanceof Vehicle) {
			myBus.display();
		}
		if (myVehicle instanceof Bus) {
			System.out.println("운송수단은 버스입니다.");
		} else {
			System.out.println("운송수단은 버스가 아닙니다.");
		}
	}

}
