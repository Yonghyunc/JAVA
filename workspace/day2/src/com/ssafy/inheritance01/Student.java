package com.ssafy.inheritance01;

public class Student extends Person {
	String major;
	
	public Student() {
		super(); 		// 부모의 기본생성자 호출
		System.out.println("나는 Student의 기본 생성자야");
	}
	
	public void study() {
		super.eat();
		System.out.println("공부를 한다.");
	}
	
	// 메서드 오버라이딩
	@Override
	public void eat() {
		System.out.println("지식을 먹는다.");
	}
	
	@Override
	public String toString() {
//		return super.name + "이고," + major + "전공입니다.";
		return super.toString() + "이고," + major + "전공입니다.";
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
