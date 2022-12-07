package java02.variable;

public class Var02_TypeCasting {
	public static void main(String[] args) {
		int a = 10;
		int b = a;
		System.out.printf("a : %d \n", a);
		System.out.printf("b : %d \n", b);
		
		a = 12;
		// b도 바뀔까?
		System.out.printf("a : %d \n", a);
		System.out.printf("b : %d \n", b);
		
		// 묵시적
		short sa = 32767;
		int c = sa;
		
		// 명시적		
		short sb = (short) c;
		
		float f = 10;
		// 같은 크기의 집이라도 컨펌이 필요한 경우 (명시적)
		int g = (int) f;
		
		System.out.println(sa);
	}
}

