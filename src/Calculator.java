import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù ��° �Է°� : ");
		int first = scanner.nextInt();
		System.out.println(first);

		String symbol = scanner.next();
		
		System.out.println("�� ��° �Է°� : ");
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
		} else { System.out.println("��Ģ���� ��ȣ�� �ƴմϴ�."); }
	}
}
