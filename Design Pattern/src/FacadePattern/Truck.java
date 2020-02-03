package FacadePattern;

//Truck Class which is atype of Transportation
public class Truck implements Transportation {

	@Override
	public void driver() {
		System.out.println("Alfredo");
	}

	@Override
	public void lugage() {
		String weight = "10 Tone";
		System.out.println(weight);
	}

	@Override
	public void passanger() {
		int totalPassanger = 15;
		System.out.println(totalPassanger);
	}

}
