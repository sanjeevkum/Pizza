package SingeltonPattern;


//Instance of this class is created at the time of class loading
public class EagerInitialization {
	
	//Instance of class
	private static final EagerInitialization instance = new EagerInitialization();
	
	//Restrict the creation of instance of class
	private EagerInitialization() {
		
	}
	
//	return instance of class
	public static EagerInitialization getInstance() {
		return instance;
	}
	
	
}
