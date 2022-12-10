package com.ssafy.inheritance01;

public class MainTest {
	public static void main(String[] args) {
//		Person p = new Person();		// 나는 Person의 기본 생성자야
		Student st = new Student();
		
//		st.study();
		st.major = "법학";
		st.name = "양";
		st.age = 45;
		
		st.eat();
		
		System.out.println(st.toString());
	}
}
