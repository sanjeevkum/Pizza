package FactoryPattern;

public class Italian implements Pizza {

	@Override
	public void size() {
		int Size = 10;
		String pizzaSize = Size+" Inch";
		System.out.println(Size);
	}

	@Override
	public void receipe() {
		String salt = "2 mg";
		String peeper = "1 mg";
		System.out.println(salt+" "+peeper);
	}

	@Override
	public void cost() {
		String costInRupee = "Rs 150";
		System.out.println(costInRupee);
	}

	@Override
	public void type() {
		String type = "Non-Vegiterian";
		System.out.println(type);
	}

}
