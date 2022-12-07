package java03.operator;

public class Op01_단항연산자 {
	public static void main(String[] args) {
		int a = 5;
		System.out.println( a++ ); 	// 5
		System.out.println( ++a );	// 7
		System.out.println( --a );	// 6
		System.out.println( a );	// 6
		System.out.println( a-- );	// 6
		System.out.println( a++ );	// 5
		
		System.out.println( -a );	// -6
		System.out.println( ~a );	// -7
		
		System.out.println(!false);	// true
	}
}

