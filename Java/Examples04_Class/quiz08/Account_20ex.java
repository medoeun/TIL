package q01.quiz04.quiz08;

import java.util.Scanner;

public class Account_20ex {
	private static Account_20[] accountArray = new Account_20[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int acList = 0;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌생성하기
	private static void createAccount() {
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");

		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입급액: ");
		int balance = scanner.nextInt();
		accountArray[acList] = new Account_20(ano, owner, balance);

		System.out.print("결과: ");
		System.out.println("계좌가 생성되었습니다.");

		acList++;

	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("-----------");
		System.out.println("계좌목록");
		System.out.println("-----------");
		for (int i = 0; i < acList; i++) {
			System.out.println(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
	}

	// 예금
	private static void deposit() {
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		System.out.print("계좌번호: ");
		Account_20 ano = findAccount(scanner.next());
		System.out.print("예금액: ");
		int dpmoney = scanner.nextInt();
		ano.setBalance(ano.getBalance() + dpmoney);

		System.out.println("결과: 예금이 성공되었습니다.");

	}

	// 출금
	private static void withdraw() {
		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		System.out.print("계좌번호: ");
		Account_20 ano = findAccount(scanner.next());
		System.out.print("출금액: ");
		int wdmoney = scanner.nextInt();
		ano.setBalance(ano.getBalance() - wdmoney);

		System.out.println("결과: 출금이 성공되었습니다.");

	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account_20 findAccount(String ano) {
		for (int i = 0; i < acList; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;

	}
}
