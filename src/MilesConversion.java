
public class MilesConversion {

	public static void main(String[] args) {
		final int inches = 63360;
		final int feet = 5280;
		final int yards = 1760;
		
		int miles = 30;
		
		int cInches = miles * inches;
		int cFeet = miles * feet;
		int cYards = miles * yards;
		
		
		System.out.println("The conversion of " + miles 
				+ "Inches, feet and yards are as follows:\n"
				+ miles + "miles = " + cInches + "Inches\n" 
				+ miles + "miles = " + cFeet + "Feet\n" 
				+ miles + "miles = " + cYards + "Yards\n" );

	}

}
