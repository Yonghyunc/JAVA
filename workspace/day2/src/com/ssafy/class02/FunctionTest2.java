package com.ssafy.class02;

public class FunctionTest2 {
	public static void main(String[] args) {
		System.out.println("아침에 일어난다.");
		System.out.println("교육장으로 대중교통을 이용하여 이동한다.");
		교육();
		System.out.println("집으로 대중교통을 이용하여 이동한다.");
		System.out.println("과제를 해결한다.");
		System.out.println("잔다.");
		
		System.out.println("=======================");
		
		System.out.println("아침에 일어난다.");
		System.out.println("아침밥을 먹는다.");
		System.out.println("교육장으로 대중교통을 이용하여 이동한다.");
		교육();
		System.out.println("집으로 대중교통을 이용하여 이동한다.");
		System.out.println("과제를 해결한다.");
		System.out.println("잔다.");
	}
	
	// 중복된 코드를 함수로 만들어 사용 -> 유지보수, 재사용성 Good
	public static void 교육() {
		System.out.println("오전 수업을 듣는다.");
		System.out.println("점심을 먹는다.");
		System.out.println("오후 수업을 듣는다.");
	}
}
