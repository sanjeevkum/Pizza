package com.springmvc.pizzaapplication.services;

public class PizzaNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3131863245984079639L;
	
	public PizzaNotFoundException(String msg) {
		super(msg);
	}
	
}
