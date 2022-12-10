package com.ssafy.modifier02;

import java.util.Scanner;

public class StudentTest {
	
	// 클래스 변수
	static Student[] students = new Student[10];
	static int size = 0;		// 배열의 크기 (학생 수)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sel;
		
		do {
			System.out.println("번호를 입력하시오");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 조회(이름으로)");
			System.out.println("3. 전공 변경");
			System.out.println("0. 종료");
			sel = sc.nextInt();
			if (sel == 1) {
				// 학생 추가
				System.out.println("학생을 추가합니다.");
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전공 : ");
				String major = sc.next();
				
				// 직접 빈껍데기를 만들고 하나하나 세팅
//				Student st = new Student();
//				st.setName(name);
//				st.setAge(age);
//				st.setMajor(major);
				
				Student st = new Student(name, age, major);
				students[size++] = st;

			} else if (sel == 2) {
				// 학생 조회
				System.out.println("학생을 조회합니다.");
				System.out.print("이름 : ");
				String name = sc.next();
				Student st = getStudent(name);
				if (st == null) {
					System.out.println("학생을 찾을 수 없습니다.");
				} else {
					System.out.println("조회한 학생의 정보는 ");
					System.out.println(st.getName());
					System.out.println(st.getAge());
					System.out.println(st.getMajor());
				}
				
				
			} else if (sel == 3) {
				// 전공변경
				System.out.println("전공을 변경합니다.");
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("전공 : ");
				String major = sc.next();
				changeMajor(name, major);
			}
		} while(sel != 0);
		
		
	}
	
	static void changeMajor(String name, String major) {
		Student s = getStudent(name);
		if (s != null) {
			s.setMajor(major);
		}
	}
	
	static Student getStudent(String name) {
		for (int i = 0; i < size; i++) {
			if(name.equals(students[i].getName())) {
				return students[i];
			}
		}
		return null;
	}
}
