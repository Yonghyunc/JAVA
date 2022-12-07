package java05.array;

import java.util.Arrays;

public class Array02_foreach {
	public static void main(String[] args) {
		
		int[] arr = {77, 50, 10, 12, 64, 15};
		
		// 원본 배열 변경 X
		for (int x : arr) {
			x *= 2;
			System.out.println(x);
		}
		
		for (int x : arr) {
			System.out.println(x);
		}
		
		// 원본 배열 변경 O
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2;
		}
		
		for (int x : arr) {
			System.out.println(x);
		}
		
		// 간편 출력
		System.out.println(Arrays.toString(arr));
	}
}

