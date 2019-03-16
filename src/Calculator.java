import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ã¹ ¹øÂ° ÀÔ·Â°ª : ");
		int first = scanner.nextInt();
		System.out.println(first);

		System.out.println("µÎ ¹øÂ° ÀÔ·Â°ª : ");
		int second = scanner.nextInt();
		System.out.println(first);
		
		System.out.println("µ¡¼À : "+ (first+second));
		System.out.println("»¬¼À : "+ (first-second));
		System.out.println("³ª´°¼À : "+ (first*second));
		System.out.println("°ö¼À : "+ (first/second));
	}
}
