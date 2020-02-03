package SingeltonPattern;

import java.io.Serializable;


//Serialized and Singelton is used to store the current state of file in file system most often in distributred syst
public class SerializedSingelton implements Serializable{

	private static final long serialVersionUID = -2321892810484460447L;
	
	
	private SerializedSingelton() {
		
	}
	
	private static class SingeltonHelper{
		private static final SerializedSingelton instance = new SerializedSingelton();
	}
	
	public static SerializedSingelton getInstance() {
		return SingeltonHelper.instance;
	}
	
	protected Object readResolve() {
		return getInstance();
	}
	
}
