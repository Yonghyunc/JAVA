package com.ssafy.modifier01;

// 스캐너를 사용하기 위해서 import 해서 가져옴
//import java.util.Scanner;
//import java.util.Arrays;

// 전체를 넣고 싶다면
import java.util.*;

// 하위 패키지 포함 X
import java.util.function.*;

import com.ssafy.class03.Person;
import com.ssafy.class05.DogTest;

public class PackageTest {
	public static void main(String[] args) {
		Scanner sc;
		
		Arrays arr;
		
		Function f;
		
		Person p;	// class03에 있는 Person을 가지고 옴
		
		com.ssafy.class02.Person p2; // import를 하지 않고 여기에 풀패키지명을 작성할 수도 있음

		DogTest dt;
	}
}
