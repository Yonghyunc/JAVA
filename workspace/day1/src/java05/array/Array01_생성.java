package java05.array;

public class Array01_생성 {
	public static void main(String[] args) {
		
		// 1차원 배열을 선언하는 방법
		int[] score1;
		int score2[];
		
//		score1 = {1,2,3,4,5}; // 사용 불가
		score1 = new int[] {1,2,3,4,5};
		
		int[] score3 = {1,2,3,4,5};
		
		int[] score4 = new int[5];
		
		score4[0] = 10;
		score4[1] = 20;
		score4[2] = 30;
		score4[3] = 40;
		
		for (int i = 0; i < score4.length; i++) {
			System.out.println(score4[i]);
		}
	}
}


