package com.springmvc.pizzaapplication.dao;

import java.util.List;

import com.springmvc.pizzaapplication.model.Pizza;

//Method to deal with databases
public interface PizzaDAO {
	//save into database
	public int save(Pizza pizza);
	//updating existing data
	public int update(Pizza pizza);
	//get particular data
	public Pizza get(Integer id);
	//delete particular pizza
	public int delete(Integer id);
	//get all pizza
	public List<Pizza> list();
}
