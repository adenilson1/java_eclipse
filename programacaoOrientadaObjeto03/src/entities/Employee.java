package entities;

public class Employee {
	public String name;
	public double grossSalay;
	public double tax;
	public double percentage;
	
	
	public double netSalary() {
		
		if(percentage == 0) {
			return grossSalay - tax;
		}
		else {
			return (grossSalay * percentage/100) + (grossSalay - tax);
		}
		
	}
	
	public void increaseSalary(double percentage) {
		this.percentage = percentage;
	}
	
	
	public String toString() {
		return name
			   + String.format(", $ %.2f%n",netSalary());
	}

}
