package java05.array;

import java.util.Arrays;

public class Array03_copy {
	public static void main(String[] args) {
		
		int[] arr = { 77, 50, 10, 12, 64, 15 };
		
		int[] tmp = new int[arr.length*2];
		
		System.arraycopy(arr, 0, tmp, 0, arr.length);
		
		System.out.println(Arrays.toString(tmp));
	}
}
