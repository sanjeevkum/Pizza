package com.springmvc.pizzaapplication.service;

import org.springframework.stereotype.Service;

import com.springmvc.pizzaapplication.serviceImp.PizzaDetail;

@Service
public interface PizzaFactory {

	PizzaDetail getPizza(String pizzaName);
	
}	
