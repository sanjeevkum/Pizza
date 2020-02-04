package com.springmvc.pizzaapplication.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.pizzaapplication.dao.PizzaDAO;
import com.springmvc.pizzaapplication.model.Pizza;
import com.springmvc.pizzaapplication.serviceImp.PizzaFactoryImp;

@Controller
public class PizzaController {

	@Autowired
	@Qualifier("newPizza")
	private Pizza newPizza;

	@Autowired
	private PizzaDAO pizzaDAO;

	@Autowired
	private PizzaFactoryImp pizzaFactoryImp;

	//Will Give all list of Pizza And there Details
	@RequestMapping(value = "/")
	public ModelAndView getAllPizza(ModelAndView model) {
		List<Pizza> listPizza = pizzaDAO.list();
		model.addObject("listPizza", listPizza);
		model.setViewName("index");
		return model;
	}

	//Create new Pizza but according to specified pizza details
	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView addNewPizza(ModelAndView model) {
		model.addObject("Pizza", newPizza);
		model.setViewName("pizza_form");
		return model;
	}

	//Save the new Data or Updated/Edited data
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView savePizza(@ModelAttribute Pizza pizza) {
		String pizzaName = pizza.getName();
		Object ob = pizzaFactoryImp.getPizza(pizzaName);
		if (ob != null) {
			if (pizza.getId() == null) {
				pizzaDAO.save(pizza);
			} else {
				pizzaDAO.update(pizza);
			}
		}else {
			ModelAndView model = new ModelAndView("my_pizza");
			return model;
		}
		return new ModelAndView("redirect:/");
	}

	// ??Dispaly the pizza details in which user wants to edit
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editPizza(HttpServletRequest request) {
		Integer id = Integer.parseInt(request.getParameter("id"));
		Pizza pizza = pizzaDAO.get(id);
		ModelAndView model = new ModelAndView("pizza_form");
		model.addObject("Pizza", pizza);
		return model;
	}

	//Delete the Pizza and redirecting to root page
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deletePizza(@RequestParam Integer id) {
		pizzaDAO.delete(id);
		return new ModelAndView("redirect:/");
	}

}
