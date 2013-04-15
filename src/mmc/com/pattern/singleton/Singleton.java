package mmc.com.pattern.singleton;

public class Singleton {

	private Singleton() {
	}
	
	private static class InstanceHolder{
		private static final Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance(){
		return InstanceHolder.INSTANCE;
	}
	
	private int counter = 0;
}
