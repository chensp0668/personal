package mmc.com;

public class FinallyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result = getResult();
		System.out.println(result);
	}
	
	public static int getResult(){
		int result = 0;
		try{
			result = 3;
			return result;
		}finally{
			result = 4;
			return result;
		}
	}

}
