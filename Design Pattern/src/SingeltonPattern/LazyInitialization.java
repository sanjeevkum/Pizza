package SingeltonPattern;


//Create the instance in the global access method[works for single threaded]
public class LazyInitialization {
	
	private static LazyInitialization instance;
	
	private LazyInitialization() {
		
	}
	
	public static LazyInitialization getInstance() {
		if(instance == null) {
			instance = new LazyInitialization();
		}
		return instance;
	}	
}
