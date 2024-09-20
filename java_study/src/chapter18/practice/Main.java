package chapter18.practice;

import java.util.Arrays;
import java.util.List;

//메인 클래스
public class Main {
	public static void main(String[] args) {
		// 1.Product 객체 생성
		Product pd1 = Product.builder()
				.name("삼성 북4")
				.price(1200.10)
				.description("삼성 북 시리즈의 네 번째 모델")
				.build();
		Product pd2 = Product.builder()
				.name("갤럭시 s24")
				.price(670.50)
				.description("삼성 핸드폰")
				.build();
		
		// 2. Customer 객체 생성 (중첩된 Address 객체 포함)
		Customer.Address address1 = Customer.Address.builder()
				.street("전포대로")
				.city("부산")
				.postalCode("12345")
				.build();
		
		Customer customer1 = Customer.builder()
				.name("이승아")
				.email("dev!")
				.address(address1)
				.build();
		
		// 3. Order 객체 생성
		List<Product> products = Arrays.asList(pd1, pd2);
		double totalPrice = Order.calculateTotalPrice(products);
		
		System.out.println(totalPrice);
		
		Order order = Order.builder()
				.orderId("ORD123")
				.customer(customer1)
				.products(products)
				.totalPrice(totalPrice)
				.build();
		
		System.out.println(order);
	}
}


















