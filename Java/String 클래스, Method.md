## 변수의 메모리 사용
#### 기본타입 변수
실제 값을 변수 안에 저장 - 타입별로 **스택**에 메모리 정적 할당

#### 참조 타입 변수
주소를 통해 객체를 참조(String 등) - **힙 메모리**에 공간 할당 후 **주소**를 스택에 저장
</br>

# String 클래스
메모리에서 사용하는 데이터 크기가 가변적이다. 실제 데이터를 힙 메모리에 저장하고, String type 변수에는 힙 메모리의 주소값을 갖고 있다.
산술연산 기호 +를 사용해 문자열을 합칠 수 있다.
</br>

## CharAt(*index*)
문자열에서 특정 문자를 가져오는 메소드.
index가 0일 때 첫번째 문자를 가리킴 
index가 문자열전체길이-1 일 때 마지막 문자를 가리킴

```java
public class StringBasic3 {

	public static void main(String[] args) {
		String message = "Welcom to Java";
		int length = message.length();

		char firstChar = message.charAt(0);
		char thirdChar = message.charAt(2);
		char lastChar = message.charAt(length - 1);

		System.out.println(message + "의 첫번째 글자는 " + firstChar);
		System.out.println(message + "의 세번째 글자는 " + thirdChar);
		System.out.println(message + "의 마지막 글자는 " + lastChar);

		for (int i = 0; i < message.length(); i++) {
			System.out.println(message + "의 " + (i + 1) + "번째 글자는 " + message.charAt(i));
		}
	}
}
```
결과
```
Welcom to Java의 첫번째 글자는 W
Welcom to Java의 세번째 글자는 l
Welcom to Java의 마지막 글자는 a
Welcom to Java의 1번째 글자는 W
Welcom to Java의 2번째 글자는 e
Welcom to Java의 3번째 글자는 l
Welcom to Java의 4번째 글자는 c
Welcom to Java의 5번째 글자는 o
Welcom to Java의 6번째 글자는 m
Welcom to Java의 7번째 글자는  
Welcom to Java의 8번째 글자는 t
Welcom to Java의 9번째 글자는 o
Welcom to Java의 10번째 글자는  
Welcom to Java의 11번째 글자는 J
Welcom to Java의 12번째 글자는 a
Welcom to Java의 13번째 글자는 v
Welcom to Java의 14번째 글자는 a
```
</br>

## concat()
```
concatenate 연쇄시키다, 잇다, 연결하다
```
문자열을 합치는 메소드
</br>

```java
public class StringBasic4 {

	public static void main(String[] args) {
		String s1 = "Welcome to ";
		String s2 = "Java";
		String s3;

		s3 = s1.concat(s2);
		System.out.println("s3 = " + s3);
		System.out.println("s1.length = " + s1.length());
		System.out.println("s2.length = " + s2.length());
		System.out.println("s3.length = " + s3.length());

		s3 = s2.concat(s1);
		System.out.println(("s3 = " + s3));

		s3 = s1 + s2;
		System.out.println(("s3 = " + s3));

		s3 = s2 + s1;
		System.out.println(("s3 = " + s3));
	}
}
```
결과
```
Welcom to Java의 첫번째 글자는 W
Welcom to Java의 세번째 글자는 l
Welcom to Java의 마지막 글자는 a
Welcom to Java의 1번째 글자는 W
Welcom to Java의 2번째 글자는 e
Welcom to Java의 3번째 글자는 l
Welcom to Java의 4번째 글자는 c
Welcom to Java의 5번째 글자는 o
Welcom to Java의 6번째 글자는 m
Welcom to Java의 7번째 글자는  
Welcom to Java의 8번째 글자는 t
Welcom to Java의 9번째 글자는 o
Welcom to Java의 10번째 글자는  
Welcom to Java의 11번째 글자는 J
Welcom to Java의 12번째 글자는 a
Welcom to Java의 13번째 글자는 v
Welcom to Java의 14번째 글자는 a
```
</br>

## next(), nextLine()
String으로 문자열을 반환하는 Scanner 클래스의 메소드이다. 
**next()는 토큰을 문자열로 리턴**하며 **nextLine()은 '\n'을 포함하는 한 라인을 읽고 '\n'을 버린 나머지만 리턴**한다. 
쉽게 말해 next()는 space로 구분된 문자열을 읽어오며 nextLine()은 한 줄 전체를 읽어온다.

