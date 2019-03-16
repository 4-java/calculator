import java.util.Scanner;

public class Calculator {
	static int getFirstValue(Scanner scanner) {
		System.out.println("ù ��° �Է°� : ");
		int first = scanner.nextInt();
		return first;
	}
	static String getSymbol(Scanner scanner) {
		System.out.println("��Ģ���� ��ȣ : ");
		String symbol = scanner.next();
		return symbol;
	}
	static int getSecondValue(Scanner scanner) {
		System.out.println("�� ��° �Է°� : ");
		int second = scanner.nextInt();
		return second;
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
		
		int first = getFirstValue(scanner);
		int result = first;
	
		while(true) {
			String symbol = getSymbol(scanner);
			if(symbol.equals("quit")) {
				print(result);
				break;
			}
			int second = getSecondValue(scanner);
			result = calculate(result, symbol, second);
		}
	}
}
