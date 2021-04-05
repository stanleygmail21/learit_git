import java.util.Scanner;

public class BookstoreCredit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter you name");
		String name = input.nextLine();
		
		System.out.println("Enter your GPA");
		double gpa = input.nextDouble();
		
		System.out.println(name + " with a " + gpa + " GPA, has a bookstore credit of " 
				+ "$" + display(gpa) );
	
	
	}
	
	public static double display(double CalcCredit){
		return (10* CalcCredit);
	}

}
