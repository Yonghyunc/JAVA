package java04.control;

public class IF02 {
	public static void main(String[] args) {
		// if(조건식) {} else {} 
		// 조건식이 참일 경우 if블록 내부 수행 
		// 거짓이면 else 블록 수행
		
		int age = 17;
		
		if(age < 20) {
			System.out.println("음료수를 먹어야 합니다");
		} else {
			System.out.println("맥주를 마실 수 있습니다");
		}
	}
}

