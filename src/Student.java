
public class Student {

	private int ID;
	private int Hours;
	private int Points;
	
	
	public Student() {
		ID = 99999;
		Hours = 3;
		Points = 12;

	}
	
	public void setID(int id) {
		ID = id;
	}
	
	public int getID(){
		return ID;
	}
	
	public void setHours(int hours) {
		Hours = hours;
	}
	
	public int getHours() {
		return Hours;
	}
	
	public void setPoints(int points) {
		Points = points;
	}
	
	public int getPoints() {
		return Points;
	}
	
	public double CalcGPA() {
		double CGPA = Double.valueOf(Points / Hours);
		return CGPA;
	}
	
	public void Display() {
		System.out.println("Student ID: " + getID());
		System.out.println("Number of Credits Earned: " + getHours());
		System.out.println("Number of Points Earned: " + getPoints());
		System.out.println("GPA: " + CalcGPA() );
	}
}
