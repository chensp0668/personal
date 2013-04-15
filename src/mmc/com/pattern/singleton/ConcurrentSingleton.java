package mmc.com.pattern.singleton;

public class ConcurrentSingleton {
	private volatile static ConcurrentSingleton uniqueInstance = null;

	private ConcurrentSingleton() {
	}

	private static ConcurrentSingleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (ConcurrentSingleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new ConcurrentSingleton();
				}
			}
		}
		return uniqueInstance;
	}

}
