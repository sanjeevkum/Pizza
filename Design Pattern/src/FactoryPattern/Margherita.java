package FactoryPattern;

public class Margherita implements Pizza {

	@Override
	public void size() {
		int Size = 10;
		String pizzaSize = Size+" Inch";
		System.out.println(Size);
	}

	@Override
	public void receipe() {
		String salt = "3 mg";
		String peeper = "3 mg";
		System.out.println(salt+" "+peeper);
	}

	@Override
	public void cost() {
		String costInRupee = "Rs 350";
		System.out.println(costInRupee);
	}

	@Override
	public void type() {
		String veg = "Vegiterian";
		System.out.println(veg);
	}

}