```java
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("space로 구분된 3개의 단어를 입력하세요.");
		String s1 = input.next();
		String s2 = input.next();
		String s3 = input.next();

		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
	}
```
결과
```
space로 구분된 3개의 단어를 입력하세요.
apple banana kiwi
s1 = apple
s2 = banana
s3 = kiwi
```

#### *\+) Escape Character*
\***line feed(LF, \n)** - 1줄 띄기, New Line

\***carriage return(CR, \r)** - 커서를 가장 앞으로 옮기는 동작. 디스플레이에서는 거의 의미가 없는 것이 맞으나, window에서는 Enter를 누르면 cr, lf가 모두 입력되기 때문에 예를 들어 리눅스에서의 줄바꿈(only LF)은 Enter로 인식하지 않는다.
</br>

## toUpperCase(), toLowerCase()
**toUpperCase()** - 문자열의 모든 문자를 대문자로 변환한다.
**toLowerCase()** - 문자열의 모든 문자를 소문자로 변환한다.

```java
	public static void main(String[] args) {	
		String s4 = input.nextLine(); // 1line 전체 문자를 읽어 올 때 사용(s4에는 enter key 문자는 제외됨)
		System.out.println("s4 = " + s4);

		System.out.println("s4 대문자 = " + s4.toUpperCase());
		System.out.println("s4 소문자 = " + s4.toLowerCase());
	}
```
입력
```
i like banana
```
결과
```
s4 = i like banana
s4 대문자 = I LIKE BANANA
s4 소문자 = i like banana
```
</br>

## equals 메소드
```
String1.equals(String2)
```

문자열의 내용을 비교한다. equals의 return값이 true이면 1과 2의 문자열 내용이 동일하며, false이면 다르다.
</br>

## s1.compareTo(s2)

s1과 s2의 문자열을 알파벳 순서로 첫번째 문자부터 비교한다.
+ s1의 문자열 > s2의 문자열 => 양수 값 return
+ s1의 문자열 < s2의 문자열 => 음수 값 return
+ s1의 문자열 == s2의 문자열 => 0 return

```java
public class StringBasic7 {

	public static void main(String[] args) {
		String s1 = "apple";
		String s2 = "banana";
		String s3 = "pineapple";
		String s4 = "banana";
		
		System.out.println(s1+"과 "+s2+"의 크기 비교 결과: "+s1.compareTo(s2));
		System.out.println(s1+"과 "+s3+"의 크기 비교 결과: "+s1.compareTo(s3));
		System.out.println(s2+"과 "+s1+"의 크기 비교 결과: "+s2.compareTo(s1));
		System.out.println(s2+"과 "+s4+"의 크기 비교 결과: "+s2.compareTo(s4));

	}
}
```
결과
```
apple과 banana의 크기 비교 결과: -1
apple과 pineapple의 크기 비교 결과: -15
banana과 apple의 크기 비교 결과: 1
banana과 banana의 크기 비교 결과: 0
```
</br>

## substring(startIndex, endIndex)
전체 문자열에서 일부 문자열을 가져온다.
1. startIndex = 0부터 시작, 일부 문자열 가져오기에 포함
2. endIndex는 일부 문자열 가져오기에 불포함
	(endIndex-1의 문자까지 가져옴)
3. startIndex 값은 있고 endIndex값이 없는 경우 startIndex부터 문자열 끝까지의 데이터를 가져옴
	예) message.substring(0)

```java
public class StringBasic8 {

	public static void main(String[] args) {
		String message = "Welcome to Java";
		
		System.out.println(message.substring(0, 5));
		System.out.println(message.substring(0, 7));
		System.out.println(message.substring(0, 11));
		
		System.out.println(message.substring(2, 5));
		System.out.println(message.substring(2, 7));
		System.out.println(message.substring(2, 11));
		
		System.out.println(message.substring(0));
		System.out.println(message.substring(2));
	}
}
```
결과
```
Welco
Welcome
Welcome to 
lco
lcome
lcome to 
Welcome to Java
lcome to Java
```
</br>

## indexOf, lastIndexOf
문자열에서 찾고자 하는 문자 또는 문자열의 index를 가져오는 메소드이다. 대소문자를 구분한다.
 1. indexOf(char 또는 String, startIndex)
	- startIndex부터 시작하여 찾고자하는 문자나 문자열이 있으면 시작 index를 가져옴
	- 단, startIndex가 주어지지 않으면, startIndex는 0부터 시작한다고 가정함
	- 찾고자 하는 문자나 문자열이 없으면 -1을 가져옴
