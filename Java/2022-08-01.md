# 반복문
while, do~while, for: 특정 명령어 집합을 반복적으로 수행하고자 할 때 사용한다.

## while문
```
while (boolean: 조건식) {a;} 
```

boolean이 true인 동안에 A 명령어를 반복 수행함

```java
public class WhileBasic {

	public static void main(String[] args) {
		// 반복문 초기화
		int count = 0;
		// 조건식: count < 10
		while (count < 10) {
			System.out.println("Java씨, 존경합니다.");
			count++;	// while문의 조건식 결과를 false로 만들어줄 수 있음(무한루프 가능)
		}
		System.out.println();
		
		count = 10;
		while (count >= 1) {
			System.out.println("Java씨, 존경합니다.");
			count--;
		}
		System.out.println();
		
		
		count = 1;
		while (count <=10) {
			System.out.println("Java씨, 존경합니다.");
			count++;
		}
		System.out.println();
				
		count = 1;
		int endValue = 10;
		while (count <= endValue) {
			System.out.println("Java씨, 존경합니다.");
			count++;
		}		
	}
}
```
</br>

while + if문
```java
public class WhileBasic3 {

	public static void main(String[] args) {
		int sum = 0;
		int number = 1;

		// 1 ~ 10사이의 짝수의 합 (2+4+6+8+10)
		while (number <= 10) {
			if ((number % 2) == 0) {
				sum += number;
			}
			number ++;
		}
		System.out.println("1~10사이의 짝수의 합: " + sum);
	}
}
```
</br>

랜덤 두 수의 합계를 맞추는 프로그램 
```java
// 0~9 사이의 2개의 random number 숫자를 생성하여 합계(덧셈 결과)를 만든 후
// 사용자로부터 덧셈 결과를 입력받아 내부적으로 생성한 덧셈결과와 일치할 때까지 while문 수행  
public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		Scanner input = new Scanner(System.in);
		System.out.println(number1 + "과 " + number2 + "의 합계는?");

		int answer = input.nextInt();

		// while 내부 수행 조건: 정답이 틀릴 경우에만 while문이 반복 수행
		while ((number1 + number2) != answer) {
			System.out.println("정답이 아닙니다. 다시 시도해보세요.");
			System.out.println(number1 + "과 " + number2 + "의 합계는?");
			answer = input.nextInt();
		}
		
		System.out.println("정답입니다. 잘 맞추셨습니다.");
	}
}
```
</br>

## do ~ while문
조건과 무관하게 한 번은 내부 명령어를 실행 후에 조건에 따라 while문 수행

```java
public class DoWhileBasic {

	public static void main(String[] args) {
		int count = 0;

		do {
			System.out.println("Java씨, 존경합니다.");
			count++;
		} while (count < 10);
		
		count = 0;
		do {
			System.out.println("Java씨, 매우매우 존경합니다.");
		} while (count > 10);

	}
}
```

결과
```
Java씨, 존경합니다.
Java씨, 존경합니다.
Java씨, 존경합니다.
Java씨, 존경합니다.
Java씨, 존경합니다.
Java씨, 존경합니다.
Java씨, 존경합니다.
Java씨, 존경합니다.
Java씨, 존경합니다.
Java씨, 존경합니다.
Java씨, 매우매우 존경합니다.
```
</br>

```java
public class DoWhileBasic3 {

	public static void main(String[] args) {
		char a = 'a';

		do {
			System.out.print(a);
			a = (char) (a + 1);  //(a+1)과 같이 연산하면 int형이 됨
		} while (a <= 'z');
		
		System.out.println();
		
		a='A';
		do {
			System.out.print(a);
			a = (char) (a+1);
		} while (a <= 'Z');
	}
}
```
결과
```
bcdefghijklmnopqrstuvwxyz
ABCDEFGHIJKLMNOPQRSTUVWXYZ
```
</br>

## for문
```
for(초기값; 조건식; 증감연산) { A } 
- 초기값과 마지막 값이 결정되어 있는 경우에 많이 사용
```

초기값부터 시작하여 조건식에 true이면 명령문 수행하고 그 후 증감연산 순서를 반복
```java
public class ForBasic {

	public static void main(String[] args) {
		int sum = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("합계를 구할 시작 숫자와 최종 숫자를 입력하세요.");
		int startNumber = input.nextInt();
		int lastNumber = input.nextInt();

		for (int number = startNumber; number <= lastNumber; number++) {
			sum += number;
		}

		System.out.println(startNumber + " ~ " + lastNumber + "의 합 = " + sum);
	}
}
```
</br>

중첩 for문 대표 구구단!
```java
public class ForBasic2 {

	public static void main(String[] args) {
		System.out.println("구구단은 다음과 같습니다.");

		for (int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단 출력값");
			for (int num = 1; num <= 9; num++) {
				System.out.println(dan + " * " + num + " = " + (dan * num));
			}
			System.out.println();
		}
	}
}
```
</br>

\* 3개 이상의 중첩 for문은 프로그램 실행 속도를 크게 저하시킬 수 있어 실무적으로 가급적 사용하지 않을 것 *(어쩔 수 없이 사용해야 하면 반드시 전체 반복 횟수를 확인하자)*
아래의 경우 10\*10*10= 1000번 실행됨

```java
public class ForBasic3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				for (int k = 1; k <= 10; k++) {
					System.out.println("3개 숫자의 곱 = " + (i * j * k));
				}
			}
		}
	}
}
```
</br>

for문에서 증감단위가 소숫점인 경우도 사용 가능 하다. 
```java
public class ForBasic4 {

	public static void main(String[] args) {
		float fSum = 0.0f;

		for (float i = 0.01f; i <= 1.0f; i += 0.01f) {
			fSum += i;
		}

		System.out.println("fSum = " + fSum);

		double dSum = 0.0;
		for (float i = 0.01f; i <= 1.0f; i += 0.01f) {
			dSum += i;
		}

		System.out.println("dSum = " + dSum);
	}
}

```

결과
```
fSum = 50.499985
dSum = 50.499976608902216
```

*그러나* 실수 연산은 위와 같이 오차가 발생하기 때문에 권장되지 않는다.
사용해야 한다면, 먼저 정수로 변환하여 for문 사용하고 마지막에 실수로 변환한다.
</br>

## Break, Countinue
Break - 반복문 종료. 반복문 중첩 시 break는 가장 가까운 반복문만 종료한다.

```java
public class BreakEx {

	public static void main(String[] args) {

		// 무한 loop
		while (true) {
			int num = (int) (Math.random() * 6) + 1; // 1, 2, 3, 4, 5, 6
			System.out.println("주사위번호 = " + num);
			if (num==6) {
				break;
			}
		}
		System.out.println("주사위 게임 종료");
	}

}
```
결과
```
주사위번호 = 3
주사위번호 = 2
주사위번호 = 6
주사위 게임 종료
```
</br>

Countinue - for문에서는 증감식으로, while에서는 조건식으로 이동한다.
```java
public class CountinueEx {

	public static void main(String[] args) {
		int sum = 0;

		// 1~10사이의 짝수의 합
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {	// 홀수의 경우 for문 처음으로 돌아감
				continue;
			}
			sum += i;
		}
		System.out.println("1~10사이의 짝수의 합 = " + sum);
	}
}
```
```
1~10사이의 짝수의 합 = 30
```

