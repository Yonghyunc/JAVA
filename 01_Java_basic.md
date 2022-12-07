# TIL

# JAVA 기본
### 프로그램  
◽ 컴퓨터에서 실행될 때 특정 작업을 수행하는 일련의 명령어들의 모음(집합)    

### 운영체제(OS)  
◽ 시스템 하드웨어를 관리할 뿐 아니라 응용 소프트웨어를 실행하기 위하여 하드웨어 추상화 플랫폼과 공통 시스템 서비스를 제공하는 시스템 소프트웨어     
➕ 사용자와 상호작용   

◽ 리눅스, 윈도우 등     

<br>

### 컴퓨터의 자료 표현
◽ 비트
- 0 / 1
- 컴퓨터가 값을 저장할 수 있는 최소 단위   

◽ 바이트
- 1바이트 == 8비트
- 컴퓨터가 정보를 처리하기 위한 최소 단위

◽ 2진수
- 2의 보수법

<br>

### 자바 가상 머신 (JVM, Java Virtual Machine)  
◽ 자바 바이트코드를 실행할 수 있는 주체   
◽ 자바 바이트코드는 플랫폼(운영체제)에 독립적이며, 모든 JVM은 자바 가상 머신 규격에 정의된 대로 자바 바이트코드를 실행    
> 작업지침서 -> 기계어    

JAVA 원시프로그램(HelloProgram.java) ➡ 컴파일 ➡ 자바 바이트코드(HelloProgram.class) ➡ JVM 

> JRE : 자바 실행 환경 (Java Runtime Environment) 
> JDK : Java Development Kit

<br>

### Hello JAVA
◽ import java.lang 은 자동으로 있다고 생각    

