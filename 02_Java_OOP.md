# TIL

- [객체지향 프로그래밍](#객체지향-프로그래밍-oop)

- [클래스](#클래스)

- [JVM 메모리 구조](#jvm-메모리-구조)

- [생성자](#생성자)

- [접근제한자](#접근제한자)

- [상속](#상속)


---

# 객체지향 프로그래밍 (OOP)
Object Oriented Programming   

◽ 객체 : 유형 + 무형    
◽ 지향 : 작정하거나 지정한 방향으로 나아감    
◽ 객체 모델링 : 현실세계의 객체를 SW 객체로 설계하는 것   

> 객체 간의 상호작용 

<br>

## OOP 특징 (OOP is A PIE)
1️⃣ **A**bstraction (추상화)   
2️⃣ **P**olymorphism (다형성)   
3️⃣ **I**nheritance (상속)    
4️⃣ **E**ncapsulation (캡슐화)    

<br><br>

---

# 클래스
``` java
package com.ssafy.class01;

public class PersonTest {
	public static void main(String[] args) {
		String name1 = "Yang";
		String name2 = "Hong";
		
		int age1 = 45;
		int age2 = 25;
		
		String hobby1 = "Youtube";
		String hobby2 = "Golf";
		
		// 배열을 이용한 작성 
		int size = 2;
		String[] names = new String[size];
		names[0] = "Yang";
		names[1] = "Hong";
		
		int[] ages = new int[size];
		ages[0] = 45;
		ages[1] = 25;
		
		String[] hobbies = new String[size];
		hobbies[0] = "Youtube";
		hobbies[1] = "Golf";
		
		// BUT names, ages, hobbies 는 별개의 데이터
	}
}
```
<br>

❓ 서로 다른 변수를 어떤 하나의 변수/자료형에 묶어 관리할 수는 없을까?   

``` java
package com.ssafy.class02;

// 이러한 다양한 자료형을 가질 수 있는 자료형을 만들고 싶다.
public class Person {
	String name;
	int age;
	String hobby;
}
```
> 프로그래밍 : 명령어들의 작업지침서  

<br><br>

## 함수 (Function)

### 기본
``` java
System.out.println("아침에 일어난다.");
System.out.println("교육장으로 대중교통을 이용하여 이동한다.");
System.out.println("오전 수업을 듣는다.");
System.out.println("점심을 먹는다.");
System.out.println("오후 수업을 듣는다.");
System.out.println("집으로 대중교통을 이용하여 이동한다.");
System.out.println("과제를 해결한다.");
System.out.println("잔다.");

System.out.println("=======================");

System.out.println("아침에 일어난다.");
System.out.println("아침밥을 먹는다.");
System.out.println("교육장으로 대중교통을 이용하여 이동한다.");
System.out.println("오전 수업을 듣는다.");
System.out.println("점심을 먹는다.");
System.out.println("오후 수업을 듣는다.");
System.out.println("집으로 대중교통을 이용하여 이동한다.");
System.out.println("과제를 해결한다.");
System.out.println("잔다.");
```
> 반복되는 코드도 그대로 사용 

<br>

### 1단계
```java
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
```
<br>

### 2단계
``` java
package com.ssafy.class02;

public class FunctionTest3 {
	public static void main(String[] args) {
		System.out.println("아침에 일어난다.");
		이동("교육장", "대중교통");
		교육();
		이동("집", "대중교통");
		System.out.println("과제를 해결한다.");
		System.out.println("잔다.");
	}
	
	public static void 이동(String 장소, String 탈것) {
		System.out.println(장소 + "(으)로" + 탈것 + "(을)를 이용하여 이동한다.");
	}
}
```
> 파라미터를 이용하여 함수 생성

<br>

### 3단계

``` java
package com.ssafy.class02;

import java.util.Random;

public class FunctionTest4 {
	public static void main(String[] args) {
		boolean homework;
		
		System.out.println("아침에 일어난다.");
		이동("교육장", "대중교통");
		homework = 교육();
		이동("집", "대중교통");
		if (homework)
			System.out.println("과제를 해결한다.");
		System.out.println("잔다.");
	}
	
	public static boolean 교육() {
		System.out.println("오전 수업을 듣는다.");
		System.out.println("점심을 먹는다.");
		System.out.println("오후 수업을 듣는다.");
		//과제 랜덤 발생기
		Random random = new Random();
		return random.nextBoolean();
	}
}
```
<br>

⬇
<br>

``` java
public class Person {
	String name;
	int age;
	String hobby;
	
	public void info() {
		System.out.println("나의 이름은  " + name + "입니다.");
		System.out.println("나이는  " + age + "세, 취미는 " + hobby + "입니다.");
	}
}
```
<br><br>

## 클래스
◽ 관련 있는 변수(속성)와 함수를 묶어서 만든 사용자정의 자료형   
◽ 모든 객체들의 생산처    
◽ 클래스 == 객체를 생성하는 틀      

◽ 프로그래밍이 쓰이는 목적을 생각하여 어떤 객체를 만들어야 하는 지 결정     
◽ 각 객체들이 어떤 특징(속성, 동작)을 가지고 있을지 결정    
◽ 클래스를 통해 생성된 객체 ➡ 인스턴스
> 클래스 =/= 인스턴스   
> 클래스 - 인스턴스를 만들기 위한 틀    
> 인스턴스 - 그로 인해 만들어진 객체    

◽ 객체들 사이에서 메시지를 주고 받도록 만들어 줌    
> 메소드를 이용해 상호작용  

<br>

### 클래스 구성
1️⃣ 속성(Attribute) - 필드 (멤버 변수)   
2️⃣ 동작(Behavior) - 메소드 (클래스 안에 정의한 함수)   
3️⃣ 생성자(Constructor) - 인스턴스 생성 시 호출하는 메소드

➕ 이너 클래스 : 클래스 안에 정의한 클래스    

<br>

### 클래스 선언
``` 
[접근제한자][활용제한자] class 클래스명 {
  속성 정의 (필드)
  기능 정의 (메소드)
  생성자
}
```

◽ 접근제한자 : public / default   
◽ 활용제한자 : final / abstract   


<br><br>

### 변수

1️⃣ 클래스 변수     
◽ 클래스 영역 선언 (static 키워드) 
> 클래스 영역 : 중괄호 내부

> 값을 초기화하지 않으면 기본값으로 초기화

◽ 생성시기 : 클래스가 메모리에 올라 갔을 때  
◽ 소멸시기 : 프로그램 종료 시     
◽ 모든 인스턴스가 공유    

<br>

2️⃣ 인스턴스 변수     
◽ 클래스 영역 선언    
> 초기화가 자동으로 진행

◽ 생성시기 : 인스턴스가 생성되었을 때 (new)   
◽ 소멸시기 : 더 이상 해당 인스턴스를 가리키거나 참조하고 있는 곳이 없을 때    
◽ 인스턴스 별로 생성    

<br>

3️⃣ 지역 변수 (파라미터 변수)     
❌ 사용 전 초기화 반드시 필요 ❌    
◽ 클래스 영역 이외 (메서드, 생성자 ... 등)    
> 외부 접근 불가  

◽ 생성시기 : 선언되었을 때
◽ 소멸시기 : 중괄호를 벗어나면 소멸   


인스턴스 변수 -> 자신들만의 고유한 상태가 있음

클래스 변수 특징 -> 모든 인스턴스가 공유 

<br><br>

### 메소드

◽ 객체가 할 수 있는 행동 정의   
◽ 어떤 작업을 수행하는 명령문의 집합    
◽ 메소드의 이름은 소문자로 시작하는 것이 관례   

``` 
[접근제한자][활용제한자] 반환값 메소드이름([매개변수들]) {
  행위 기술...
}
```

◽ 접근제한자 : public / protected / default / private   
◽ 활용제한자 : static / final / abstract / synchronized     
◽ 매개변수 : 파라미터 (없어도 됨)    
◽ 반환값 : 리턴 타입 (없어도 되는데 생략 불가 -> void)         

#### Why❔ 
◽ 반복되는 코드 사용 피함 (재사용)    
◽ 유지보수 용이

#### 선언
◽ 중괄호 {} 안 메소드가 해야 할 일 정의   

#### 호출
◽ 호출한 메소드가 선언되어 있는 클래스 접근   
◽ **클래스 객체.메소드 이름**으로 호출    
◽ static이 메소드에 선언되어 있을 때는 **클래스 이름.메소드 이름**으로 호출     

#### 매개변수 (Parameter)
메소드에서 사용하는 것    

#### 인자 (Argument)
호출하는 쪽에서 전달하는 것   

◽ 매개변수 생략 가능   
◽ 파라미터 전달 시 묵시적 형 변환   

◽ 리턴 타입은 메소드를 선언할 때 지정, 없다면 void (return문 생략 O)    
◽ 리턴 타입을 작성했다면, 반드시 해당 타입을 리턴   
◽ 리턴 타입은 하나만 적용 가능      

### 메소드 오버로딩 
◽ 이름이 같고 매개변수가 다른 메소드를 여러 개 정의하는 것    
◽ 중복 코드에 대한 효율적 관리 가능   
◽ 파라미터의 개수 또는 순서, 타입이 달라야 할 것 (파라미터 이름만 다른 것 X)    
◽ 리턴 타입이 다른 것은 의미 X    
ex) System.out.println    

<br><br>

**클래스** : 관련 있는 변수와 함수를 묶어 만든 사용자 정의 자료형

**객체** : 하나의 역할을 수행하는 '메소드와 변수(데이터)'의 묶음  

**객체지향 프로그래밍** : 프로그램을 단순히 데이터와 처리 방법으로 나누는 것이 아니라, 프로그램을 수많은 '객체(object)'라는 기본 단위로 나누고 이들의 상호작용으로 서술하는 방식    

<br><br>

---


# JVM 메모리 구조
◽ GC(Garbage Collection)가 메모리 관리    

![image](https://user-images.githubusercontent.com/93974908/206113675-d8c40ef7-e0a1-4f8a-8297-2965eac1d031.png)


### static 특징
1️⃣ 로딩 시점   
◽ static : 클래스 로딩 시     
◽ non-static : 객체 생성 시     

<br>

2️⃣ 메모리상의 차이   
◽ static : 클래스 당 하나의 메모리 공간만 할당   
◽ non-static : 인스턴스 당 메모리가 별도로 할당   

<br>

3️⃣ 문법적 특징   
◽ static : 클래스 이름으로 접근   
◽ non-static : 객체 생성 후 접근    

<br>

4️⃣ static 영역에서는 non-static 영역 직접 접근 불가능 

``` java
public class Main {
    String str = "문장";

    public static void main(String[] args) {
      System.out.println(str);    // 사용불가
    }
}
```
> str은 인스턴스 변수 - 설계도에만 있음 (아직 메모리 할당 X)    
> static은 이미 메모리에 올라가서 우리가 수행 가능  

<br>

5️⃣ non-static 영역에서는 static 영역에 대한 접근 가능
``` java
public class Main {
    static String str = "문장";

    public static void print() {
      System.out.println(str);    // 사용가능
    }
}
```

<br><br>

---

# 생성자
◽ 인스턴스가 생성될 때 최초 한번 수행되는 함수    
- new 키워드와 함께 호출
- 클래스를 생성할 때 반드시 하나의 생성자 호출  
- 성공적으로 실행되 힙 영역에 객체 생성 후 객체의 번지 리턴
- 필드의 초기화, 객체 생성 시 실행되어야 할 작업 생성
- PascalCase로 작성하는 것이 관례
> 클래스 이름을 PascalCase로 작성하는 것이 관례   
> 클래스 이름 == 생성자 이름


### 특징 
◽ 클래스명과 이름이 동일  
◽ 반환타입 X (void 작성 X)    
◽ 기본 생성자
- 클래스 내에 생성자가 하나도 정의되어 있지 않을 경우 JVM이 자동으로 제공하는 생성자
- 형태 : 매개변수가 없는 형태, 클래스명() {}

◽ 파라미터가 있는 생성자
- 생성자의 목적 : 필드 초기화
- 생성자 호출 시 값을 넘겨주어야 함
- 해당 생성자를 작성하면 JVM에서 기본 생성자 추가 X

◽ 생성자 오버로딩 지원
- 클래스 내, 메소드 이름이 같고 매개변수의 타입 또는 개수가 다른 것

### this
◽ 참조 변수로써 객체 자신   
◽ this를 이용하여 자신의 멤버 접근 가능   
◽ 지역변수와 필드의 이름이 동일할 경우 필드임을 식별할 수 있게 함   
◽ 객체에 대한 참조 ➡ static 영역에서 this 사용 불가    

✔ 활용   
◽ this.멤버변수   
``` java
class Dog {
    String name;
    int age;
    Dog (String name, int age) {
      this.name = name;
      this.age = age;
    }
}
```
> this.name은 인스턴스 변수 name을 가리킴

◽ this ([인자값...]) : 생성자 호출    
``` java
class Dog {
    String name;
    int age;
    Dog () {
        // Dog("쫑");      // 오류 발생
        this("쫑");
    }
    Dog (String name) {
    }
}
```

◽ this 생성자 호출 시 제한사항  
- 생성자 내에서만 호출 가능 
- 생성자 내 첫번째 구문에 위치해야 함





<br><br>

---

# 접근제한자

### 패키지 
◽ 프로그램의 많은 클래스를 관리하기 위해 패키지 이용    

◽ 클래스와 관련 있는 인터페이스들을 모아두기 위한 **이름 공간**   
◽ 패키지 구분은 . 연산자 이용   
◽ 패키지의 이름은 시중에 나와 있는 패키지들과 구분되게 지어야 함 (일반적으로 소속이나 회사의 도메인 사용)   

**com.ssafy.project_이름.module_이름**

<br><br> 

### 임포트
> 자동 임포트 : ctrl + shift + 5

◽ 다른 패키지에 있는 클래스를 사용하기 위해서는 import 과정 필요    

**import package_이름.class_이름;**   
**import package_이름.*;**   


> *를 찍었다고 해도 구조상 하위 패키지 포함 X     
> ➡ 따로 import 필요   

``` java
package com.ssafy.modifier01;

// 스캐너를 사용하기 위해서 import 해서 가져옴
//import java.util.Scanner;
//import java.util.Arrays;

// 전체를 넣고 싶다면
import java.util.*;

// 하위 패키지 포함 X
import java.util.function.*;

import com.ssafy.class03.Person;

public class PackageTest {
	public static void main(String[] args) {
		Scanner sc;
		
		Arrays arr;
		
		Function f;
		
		Person p;	// class03에 있는 Person을 가지고 옴
		
		com.ssafy.class02.Person p2; // import를 하지 않고 여기에 풀패키지명을 작성할 수도 있음
	}
}
```

> java.lang 은 기본적으로 들어있음 (쓰지 않아도 실행 O)

<br><br> 

### 캡슐화
> . == 가지고 있는      

◽ 객체의 속성(data fields)과 행위(methods)를 하나로 묶고 실제 구현 내용 일부를 외부에 감추어 은닉   
![image](https://user-images.githubusercontent.com/93974908/206137568-0f71e038-6eaf-4cb6-bd3e-92f6f8e8dbd8.png)
> 숨길건 숨기고, 오픈할건 오픈

<br><br> 

## 접근제한자
◽ 클래스, 멤버 변수, 멤버 메서드 등의 선언부에서 접근 허용 범위를 지정하는 역할의 키워드    

<br>

### 종류    
> 접근 강함 순서대로

1️⃣ public
- 모든 위치에서 접근 가능

2️⃣ protected
- 같은 패키지에서 접근 가능 (다른 패키지 X)
- 단, 다른 패키지의 클래스와 상속 관계가 있을 경우 접근 가능

3️⃣ default
- 같은 패키지에서만 접근 허용
- 접근제한자가 선언이 안 되었을 경우 기본 적용


4️⃣ private
- 자신 클래스에서만 접근 허용

◽ 클래스(외부) 사용가능 : public, default   
◽ 내부클래스, 멤버변수, 메소드 사용가능 : all   

![image](https://user-images.githubusercontent.com/93974908/206139383-a7824ee9-165b-41ae-ab88-d670af4dea3f.png)

<br>

### 그 외 제한자
- static : 클래스 레벨의 요소 설정
- final : 요소를 더 이상 수정할 수 없게 함
- abstract : 추상 메서드 및 추상 클래스 작성
- ...

<br>

### 접근자(getter) / 설정자(setter)
◽ 클래스에서 선언된 변수 중 접근제한에 의해 접근할 수 없는 변수의 경우, 다른 클래스에서 접근할 수 없음    
➡  접근하기 위한 메서드(설정자 / 접근자)를  public으로 선언하여 사용   


``` java
package com.ssafy.modifier01;

public class Car {
	String color;
	// 아래의 스피드를 외부에서 접근할 수 없게 만들고 싶다
	private int speed;		// 속도는 최소 0, 최대 250
	
	public void setSpeed(int speed) {
		if (speed <= 250 && speed >= 0) 
			this.speed = speed;			
		else
			System.out.println("이상한 속도는 넣지마!");
	}
	
	public int getSpeed() {
		return this.speed;
	}
}
```

``` java
package com.ssafy.modifier01;

public class CarTest {
	public static void main(String[] args) {
		// 자동차 하나 생성
		Car c = new Car();
		
		// 같은 패키지 이기 때문에 이렇게 작성 가능
		c.color = "Red";
//		c.speed = 100;
		
//		c.speed = 300; 	// 이렇게 작성한 것을 막을 수 없음
		
		// private -> 읽을 수도 없어짐 -> set, get 메소드를 통해 접근하게 함
		
		c.setSpeed(100);
		System.out.println(c.getSpeed());
		
	}
}
```

> car -> default   
> 같은 패키지이기 때문에 접근 가능

**source > generate Getter and Setter로 자동생성 가능**


> boolean 일 때는 is_
``` java
	private boolean hungry;
	
	public boolean isHungry() {
		return hungry;
	}
	
	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}
```

<br><br>

``` java
package com.ssafy.modifier03;

public class Student {
	String name;
	int age;
	String major;
	
	public Student() {
	}

	public Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}

	// getter & setter
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
}
```

``` java
package com.ssafy.modifier03;

public class StudentManager {
	Student[] students = new Student[100];
	int size = 0;
	
	public void addStudent(Student s) {
		students[size++] = s;
	}
	
	void changeMajor(String name, String major) {
		Student s = getStudent(name);
		if (s != null) {
			s.setMajor(major);
		}
	}
	
	Student getStudent(String name) {
		for (int i = 0; i < size; i++) {
			if(name.equals(students[i].getName())) {
				return students[i];
			}
		}
		return null;
	}
}
```

``` java
package com.ssafy.modifier03;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentManager sm = new StudentManager();
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
				
				Student st = new Student(name, age, major);
				sm.addStudent(st);

			} else if (sel == 2) {
				// 학생 조회
				System.out.println("학생을 조회합니다.");
				System.out.print("이름 : ");
				String name = sc.next();
				Student st = sm.getStudent(name);
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
				sm.changeMajor(name, major);
			}
		} while(sel != 0);	
	}
}
```


<br><br>

### 싱글턴 패턴
◽ 생성자가 여러 차례 호출되더라도 실제로 생성되는 객체는 하나이고, 최초 생성 이후에 호출된 생성자는 최초의 생성자가 생성한 객체를 리턴    
> 어디에서든 한번만 만든 매니저는 어디서 실행하든 딱 한 번만 만들고, 그 친구를 데려오고 싶어

``` java
// StudentManager.java

public class StudentManager {
	// 이 클래스가 외부에서는 생성되지 않았으면
	private Student[] students = new Student[100];
	private int size = 0;
	
	private static StudentManager manager = new StudentManager();
	
	private StudentManager() {
	}
	
	public static StudentManager getManager() {
		return manager;
	}
  ...
}
```
``` java
// StudentTest.java

StudentManager sm = StudentManager.getManager();
```


<br><br>

---

# 상속 (Ingeritance)
어떤 클래스의 **특성을 그대로 갖는** 새로운 클래스를 정의한 것    

🧒 상위 클래스 = 부모 클래스 = super class   
👶 하위 클래스 = 자식 클래스 = sub class     

<br>

◽ 상속 X   
![image](https://user-images.githubusercontent.com/93974908/206835322-8802bb2b-afdf-4bfc-8f9b-948838ad326b.png)

◽ 상속 O   
![image](https://user-images.githubusercontent.com/93974908/206835331-e8e378d3-d5fe-4463-bbe3-301ea0b53e0c.png)

> Object 클래스 ?

<br>

1️⃣ 확장성, 재사용성    
◽ 부모의 생성자와 초기화 블록은 상속 X

2️⃣ 클래스 선언 시 **extends** 키워드 명시    
◽ 자바는 다중 상속 허용 X, 단일 상속 only   

3️⃣ 관계    
◽ 부모(상위, Super) 클래스 : Person   
◽ 자식(하쉬, Sub) 클래스 : Student    

4️⃣ 자식 클래스는 부모 클래스의 멤버변수, 메소드를 자신의 것처럼 사용 O   
(단, 접근 제한자에 따라 사용 여부가 달라짐)   

5️⃣ Object 클래스는 모든 클래스의 조상 클래스   
◽ 별도의 extends 선언이 없는 클래스는 extends Object가 생략   

6️⃣ super 키워드    
◽ super를 통해 조상 클래스의 생성자 호출    

> Student   
> Person    
> Object    

> Student는 모든 내용은 가지고 있음   

``` java
package com.ssafy.inheritance01;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
```
``` java
package com.ssafy.inheritance01;

public class Student extends Person {
	String major;
	
	public Student() {
		super(); 		// 부모의 기본생성자 호출
		System.out.println("나는 Student의 기본 생성자야");
	}
```

`super();`
괄호 안에 아무것도 안 쓰면 부모의 기본생성자 호출   
BUT 부모의 기본생성자가 아무것도 안 만들어졌으면 ERROR    
⬇
`super("양", 45);`    

<br>

◽ super를 통해 조상 클래스의 메서드 호출  

``` java
public class Person {
  ...
	public void eat() {
		System.out.println("밥을 먹는다.");
	}
}
```

``` java
public class Student extends Person {
  ...
	public void study() {
		super.eat();
		System.out.println("공부를 한다.");
	}
}
```
<br>


7️⃣ 오버라이딩 (재정의, overriding)   
``` java
public class Student extends Person {
  ...
	// 메서드 오버라이딩
  @Override
	public void eat() {
		System.out.println("지식을 먹는다.");
	}
}
```
> 부모의 메서드 이름과 동일한 메서드 작성

#### @Override
@ : Annotation - 컴파일러가 보는 주석     

Override : 해당 메서드는 재작성 되었음    

장점 : 조금 더 안전한 프로그램 작성 가능    

<br>

◽ 상위 클래스에 선언된 메서드를 자식 클래스에서 재정의하는 것   
◽ 메서드의 이름, 반환형, 매개변수 (타입, 개수, 순서) 동일 해야 함    
◽ 하위 클래스의 접근제어자 범위가 상위 클래스보다 크거나 같아야 함    
- 부모가 오픈했는데, 자식이 감출 수 X 
◽ 조상보다 더 큰 예외 X     
> 메서드 오버로딩(overloading)과 혼동 X    

<br><br>

### Object 클래스
◽ 가장 최상위 클래스로 모든 클래스의 조상   
◽ Object의 멤버는 모든 클래스의 멤버    


#### toString 메서드
◽ 객체를 문자열로 변환      

#### equals 메서드
◽ 두 객체가 같은지를 비교   
> 주소값 비교   
> String 클래스에서 equals를 재정의하여 내용 비교로 바꿔놓음 -> 문자열 내용 비교 가능   

#### hashCode
◽ 시스템에서 객체를 구별하기 위해 사용되는 정수값   
◽ 객체의 동일성을 확인하기 위해 사용    

<br><br>

### final
◽ 해당 선언이 최종 상태, 결코 수정 X    
◽ final 클래스 : 상속 금지    
◽ final 메소드 : overriding 금지  
◽ final 변수 : 더 이상 값을 바꿀 수 없음 (상수화)   
> 관례적 네이밍 : 전부 대문자 (ex. MY_COMPUTER)


