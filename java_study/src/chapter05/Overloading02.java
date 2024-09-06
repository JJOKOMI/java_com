package chapter05;

// 음식점 클래스
// : 다양한 방법으로 주문을 받는 메서드 정의
class Restaurant {
	// 메서드 정의
	// : placeOrder 주문 메서드
	// >> 메뉴 이름(String dish)
	// >> 메뉴 이름, 수량 제공(int quantity)
	// >> 메뉴 이름, 특별 요청 사항 제공(String specialRequests)
	// >> 메뉴 이름, 수량 제공, 특별 요청 사항 제공
	
	void placeOrder(String dish) {
		System.out.println(dish);
	}
	void placeOrder(String dish, int quantity) {
		System.out.println(dish + quantity);
	}
	void placeOrder(String dish, String specialRequests) {
		System.out.println(dish + specialRequests);
	}
	void placeOrder(String dish, int quantity, String specialRequests) {
		System.out.println(dish + quantity + specialRequests);
	}
}

public class Overloading02 {
	public static void main(String[] args) {
		// 인스턴스 생성
		// 
		
		Restaurant rest = new Restaurant();
		
		rest.placeOrder("수미니는 바보야");
		rest.placeOrder("수미니는 내 숙취해소제 왜 안먹어", 0);
		rest.placeOrder("너무해", "똥꼬미야");
		rest.placeOrder(null, 0, null);
	}
}