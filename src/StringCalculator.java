import java.util.Scanner;

public class StringCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산할 값 입력 : ");
		
		String value = scanner.nextLine();
		System.out.println(value);
		String[] values = value.split(" ");
		
		int first = Integer.parseInt(values[0]);
		
		int result = first;

		for(int i=1;i< values.length;i+=2) {
			String symbol = values[i];
			System.out.println(symbol);
			int second = Integer.parseInt(values[i+1]);
			result = Calculator.calculate(result, symbol, second);
		}
	}
}
