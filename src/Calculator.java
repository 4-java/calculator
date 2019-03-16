import java.util.Scanner;

public class Calculator {
	static int calculate(int first,String symbol,int second) {
		int result = 0;
		if("+".equals(symbol)) {
			result = first + second;
			System.out.println("���� : " + result);
		} else if("-".equals(symbol)) {
			result = first - second;
			System.out.println("���� : " + result);
		} else if("*".equals(symbol)) {
			result = first * second;
			System.out.println("���� : " + result);
		} else if("/".equals(symbol)) {
			result = first / second;
			System.out.println("������ : " + result);
		} else { System.out.println("��Ģ���� ��ȣ�� �ƴմϴ�."); }
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int first = Input.getFirstValue(scanner);
		int result = first;
	
		while(true) {
			String symbol = Input.getSymbol(scanner);
			if(symbol.equals("quit")) {
				Output.print(result);
				break;
			}
			int second = Input.getSecondValue(scanner);
			result = calculate(result, symbol, second);
		}
	}
}
