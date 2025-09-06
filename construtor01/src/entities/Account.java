package entities;

public class Account {

	private int number;
	private String holder;
	private char op;
	private double value;

	public Account() {

	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, char op, double InitialDeposit) {
		this.number = number;
		this.holder = holder;
		Deposito(InitialDeposit);
		this.op = op;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public char getOp() {
		return op;
	}

	public void setOp(char op) {
		this.op = op;
	}

	public double getDeposito() {
		return value;
	}
	
	public void AccountNumber(int number) {
		this.number = number;
	}

	public void Deposito(double value) {
		this.value += value;

	}
	
	public void Withdraw(double value) {
		this.value -= value + 5;

	}

	public void Print() {
		System.out.printf("Account : %d, Holder: %s, Balance: $ %.2f%n", 
				getNumber(), 
				getHolder(), 
				getDeposito());
	}
}
