package mmc.com.cal;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(0.05+0.01);
        System.out.println(1.0-0.42);
        System.out.println(4.015*100);
        System.out.println(123.3/100);
        
        //Above caculators are the double cal,there are no correct cal results
        
        System.out.println(Arith.add(0.05, 0.01));
        System.out.println(Arith.sub(1.0, 0.42));
        System.out.println(Arith.mul(4.015, 100));
        System.out.println(Arith.div(123.3, 100));

	}

}
