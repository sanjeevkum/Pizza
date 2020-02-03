package SingeltonPattern;


//Multiple thread can access
public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {
		
	}
	
//	public static synchronized ThreadSafeSingleton getInstance() {
//		if(instance == null) {
//			instance = new ThreadSafeSingleton();
//		}
//		return instance;
//	}
	
	
	public static ThreadSafeSingleton getInstance() {
		if(instance==null) {
			synchronized (ThreadSafeSingleton.class) {
				if(instance==null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
	
}
