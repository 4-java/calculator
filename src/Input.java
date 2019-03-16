import java.util.Scanner;

public class Input {
	static int getFirstValue(Scanner scanner) {
		System.out.println("첫 번째 입력값 : ");
		int value = scanner.nextInt();
		return value;
	}
	static int getSecondValue(Scanner scanner) {
		System.out.println("두 번째 입력값 : ");
		int value = scanner.nextInt();
		return value;
	}
	static String getSymbol(Scanner scanner) {
		System.out.println("사칙연산 기호 : ");
		String symbol = scanner.next();
		return symbol;
	}
}
