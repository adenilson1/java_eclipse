package util;

public class CurrencyConverter {

	public static double currencyConverter(double dollar, double real) {
		return (dollar + dollar * 0.06) * real;
	}

}
