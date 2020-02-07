package com.springmvc.pizzaapplication.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//database table will be based on below attributes.

@Entity
@Table(name="pizza_details")
public class Pizza {
	//Pizza Id
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
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
	
	public Pizza(Long id, String name, String receipe, String size, String cost, String type) {
		super();
		this.id = id;
		this.name = name;
		this.receipe = receipe;
		this.size = size;
		this.cost = cost;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
