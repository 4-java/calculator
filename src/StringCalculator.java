import java.util.Scanner;

public class StringCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� �� �Է� : ");
		
		String value = scanner.nextLine();
		System.out.println(value);
		String[] values = value.split(" ");
		
		int first = Integer.parseInt(values[0]);
		
		int i = 1;
		int result = first;

		while(i < values.length) {
			String symbol = values[i];
			System.out.println(symbol);
			int second = Integer.parseInt(values[i+1]);
			result = Calculator.calculate(result, symbol, second);
			i = i + 2;
		}
	}
}