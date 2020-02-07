package com.springmvc.pizzaapplication.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springmvc.pizzaapplication.dao.Pizza;

//Method to deal with databases
@Service
public interface PizzaService {
	//save into database
	Pizza createPizzaDetail(Pizza pizza);
	//updating existing data
	Pizza updatePizzaDetail(Pizza pizza) throws PizzaNotFoundException;
	//get particular data
	Pizza getPizzaById(Long id) throws PizzaNotFoundException;
	//delete particular pizza
	void deletePizza(Long id) throws PizzaNotFoundException;
	//get all pizza
	List<Pizza> listAllPizza();
}
