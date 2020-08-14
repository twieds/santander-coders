package main;

public class Student {
	
	public String name;
	public double grade_1;
	public double grade_2;
	public double grade_3;
	
	public double finalGrade() {
		return grade_1 + grade_2 + grade_3;
	}
	
	public double missingPoints() {
		return (60.0 - finalGrade());
	}
	
	public String toString() {
		return (finalGrade() >= 60.0 ? "PASS" : "FAILED -> MISSING " + missingPoints()  + " POINTS.");
	}

}
