package com.ssafy.modifier02;

public class Student {
	String name;
	int age;
	String major;
	
	public Student() {
	}

	public Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}

	// getter & setter
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
}
