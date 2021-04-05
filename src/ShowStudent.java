import java.util.Scanner;

public class ShowStudent {

	public static void main(String[] args) {
	    Student Student1 = new Student();
	    
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Enter your Student ID");
	    Student1.setID(input.nextInt());
	   
	    System.out.println("Enter the number of credit hours earned");
	    Student1.setHours(input.nextInt());
	   
	    System.out.println("Enter the number of points earned");
	    Student1.setPoints(input.nextInt());
	   
	    Student1.Display();
	    
	    
	}

}
