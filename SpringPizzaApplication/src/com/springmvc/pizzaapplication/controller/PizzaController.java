package com.springmvc.pizzaapplication.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.pizzaapplication.dao.Pizza;
import com.springmvc.pizzaapplication.services.PizzaNotFoundException;
import com.springmvc.pizzaapplication.services.PizzaService;

@Controller
public class PizzaController {


	@Autowired
	private PizzaService pizzaService;

	// Will Give all list of Pizza And there Details
	@RequestMapping(value = "/")
	public ModelAndView getAllPizza(ModelAndView model) {
		List<Pizza> listPizza = pizzaService.listAllPizza();
		model.addObject("listPizza", listPizza);
		model.setViewName("index");
		return model;
	}

	// Create new Pizza but according to specified pizza details
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView addNewPizza(@ModelAttribute Pizza pizza,BindingResult result) {
		ModelAndView model = new ModelAndView("pizza_form");
		model.addObject(pizza);
		return model;
	}

	// Save the new Data or Updated/Edited data
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView savePizza(@ModelAttribute Pizza pizza) throws PizzaNotFoundException {
		if (pizza.getId() == null) {
			pizzaService.createPizzaDetail(pizza);
		} else {
			pizzaService.updatePizzaDetail(pizza);
		}
		return new ModelAndView("redirect:/");
	}

	// ??Dispaly the pizza details in which user wants to edit
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editPizza(HttpServletRequest request) throws PizzaNotFoundException {
		Long id = Long.parseLong(request.getParameter("id"));
		Pizza pizza = pizzaService.getPizzaById(id);
		ModelAndView model = new ModelAndView("pizza_form");
		model.addObject("Pizza", pizza);
		return model;
	}

	// Delete the Pizza and redirecting to root page
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deletePizza(@RequestParam Long id) throws PizzaNotFoundException {
		pizzaService.deletePizza(id);
		return new ModelAndView("redirect:/");
	}

}
