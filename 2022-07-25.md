## 프로그래밍이란
사람이 컴퓨터에게 원하는 동작 또는 결과를 얻기 위한 명령어 집합
</br>

#### 컴파일러(compiler)  
고급 언어를 컴퓨터가 인식 가능한 기계어로 변환, 통역해주는 SW
OS마다 고급 프로그래밍 언어 제작 회사에서 제공함. 

* 소스파일 확장자와 컴파일 된 파일의 확장자
java - (.java -> .class) 
</br>

#### 응용프로그램 동작 방법
컴퓨터는 CPU, 메인메모리, 하드디스크, 모니터,  키보드로 구성
사람이 만든 프로그래밍 명령어를 컴파일러로 기계어로 만들면 응용프로그램.exe(execute)을 만듦
응용프로그램을 실행하면 메모리에 응용프로그램이 올라가고, CPU가 메모리에 올라간 프로그램 기계어를 한 줄 씩 실행

예를 들어, 3GHz : 30억번/second  CPU가 1초에 30억 줄 실행 가능
</br>

#### 운영체제
Windows, MacOS, Linuxx
</br>

## 자바(java)
1995년, 썬마이크로시스템즈(Sun Microsystems)에서 최초 발표한 언어
1991년, 가전 제품에서 사용할 목적인 오크(Oak) 언어에서부터 시작해 인터넷 프로그래밍 언어로 발전하면서 자바라는 이름으로 변경
2010년, 오라클에서 썬을 인수하여 Java 개발,관리,배포 주관

특징: 높은 이식성, 객체지향언어, 플랫폼 독립성

 ### 플랫폼 독립성(platform independency)
 
WORA(Write Once, Run Anywhere) : 한 번 작성한 코드로 모든 플랫폼에서 실행
실행파일 역할을 하는 class로 한번만 변환하면 여러 플랫폼(OS)에서 실행 가능 (JVM) 
네트워크에 연결된 어느 클라이언트에서나 실행
웹 브라우저, 분산 환경 지원

+ **바이트 코드(byte code)**
자바 소스를 컴파일 한 목적 코드로 CPU에 종속적이지 않은 중립적인 코드

+ **JVM(Java virtual machine)**
자바 바이트 코드를 실행하는 자바 가상 기계(소프트웨어)
자바 프로그램을 운영체제가 실행하지 않고 class 파일을 JVM 위에서 실행 (속도가 상대적으로 느린 이유)
*cf. JRE(Java Runtime Environment: 자바 런타임 환경) : JVM + 자바 표준 클래스 라이브러리*

### 객체 지향 프로그래밍(OOP: Object Oriented Programming)
부품 객체를 먼저 만들고, 이를 조합하여 객체들의 상호작용을 통해 전체 프로그램을 완성하는 기법
(객체지향 3요소: 캡슐화, 상속, 다형성)

### 함수적 스타일 코딩 지원
**람다식(Lambda Expressions)**
컬렉션 요소를 필터링, 매핑, 그룹핑, 집계 처리시 주로 사용해 코드를 간결하게 작성할 수 있다.

메모리 자동 관리(가비지 콜렉터), 멀티 쓰레드, 동적 로딩, 막강한 오픈 소스 라이브러리 등

자바, 이클립스 설치
<java -version>
java version "1.8.0_341"
Java(TM) SE Runtime Environment (build 1.8.0_341-b10)

eclipse version 
2021-06 ee
preference - java - installed JRE -> JDK폴더, Compiler java1.8로 변경
enc 검색해 encoding utf-8로 변경

JRE 라이브러리
.jar : java archive (zip과 같음)
</br>

```java
public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello, Welcome to Java.");
	}
}
```
</br>

## 변수와 타입

탄도미사일 계산 프로그램

1. 입력 데이터: 탄도 미사일 무게, 탄도 미사일 발사 각도, 가속도
2. 탄도 미사일 도착 지점 계산
3. 도착 지점 계산 결과 화면 display, file 저장, database에 저장

홈페이지 고객 등록
- 고객 정보 화면에 입력
- database에 저장
</br>

```java
// comment: program 설명 (CPU가 인식하지 않고, 다른 개발자에게 정보 전달 목적)
// 학생 a, b, c 3명의 국어 성적 전체 합계와 평균을 계산하는 프로그램을 작성하시오.
public class MyClass {
    public static void main(String args[]) {
      int a=70; 
      //a라는 이름으로 방을 잡아주고 방안에 값을 70으로 할당해 줘 => 명령어
      int b=85;
      int c=90;
      int sum;
      int average;
      //a, b, c, sum, average => 변수(variable number)
	
      sum = a + b + c;
      average = sum/3;

      System.out.println("Sum of a+b+c = " + sum);
      System.out.println("Average = " + average);
    }
}
```
*세미콜론 잊지 말기*
</br>

## 변수
하나의 값을 저장할 수 있는 메모리 공간

변수 선언
`타입 변수이름;`

타입: 메모리의 크기와 데이터 타입(정수, 실수, 문자열 등) 지정


