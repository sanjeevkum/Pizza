package FactoryPattern;

import java.util.Scanner;

public class PizzaDriver {
	
	public static void main(String[]args) {		
		
		Scanner input = new Scanner(System.in);
		
		//Take Input for Pizza Type
		String pizzaName = input.next();
		
		PizzaFactory pizzaFactory = new PizzaFactory();
		
		Pizza pizza = pizzaFactory.getPizza(pizzaName);
		
		// Below methods will display all the details of that particular pizza
		pizza.size();
		pizza.cost();
		pizza.receipe();
		pizza.type();
	}
}
