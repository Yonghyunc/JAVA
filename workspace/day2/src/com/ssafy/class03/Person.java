package com.ssafy.class03;

public class Person {
	static int personCount;
	String name;
	int age;
	String hobby;
	
	public Person() {
	}
	
	public void info() {
		System.out.println("나의 이름은  " + name + "입니다.");
		System.out.println("나이는  " + age + "세, 취미는 " + hobby + "입니다.");
	}
	
	public void study(int time) {
		// int time = (넘어온 값)
		// 파라미터는 해당 위치에 선언한 지역변수라고 볼 것
		System.out.println(time + "시간 공부했음");
	}
	
	// 메소드 오버로딩
	// 매개변수의 타입이 다르거나 개수가 다르게 정의하여 사용함
	// 리턴타입 의미 X
	// 매개변수 타입이 같고, 이름이 다른 것은 오버로딩이라고 하지 않음
	// ex) 아래의 time을 hour로 바꾼 새로운 메서드를 추가 작성하면 안됨
	public void study(long time) {
		System.out.println(time + "시간 공부했음");
	}
}
