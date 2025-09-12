package entities;

public class Employee {

	private String name;
	private Integer id;
	private Double salario;

	public Employee() {

	}

	public Employee(Integer id,String name, Double salario) {
		this.name = name;
		this.id = id;
		this.salario = salario;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void increaseSalary(double porcetage) {
		salario += salario * porcetage / 100.0;
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f",salario);
	}
}
