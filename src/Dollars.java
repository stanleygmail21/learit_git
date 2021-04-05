import java.util.Scanner;

public class Dollars {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a dollar amount");
		int dollarAmount = input.nextInt();
		
		
		int Twenties = dollarAmount / 20;
		int Tens = (dollarAmount - (20 * Twenties)) / 10;
		int Fives = (dollarAmount - (20 * Twenties + 10 * Tens)) / 5;
		int Ones = dollarAmount - (20 * Twenties + 10 * Tens + 5 * Fives);
		
		System.out.println("Number of 20s:  " + Twenties + "\n"
				+ "Number of 10s: " + Tens + "\n"
				+  "Number of 5s: " + Fives + "\n"
				+ "Number of 1s: " + Ones);

	}

}
