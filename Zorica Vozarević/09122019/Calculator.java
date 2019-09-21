package Domaci;

public class Calculator {
	private double result = 0;

	public Calculator add(double n) {
		result = result + n;
		return this;
	}

	public Calculator div(double n) {
		result = result / n;
		return this;

	}

	public Calculator sub(double n) {
		result = result - n;
		return this;
	}

	public Calculator mul(double n) {
		result = result * n;
		return this;

	}

	public double value() {
		return result;

	}
}