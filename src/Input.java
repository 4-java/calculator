import java.util.Scanner;

public class Input {
	static int getFirstValue(Scanner scanner) {
		System.out.println("ù ��° �Է°� : ");
		int value = scanner.nextInt();
		return value;
	}
	static int getSecondValue(Scanner scanner) {
		System.out.println("�� ��° �Է°� : ");
		int value = scanner.nextInt();
		return value;
	}
	static String getSymbol(Scanner scanner) {
		System.out.println("��Ģ���� ��ȣ : ");
		String symbol = scanner.next();
		return symbol;
	}
}
