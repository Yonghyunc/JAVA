package com.ssafy.inheritance02;

public class Person {
	String name;
	int age;
	
	public Person() {
		System.out.println("나는 Person의 기본 생성자야");
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("밥을 먹는다.");
	}
	
	public void eat(String food) {
		System.out.println(food + "냠냠");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
