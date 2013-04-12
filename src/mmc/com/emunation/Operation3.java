package mmc.com.emunation;

public enum Operation3 {
	PLUS("+") {
		double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS("-") {
		double apply(double x, double y) {
			return x - y;
		}
	},
	TIMES("*") {
		double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE("/") {
		double apply(double x, double y) {
			return x / y;
		}
	};

	private final String symbol;

	private Operation3(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbol() {
		return symbol;
	}

	public String toString() {
		return symbol;
	}

	abstract double apply(double x, double y);
}
