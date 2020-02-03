package com.springmvc.pizzaapplication.dao;

import java.util.List;

import com.springmvc.pizzaapplication.model.Pizza;

public interface PizzaDAO {
	public int save(Pizza pizza);
	
	public int update(Pizza pizza);
	
	public Pizza get(Integer id);
	
	public int delete(Integer id);
	
	public List<Pizza> list();
}
