package mmc.com.emunation;

public class OpStatusTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(OpStatus op:OpStatus.values()){
			System.out.println(op.name()+"...."+op.getCode());
		}
	}

}
