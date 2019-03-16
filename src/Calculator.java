import java.util.Scanner;

public class Calculator {
	static int getValue(Scanner scanner) {
		System.out.println("�Է°� : ");
		int value = scanner.nextInt();
		return value;
	}
	static String getSymbol(Scanner scanner) {
		System.out.println("��Ģ���� ��ȣ : ");
		String symbol = scanner.next();
		return symbol;
	}

	static int calculate(int first,String symbol,int second) {
		int result = 0;
		if("+".equals(symbol)) {
			result = first + second;
			System.out.println("���� : " + result);
		} else if("-".equals(symbol)) {
			System.out.println("���� : " + result);
			result = first - second;
		} else if("*".equals(symbol)) {
			result = first * second;
			System.out.println("���� : " + result);
		} else if("/".equals(symbol)) {
			result = first / second;
			System.out.println("������ : " + result);
		} else { System.out.println("��Ģ���� ��ȣ�� �ƴմϴ�."); }
		return result;
	}
	static void print(int result) {
		System.out.println("���� ����� : "+ result);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int first = getValue(scanner);
		int result = first;
	
		while(true) {
			String symbol = getSymbol(scanner);
			if(symbol.equals("quit")) {
				print(result);
				break;
			}
			int second = getValue(scanner);
			result = calculate(result, symbol, second);
		}
	}
}
