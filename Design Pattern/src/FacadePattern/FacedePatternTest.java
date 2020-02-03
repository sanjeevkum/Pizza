package FacadePattern;


//Driver Class, Exposed to client
public class FacedePatternTest {
	public static void main(String[]args) {
		TransportationFaced transport = new TransportationFaced();
		
		transport.getTransportDetails("Bus");
		transport.getTransportDetails("Truck");
		transport.getTransportDetails("FourWheler");
	}
}
