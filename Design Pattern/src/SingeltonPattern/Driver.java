package SingeltonPattern;

public class Driver {
	public static void main(String args[]) {
		Object obj = EagerInitialization.getInstance();
		System.out.println(obj);
		Object obj1 = EagerInitialization.getInstance();
		System.out.println(obj1);
		
		System.out.println("============== StaticBlockInitialization ======================");		
		Object obj2 = StaticBlockInitialization.getInstance();
		System.out.println(obj2);
		
		
		System.out.println("============   BillPughSingelton  ========================");
		Object obj4 = BillPughSingelton.getInstance();
		System.out.println(obj4);
		
		
		System.out.println("================ Serialized Singelton ==================");
		Object obj5 = SerializedSingelton.getInstance();
		System.out.println("SerializedSingelton:- "+ obj5);
		
	}
}
