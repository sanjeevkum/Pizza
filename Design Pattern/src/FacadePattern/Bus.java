package FacadePattern;


// Bus is a type of  Transportation
public class Bus implements Transportation{

	//Print the name of Driver
	@Override
	public void driver() {
		System.out.println("John Duck");
	}
	
	
	//print total weight of the lugage
	@Override
	public void lugage() {
		String weight = "100kg";
		System.out.println(weight);
	}

	
	//Total Passanger
	@Override
	public void passanger() {
		int totalPassanger = 75;
		System.out.println(totalPassanger);
	}

}
