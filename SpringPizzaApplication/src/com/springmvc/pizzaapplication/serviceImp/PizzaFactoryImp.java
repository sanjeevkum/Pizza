package com.springmvc.pizzaapplication.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.pizzaapplication.service.PizzaFactory;

//Factory is creational Design Pattern, its have low coupling and high Cohession
//It defines and Interface or Abstract class to create a object

@Service
public class PizzaFactoryImp implements PizzaFactory{
	
	@Autowired
	Calzone calzone;
	
	@Autowired
	Italian italian;
	
	@Autowired
	Margherita margherita;
	
	@Autowired
	Neapolitan neapolitan;
	
	@Autowired
	Stromboli stromboli;	

	//Return Pizza According to pizzaName if the specified pizza[pizza class Exists] present 
	public PizzaDetail getPizza(String pizzaName) {
		if(pizzaName==null) {
			return null;
		}
		if(pizzaName.equalsIgnoreCase("Calzone")) {
			return calzone;
		}else if(pizzaName.equalsIgnoreCase("Italian")) {
			return italian;
		}else if(pizzaName.equalsIgnoreCase("Margherita")) {
			return margherita;
		}else if(pizzaName.equalsIgnoreCase("Neapolitan")) {
			return neapolitan;
		}else if(pizzaName.equalsIgnoreCase("Stromboli")) {
			return stromboli;
		}		
		return null;
	}

}
