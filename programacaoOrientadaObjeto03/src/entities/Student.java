package entities;

public class Student {
	public String name, result;
	public double grade1, grade2, grade3;

	
	public double FinalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public String PassFailed() {
		if(FinalGrade() >= 60) {
			return "PASS";
		}
		else {
			return "FAILED"
					+ "\n"
					+String.format("MISSING %.2f",60 - FinalGrade()) + " POINTS";
		}
	}
	

	
	public String toString() {
		return String.format("FINAL GRADE = %.2f%n", FinalGrade())
				+ PassFailed();

	}
}
