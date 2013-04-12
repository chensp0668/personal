package mmc.com.emunation;

public class Operation3Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double x = 100;
		double y = 10;
		for (Operation3 op : Operation3.values())
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));

	}
}
