package com.springmvc.pizzaapplication.model;

import org.springframework.stereotype.Component;

//database table will be based on below attributes.
@Component("newPizza")
public class Pizza {
	//Pizza Id
	private Integer id;
	//Pizza Name
	private String name;
	//Pizza Receipe
	private String receipe;
	//Pizza Size
	private String size;
	//Pizza Cost
	private String cost;
	//Pizza Type
	private String type;

	public Pizza() {
		
	}
	
	public Pizza(Integer id, String name, String receipe, String size, String cost, String type) {
		super();
		this.id = id;
		this.name = name;
		this.receipe = receipe;
		this.size = size;
		this.cost = cost;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReceipe() {
		return receipe;
	}

	public void setReceipe(String receipe) {
		this.receipe = receipe;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
