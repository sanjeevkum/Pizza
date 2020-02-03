package FactoryPattern;

//Factory is creational Design Pattern, its have low coupling and high Cohession
//It defines and Interface or Abstract class to create a object
public class PizzaFactory {
	
	public Pizza getPizza(String pizzaType) {
		if(pizzaType==null) {
			return null;
		}
		if(pizzaType.equalsIgnoreCase("Calzone")) {
			return new Calzone();
		}else if(pizzaType.equalsIgnoreCase("Italian")) {
			return new Italian();
		}else if(pizzaType.equalsIgnoreCase("Margherita")) {
			return new Margherita();
		}else if(pizzaType.equalsIgnoreCase("Neapolitan")) {
			return new Neapolitan();
		}else if(pizzaType.equalsIgnoreCase("Stromboli")) {
			return new Stromboli();
		}		
		return null;
	}
}
