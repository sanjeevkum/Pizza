package FacadePattern;

//Faced is Structural Design Pattern
//Exposing the client in simplified way,bcz it hides internal complexity behind a single interface
//Decouples the code that uses the system from details of the subsystem. modification easer in later 
public class TransportationFaced {
	private Transportation Bus;
	private Transportation FourWheler;
	private Transportation Truck;
	
	public TransportationFaced(){
		Bus = new Bus();
		FourWheler = new FourWheler();
		Truck = new Truck();
	}
	
	public void getTransportDetails(String transport) {
		if(transport.equalsIgnoreCase("Bus")) {
			Bus.driver();
			Bus.lugage();
			Bus.passanger();
		}else if(transport.equalsIgnoreCase("Truck")) {
			Truck.driver();
			Truck.lugage();
			Truck.passanger();
		}else if(transport.equalsIgnoreCase("FourWheler")) {
			FourWheler.driver();
			FourWheler.lugage();
			FourWheler.passanger();
		}
			
	}
	
}
