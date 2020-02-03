package FacadePattern;


// FourWheler is a type of  Transportation
public class FourWheler implements Transportation{
	
	@Override
	public void driver() {
		System.out.println("Bike Owner");
	}

	@Override
	public void lugage() {
		String weight = "No Luggage";
		System.out.println(weight);
	}

	@Override
	public void passanger() {
		int totalPassanger = 2;
		System.out.println(totalPassanger);
	}

}