</br>

2. lastIndexOf
	\- 문자열의 끝 index부터 시작하여 찾음


```java
public class StringBasic9 {

	public static void main(String[] args) {
		System.out.println("Welcome to Java".indexOf('W'));
		System.out.println("Welcome to Java".indexOf('o'));
		System.out.println("Welcome to Java".indexOf('o', 5));
		System.out.println("Welcome to Java".indexOf("come"));
		System.out.println("Welcome to Java".indexOf("comet"));
		System.out.println("Welcome to Java".indexOf("Java", 5));
		System.out.println("Welcome to Java".indexOf("java", 5));
		System.out.println("Welcome to Java".toUpperCase().indexOf("JAVA", 5));

		System.out.println();
		
		System.out.println("Welcome to Java".lastIndexOf('W'));
		System.out.println("Welcome to Java".lastIndexOf('o'));
		System.out.println("Welcome to Java".lastIndexOf('o', 5));
		System.out.println("Welcome to Java".lastIndexOf("come"));
		System.out.println("Welcome to Java".lastIndexOf("comet"));
		System.out.println("Welcome to Java".lastIndexOf("Java", 5));
		System.out.println("Welcome to Java".lastIndexOf("java", 5));
		System.out.println("Welcome to Java".toUpperCase().lastIndexOf("JAVA", 5));
		
	}
}
```
결과
```
0
4
9
3
-1
11
-1
11

0
9
4
3
-1
-1
-1
-1
```
</br>

## 함수(function) - Method
프로그램에서 여러번 반복 사용되는 특정 코드 덩어리를 별도의 method로 정의하고 선언된 메소드 이름을 통해 사용한다. 

<a href='https://ifh.cc/v-xS16Lq' target='_blank'><img src='https://ifh.cc/g/xS16Lq.png' border='0'></a>

<a href='https://ifh.cc/v-fFA9JV' target='_blank'><img src='https://ifh.cc/g/fFA9JV.png' border='0'></a>


**method 사용 효과**	
	- 전체 소스코드 양을 대폭 줄이고, 프로그램 내 중복 코드 덩어리를 제거할 수 있다.
	- 중복되는 코드 덩어리를 수정할 경우, 메소드 내부에서만 수정하면 되어서 전체 코딩 속도 향상 가능
	- 한번 코딩해놓으면, 다른 사람들에게 공유 가능
	- method를 사용하는 사람은 method의 실제 구현 내용을 몰라도 사용 가능
	* - 개발 생산성과 코드 재활용성 증가*
</br>

```java
// sum method 구현
public class MethodBasic2 {

	public static void main(String[] args) {

		// 1, 10 => actual parameter list (argusments)
		// 1. 등록된 method list에서 sum이라는 이름을 가진 method signature를 이용해 찾음
		// 2. 찾은 sum method를 호출, formal parameter인 startValue 변수의 메모리방에 1의 값을 넣고 endValue 변수의 메모리 방에 10의 값을 넣음
		// 3. result라는 변수에 대하여 메모리 방을 잡고 method body의 명령어 실행
		// 4. 최종 결과값을 갖고 있는 result 변수의 값을 sum method를 호출한 곳으로 넘겨줌
		// - 최종 결과값을 넘겨주기 전에 method의 내부 변수인 starValue, endValue, result 변수의 메모리 방은 삭제
		System.out.println("1과 10사이의 합 : " + sum(1, 10));
		System.out.println("27과 37사이의 합 : " + sum(27, 37));
		System.out.println("35과 49사이의 합 : " + sum(35, 49));
	}

	// 이름이 sum인 method 선언
	// header
	// method signature: sum(int startValue, int endValue)
	// formal parameter list: int startValue, int endValue
	public static int sum(int startValue, int endValue) {
		int result = 0;

		for (int i = startValue; i <= endValue; i++) {
			result += i;
		}
		return result; // return type: int 
	} // body
}
```

결과
```
1과 10사이의 합 : 45
27과 37사이의 합 : 315
35과 49사이의 합 : 581
```
</br>

### *void*
return값이 없는 경우 void를 사용한다. 주로 정보 출력 등에 사용된다.
</br>



