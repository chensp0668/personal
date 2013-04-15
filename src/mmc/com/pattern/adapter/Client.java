package mmc.com.pattern.adapter;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Client().test(); 

	}
	public void test(){
		Target target = new Adapter();
		int v1 = target.get110v();
		int v2 = target.get220v();
		
		System.out.println("输出电压为："+v1);
		System.out.println("输出电压为："+v2);
		
	}

}
