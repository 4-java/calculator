import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 입력값 : ");
		int first = scanner.nextInt();
		System.out.println(first);

		String symbol = scanner.next();
		
		System.out.println("두 번째 입력값 : ");
		int second = scanner.nextInt();
		System.out.println(first);
		
		if("+".equals(symbol)) {
			System.out.println(first + symbol + second + "=" + (first+second));
		} else if("-".equals(symbol)) {
			System.out.println(first + symbol + second + "-" + (first-second));
		} else if("*".equals(symbol)) {
			System.out.println(first + symbol + second + "=" + (first*second));
		} else if("/".equals(symbol)) {
			System.out.println(first + symbol + second + "=" + (first/second));
		} else { System.out.println("사칙연산 기호가 아닙니다."); }
	}
}
