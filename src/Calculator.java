import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù ��° �Է°� : ");
		int first = scanner.nextInt();
		System.out.println(first);
		
		int result = first;
		while(true) {
			System.out.println("��Ģ���� ��ȣ : ");
			String symbol = scanner.next();
			
			if(symbol.equals("quit")) {
				System.out.println("���� ����� : "+ result);
				break;
			}
						
			System.out.println("�� ��° �Է°� : ");
			int second = scanner.nextInt();
			

			if("+".equals(symbol)) {
				result = result + second;
				System.out.println("���� : " + result);
			} else if("-".equals(symbol)) {
				System.out.println("���� : " + result);
				result = result - second;
			} else if("*".equals(symbol)) {
				result = result * second;
				System.out.println("���� : " + result);
			} else if("/".equals(symbol)) {
				result = result / second;
				System.out.println("������ : " + result);
			} else { System.out.println("��Ģ���� ��ȣ�� �ƴմϴ�."); }
		}
	}
}