``` java
// Hello.java

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello JAVA");
    }
}
```
![image](https://user-images.githubusercontent.com/93974908/205574552-f34ab957-6c6a-4ca9-9fa3-db7dafae96b5.png)

```
C:\Temp>javac Hello.java
```
컴파일 : javac    
-> Hello.class

![image](https://user-images.githubusercontent.com/93974908/205574767-a4e5083f-fb53-4a2c-9227-ec2e4c1e1758.png)

![image](https://user-images.githubusercontent.com/93974908/205574856-4edfb420-a1f9-4050-9ab1-7f8ce9772103.png)

IDE : 통합 개발 환경    
-> eclipse

<br><br>

패키지 = 폴더 구조

ctrl + space : 자동 완성

![image](https://user-images.githubusercontent.com/93974908/205579137-0a6cf2b9-d687-4154-9512-915b454113cd.png)

### main method
◽ 실행 명령인 java를 실행 시 가장 먼저 호출 되는 부분   
◽ Application에서 main() 메서드가 없다면 절대로 실행 X    
◽ Application의 시작 ➡ 특정 클래스의 main() 실행   
```
public static void main(String[] args) {} 
```

### 주석
◽ //    
◽ /* */   
◽ /** */    

### 출력문
◽ print : 한 줄 출력    
◽ println   
◽ printf
- %d : 정수
- %f : 실수
- %c : 문자
- %s : 문자열

![image](https://user-images.githubusercontent.com/93974908/205582868-42d5d8a4-4006-41fe-a371-2af37e966557.png)

![image](https://user-images.githubusercontent.com/93974908/205582938-b3df0da5-145f-4b30-bd7e-cb762028122e.png)

<br><br>

# 변수와 자료형

### 변수(Variable)
◽ 데이터를 저장할 메모리의 위치   
◽ 메모리 상에 데이터를 보관할 수 있는 공간 확보   
◽ 적절한 메모리 공간을 확보하기 위해 변수 타입 등장   
◽ '='을 통해 CPU에 연산작업 의뢰 (할당/대입)


#### 작명규칙
◽ 대소문자 구분  
◽ 공백 X    
◽ 숫자로 시작 X    
◽ '$', '_' 사용 가능 (그외 특수문자 X)    
◽ 예약어 사용 X   
◽ 합성어의 경우 주로 camelCase 활용   
◽ 한글 O (BUT 권장 X)   
> 의미없는 변수명 지양  

### 자료형 
기본 자료형 ➕ 참조 자료형 

◽ 기본 자료형(8) : 미리 정해진 크기의 Memory Size 표현, 변수 자체에 값 저장     

![image](https://user-images.githubusercontent.com/93974908/205589627-f0b6e0f6-42b4-4282-bbc4-09309aff3b83.png)

> String 도 참조 자료형

◽ 선언
- 자료형 변수명;
  - int age;
  - String name;

◽ 저장(할당)
- 변수명 = 저장할 값;
  - age = 30;
  - name = "철수";

> 참조형은 주소값이 저장  
> 해당 주소를 따라가면 저장한 값이 존재 

◽ 초기화
- 자료형 변수명 = 저장할 값;
  - int age = 30;

![image](https://user-images.githubusercontent.com/93974908/205592668-259ad608-f53c-4594-97f4-154e0e655513.png)

### 형 변환
◽ 자료형의 크기 비교    
byte < short < int < long < float < double    
char < int < long < float < double    

> 실수형 : 부동소수점 (부정확한 대신 엄청난 길이 저장 가능)

◽ 데이터 형 변환    
묵시적
- 범위가 넓은 데이터 형에 좁은 데이터 형 대입
  - byte b = (byte) 100;
  - int i = b;

명시적  
- 범위가 좁은 데이터 형에 넓은 데이터 형 대입
- 형 변환 연산자 사용 : (타입)값;
  - int i = 100;
  - byte b = (byte) i;

> 자료형 == 물건 보관소   
> 데이터 == 물품

![image](https://user-images.githubusercontent.com/93974908/205594550-252921c5-933c-43c7-b134-1e6ec296f185.png)

![image](https://user-images.githubusercontent.com/93974908/205594633-fbf4b944-07a4-4445-bd72-3d299f894bbf.png)


<br><br>

# 연산자

![image](https://user-images.githubusercontent.com/93974908/205594917-9be60091-1814-4fa0-a83e-bd8fbc359bbe.png)

> 괄호가 최우선 !! 

> 동급 연산자는 작성순으로 실행 

### 단항 연산자
◽ 증감 연산자 ++, --    
- 피연산자의 값을 1 증가, 감소    
- 전위형 ++i : 하고 연산
- 후위형 i-- : 연산 후 함

◽ 부호 연산자 +, -
- 숫자가 양수임을 표시 + (의미없음)
- 피연산자의 부호를 반대로 변경한 결과 반환 -

◽ 논리 부정 연산자 !
- 논리 값 반전 (True/False)

◽ 비트 부정 연산자 ~
- 비트 값 반전

◽ 형 변환 연산자 (type)

![image](https://user-images.githubusercontent.com/93974908/205602850-d5a80fb1-e584-4b7e-a409-904c6b27c492.png)

### 산술 연산자
◽ 곱하기 *    
◽ 나누기 /    
◽ 나머지 %    
◽ 더하기 +    
◽ 빼기 -    

정수와 정수의 연산 ➡ 정수    
정수와 실수의 연산 ➡ 실수    

![image](https://user-images.githubusercontent.com/93974908/205603344-d3d78c51-7fd5-4f89-aa5c-76a12e5b54ba.png)


### 비교 연산자
◽ 대소 비교 연산 (>, >=, <, <=)   
> 자바에서는 50 <= a <= 70 불가능 (연결해서 쓰는 것)

◽ 동등 비교 연산 (==, !=)   
> String은 참조형 ➡ == 사용 불가 / equals() 사용

◽ 객체 타입 비교 연산 (instanceof)    

![image](https://user-images.githubusercontent.com/93974908/205718272-a201682b-c69b-4ef0-af83-9c85120f8188.png)


### 논리 연산자
◽ && : 논리 곱 (AND), 피연산자 모두가 true일 경우에만 true    
◽ || : 논리 합 (OR), 피연산자 중 하나라도 true일 경우 true    
◽ ! : 논리 부정 (NOT), 피연산자의 결과를 반대로 바꿈    

> 효율적인 연산 가능    
> 
> A(조건식) && B(조건식)    
> A가 거짓이면 뒤의 조건식은 확인 안 해도 됨    
>
> A || B    
> A가 참이면 뒤의 조건식 확인 X   


![image](https://user-images.githubusercontent.com/93974908/205604018-67a07520-c066-4720-8f68-b03cd212faef.png)

### 삼항 연산자
◽ 조건식 ? 식1 : 식2    
◽ 조건식이 참일 경우 식1 수행   
◽ 조건식이 거짓일 경우 식2 수행   

![image](https://user-images.githubusercontent.com/93974908/205604636-b497a386-e301-4a12-b0ec-52703bb408c8.png)

### 복합 대입 연산자
◽ +=, -=, *=, /=    
- i += 1 ➡ i = i + 1

<br><br>

# 제어문
## 조건문
### if문
◽ 조건식의 결과에 따라 블록 실행 여부 결정    
◽ 조건식 : true / false 값을 산출할 수 있는 연산식 또는 boolean 타입 변수   
```
if (조건식) {
  실행할 문장 1;
  실행할 문장 2;
  ...
}
```
◽ 수행할 문장이 한 문장이라면 중괄호 생략 가능   

![image](https://user-images.githubusercontent.com/93974908/205607143-eea04db0-c416-410c-93f1-860716982497.png)

### if-else문
◽ 조건식의 결과에 따라 실행할 블록 결정
```
if (조건식) {
  실행할 문장 1;
  ...
} else {
  실행할 문장 a;
  ...
}
```
![image](https://user-images.githubusercontent.com/93974908/205607230-ad1b3e54-a397-4cdc-aef5-398bb04c5616.png)

``` java
int age = 17;

int num;

if (age < 20) {
  num = 10;
}

System.out.println(num);
```
> Error!!     
> 조건문에 안 걸릴 경우, num을 쓸 수가 없어서

``` java
int age = 17;

int num;

if (age < 20) {
  num = 10;
} else {
  num = 20;
}

System.out.println(num);
```
> 둘 중 하나는 무조건 수행하므로 에러 X


### 중첩 if문
◽ 중첩 횟수 제한 X    
``` 
if(조건식A) {
  if(조건식B) {
    조건식 A, B 모두 참일 경우 수행할 문장;
  } else {
    조건식 A는 참, B는 거짓일 경우 수행할 문장;
  }
} else {
  조건식 A가 거짓일 경우 수행할 문장;
}
```
![image](https://user-images.githubusercontent.com/93974908/205609933-d62e8a25-6f74-491e-90f1-4e009b4ee1cb.png)

![image](https://user-images.githubusercontent.com/93974908/205610006-b04961f1-84b8-48ec-82c0-b7442b6b32b2.png)

![image](https://user-images.githubusercontent.com/93974908/205610081-d3ef5881-bd9f-4b22-bbc4-158c5616103d.png)

> 조건 안에 못 들어왔을 때 다음 조건 else if로 사용 가능하다 ~


### if - else if - else 문
◽ 조건식의 결과에 따라 실행할 블록 결정 
``` 
if(조건식) {
  실행할 문장1;
  ...
} else if(조건식) {
  실행할 문장 a;
  ...
} else {
  실행할 문장 A;
  ...
}
```

◽ 조건식이 참일 경우 해당 블록의 문장들을 실행하고, 거짓일 경우 다음 조건식 확인    



### switch문
◽ 인자로 선택변수를 받아 변수의 값에 따라서 실행문 결정   
```
switch(수식) {
  case 값1:
    실행문 A;
    break;
  case 값2:
    실행문 B;
    break;
  default:
    실행문 C;
}
```
#### ❗ 주의사항
1. 수식에 올 수 있는 것
  - 1.4버전 : byte, short, char, int
  - 1.5버전 : ➕ enum 클래스 타입
  - 1.7버전 : ➕ String 클래스 타입
2. break문 없이도 사용 O
3. default == else의 역할과 동일


![image](https://user-images.githubusercontent.com/93974908/205614578-e7e85f3a-e8ad-479a-8cec-d295880f947c.png)

## 반복문
### for문
``` 
for(초기화식; 조건식; 증감식) {
  반복 수행할 문장;
}
```

◽ 초기화식 : 반복문 시작 시 한 번 실행    
◽ 조건식 : false이면 반복문 종료    
  > 수행을 단 한 번도 안 할 수도 있음
◽ 증감식 : 반복문의 반복이 끝나면 실행    
◽ 초기화식, 증감식은 (,)를 이용하여 둘 이상 작성 O    
◽ 필요하지 않은 부분은 생략 O 
  > for(;;) ➡ 무한루프
◽ 반복횟수를 알고 있을 때 유용    
◽ 다른 for문 내포 O


![image](https://user-images.githubusercontent.com/93974908/205616292-5be264c4-afa8-46f4-81fa-08be890e94c5.png)

![image](https://user-images.githubusercontent.com/93974908/205617090-bf28a798-c045-420f-bc9a-c984249aeb9a.png)


### while문
``` 
while(조건식) {
  반복 수행할 문장;
}
```
◽ 조건식이 true일 경우 계속 반복 (조건식이 거짓이 될 때까지 문장 반복 수행)   
◽ 조건식 생략 불가      
◽ 중첩 사용 가능    

![image](https://user-images.githubusercontent.com/93974908/205619829-02d4e1cc-f7e7-4494-a45c-523b42d55030.png)

### do while 문
```
do {
  반복 수행할 문장;
} while (조건식);
```
◽ 블록 내용을 먼저 수행 후 조건식 판단 (최소 한 번은 무조건 수행)   
◽ 조건식이 true일 경우 계속 반복 (조건식이 거짓이 될 때까지 문장 반복 수행)   
◽ 조건식 생략 불가   


### break
◽ 반복문의 블록에서 빠져나오기 위해 사용    
◽ 반복문에 이름을 붙여 한번에 빠져 나올 수 있음   

### continue
◽ 반복문의 특정지점에서 제어를 반복문의 처음으로 보냄   
◽ 반복문에 이름을 붙여 제어 O   

<br><br>

# 배열
◽ **같은 종류**의 데이터를 저장하기 위한 자료구조   
◽ 크기 고정 (한번 생성된 배열은 크기를 바꿀 수 없음)    
◽ 객체로 취급   
◽ 배열의 요소를 참조하려면 배열이름과 색인(index)라고 하는 int 유형의 정수 값을 조합하여 사용   
> 배열 == 참조형 

### 배열 선언
1️⃣ 타입[] 변수 : int[] arr ✔    
2️⃣ 타입 변수[] : int arr[]   

![image](https://user-images.githubusercontent.com/93974908/205714877-d53ff479-87ed-4047-ad89-189abe03f5f3.png)


### 배열 생성 / 초기화
◽ 자료형[] 배열이름 = {값1, 값2, 값3, 값4}; ➡ 선언과 동시에 초기화   
◽ 배열이름 = new 자료형[] {값1, 값2, 값3, 값4}; ➡ 배열 생성 및 값 초기화   
◽ 배열이름 = new 자료형[길이]; ➡ 배열 생성 (자료형의 초기값으로 초기화)    
![image](https://user-images.githubusercontent.com/93974908/205719991-18d2b806-da24-4d3c-95f2-da442d5c8beb.png)

### 배열 사용
◽ index 번호를 가지고 각 요소에 접근    
◽ index 번호는 **0부터 시작**   
◽ 배열이름.length를 통해 배열의 길이 조회 가능    
◽ 배열의 길이 임의 변경 X   ➡ 더 큰 배열 생성 후 내용 옮김    

### 메모리 생성과정
◽ 배열 선언   
◽ 배열 생성   
◽ 참조 값 할당    
◽ 요소에 값 할당    

![image](https://user-images.githubusercontent.com/93974908/205722420-34706275-6291-496d-b835-070f644e6042.png)


### for-each
◽ 가독성이 개선된 반복문    
◽ 배열 및 Collections에서 사용    
◽ index 대신 직접 요소에 접근하는 변수 제공     

![image](https://user-images.githubusercontent.com/93974908/205896050-6863d088-9055-440a-8f63-a921fde25fde.png)


### 배열 복사
◽ 배열 길이 변경 X ➡ 더 많은 저장공간 사용 위해서는 더 큰 배열을 생성하여 이전 배열의 값 복사    

#### System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)    
◽ src : 원본배열    
◽ srcPos : 원본배열 복사 시작 위치    
◽ dest : 복사할 배열    
◽ destPos : 복사 받을 시작 위치     
◽ length : 복사할 크기    

![image](https://user-images.githubusercontent.com/93974908/205897280-24f45c50-0dae-4d59-8218-a1671e0dbafb.png)


<br><br>

## 다차원 배열
◽ 2차원 이상의 배열     
◽ 배열 요소로 또 다른 배열을 가지는 배열    

◽ 2차원 배열 : 배열 요소로 1차원 배열의 참조를 가지는 배열    
◽ 3차원 배열 : 배열 요소로 2차원 배열의 참조를 가지는 배열  

### 2차원 배열 선언
◽ int[][] iArr ✔    
◽ int iArr[][]    
◽ int[] iArr[]    

### 2차원 배열 생성
◽ 배열의 이름 = new 배열유형[1차원 배열개수][1차원 배열크기];     
◽ 배열의 이름 = new 배열유형[1차원 배열개수][];     


