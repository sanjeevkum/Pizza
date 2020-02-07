package com.springmvc.pizzaapplication.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepo extends CrudRepository<Pizza, Long>{

}
