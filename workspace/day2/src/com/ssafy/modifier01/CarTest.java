package com.ssafy.modifier01;

public class CarTest {
	public static void main(String[] args) {
		// 자동차 하나 생성
		Car c = new Car();
		
		// 같은 패키지 이기 때문에 이렇게 작성 가능
		c.color = "Red";
//		c.speed = 100;
		
//		c.speed = 300; 	// 이렇게 작성한 것을 막을 수 없음
		
		// private -> 읽을 수도 없어짐 -> set, get 메소드를 통해 접근하게 함
		
		c.setSpeed(300);
		System.out.println(c.getSpeed());
		
	}
}
