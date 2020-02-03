package SingeltonPattern;


//Instance of class is created in the static block
public class StaticBlockInitialization {
	
	private static StaticBlockInitialization instance;
	
	private StaticBlockInitialization() {}
	
	static {
		try {
			instance = new StaticBlockInitialization();
			System.out.println("Instance Created");
		}catch(Exception e) {
			throw new RuntimeException("Exception occured");
		}
	}
	
	public static StaticBlockInitialization getInstance() {
		return instance;
	}
	
}
