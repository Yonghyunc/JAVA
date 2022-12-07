package java01.intro;

public class Intro03_PrintTest {
	public static void main(String[] args) {
		// print 를 써보자
		System.out.print("Hello World");
		System.out.print("Hello World\n");
		// 줄바뀜 : \n
		// 백슬래쉬 출력하려면
		System.out.println("\\");
		
		// println 을 써보자
		System.out.println("Hello World!!");
		
		System.out.printf("%d \n", 10);		// 정수 (10진수)
		System.out.printf("%o \n", 10);		// 정수 (8진수)
		System.out.printf("%x \n", 10);		// 정수 (16진수)
		
		System.out.printf("%4d \n", 10);	// 4칸을 확보한 뒤 오른쪽부터 차지
		System.out.printf("%-4d \n", 10);	// 4칸을 확보한 뒤 왼쪽부터 차지
		System.out.printf("%04d \n", 10);	// 4칸을 확보한 뒤 오른쪽부터 차지(빈칸 0을 채움)
		
		System.out.printf("%f \n", 10.1);	// 실수
		System.out.printf("%.2f \n", 10.103);	// 실수 (소수점 둘째자리까지)

		System.out.printf("%s \n", "자바");	// 문자열
		System.out.printf("%c \n", 'o');	// 문자
		
		System.out.printf("안녕하세요. 저는 %s입니다. 제 혈액형은 %c입니다.", "용현", 'a');
		
	}
}
