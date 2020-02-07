package com.springmvc.pizzaapplication.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.pizzaapplication.dao.Pizza;
import com.springmvc.pizzaapplication.dao.PizzaRepo;

@Service
@Transactional
public class PizzaServiceImp implements PizzaService {

	@Autowired
	private PizzaRepo pizzaRepo;

	@Override
	public Pizza createPizzaDetail(Pizza pizza) {
		if(pizza.getId()==null) {
			pizza = pizzaRepo.save(pizza);
			return pizza;
		}else {
			return null;
		}
	}

	@Override
	public Pizza updatePizzaDetail(Pizza pizza) throws PizzaNotFoundException{
		Optional<Pizza>updatePizza = pizzaRepo.findById(pizza.getId());
		if(!updatePizza.isPresent()) {
			throw new PizzaNotFoundException("Injection is not Allowed");
		}else {
			Pizza newPizza = updatePizza.get();
			newPizza.setId(pizza.getId());
			newPizza.setCost(pizza.getCost());
			newPizza.setName(pizza.getName());
			newPizza.setReceipe(pizza.getReceipe());
			newPizza.setSize(pizza.getSize());
			newPizza.setType(pizza.getType());
			
			newPizza = pizzaRepo.save(newPizza);
			return newPizza;
		}
	}

	@Override
	public Pizza getPizzaById(Long id) throws PizzaNotFoundException{
		Optional<Pizza>pizza = pizzaRepo.findById(id);
		if(!pizza.isPresent()) {
			throw new PizzaNotFoundException("Provided Pizza is not there");
		}else {
			return pizza.get();
		}
	}

	@Override
	public void deletePizza(Long id) throws PizzaNotFoundException {
		Optional<Pizza>pizza = pizzaRepo.findById(id);
		if(!pizza.isPresent()) {
			throw new PizzaNotFoundException("Provided Pizza is not there");
		}else {
			pizzaRepo.deleteById(id);
		}
	}

	@Override
	public List<Pizza> listAllPizza() {
		List<Pizza>pizzas = (List<Pizza>) pizzaRepo.findAll();
		if(pizzas.size()<=0) {
			return new ArrayList<Pizza>();
		}else {
			return pizzas;
		}
	}


}
