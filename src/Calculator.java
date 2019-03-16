import java.util.Scanner;

public class Calculator {
	static int getFirstValue(Scanner scanner) {
		System.out.println("Ã¹ ¹øÂ° ÀÔ·Â°ª : ");
		int first = scanner.nextInt();
		return first;
	}
	static String getSymbol(Scanner scanner) {
		System.out.println("»çÄ¢¿¬»ê ±âÈ£ : ");
		String symbol = scanner.next();
		return symbol;
	}
	static int getSecondValue(Scanner scanner) {
		System.out.println("µÎ ¹øÂ° ÀÔ·Â°ª : ");
		int second = scanner.nextInt();
		return second;
	}
	static int calculate(int first,String symbol,int second) {
		int result = 0;
		if("+".equals(symbol)) {
			result = first + second;
			System.out.println("µ¡¼À : " + result);
		} else if("-".equals(symbol)) {
			System.out.println("»¬¼À : " + result);
			result = first - second;
		} else if("*".equals(symbol)) {
			result = first * second;
			System.out.println("°ö¼À : " + result);
		} else if("/".equals(symbol)) {
			result = first / second;
			System.out.println("³ª´°¼À : " + result);
		} else { System.out.println("»çÄ¢¿¬»ê ±âÈ£°¡ ¾Æ´Õ´Ï´Ù."); }
		return result;
	}
	static void print(int result) {
		System.out.println("ÃÖÁ¾ °á°ú°ª : "+ result);
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
