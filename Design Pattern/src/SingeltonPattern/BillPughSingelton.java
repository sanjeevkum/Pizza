package SingeltonPattern;


//Initialization On Demand holder idiom
//java Memory Model
public class BillPughSingelton {
	
	private BillPughSingelton() {
		
	}
	
	private static class BillPughSingeltonHelper{
		private static final BillPughSingelton instance = new BillPughSingelton();
	}
	
	public static BillPughSingelton getInstance() {
		return BillPughSingeltonHelper.instance;
	}
	
}
