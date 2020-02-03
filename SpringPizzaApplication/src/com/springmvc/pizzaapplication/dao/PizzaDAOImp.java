package com.springmvc.pizzaapplication.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.springmvc.pizzaapplication.model.Pizza;

public class PizzaDAOImp implements PizzaDAO {

	private JdbcTemplate jdbcTemplate;	
	
	public PizzaDAOImp(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	@Override
	public int save(Pizza pizza) {
		String sql = "INSERT INTO Pizza_Details (name, receipe, size, cost, type) VALUES(?,?,?,?,?)";
		return jdbcTemplate.update(sql,pizza.getName(),pizza.getReceipe(),pizza.getSize(),pizza.getCost(),pizza.getType());
	}

	@Override
	public int update(Pizza pizza) {
		String sql = "UPDATE Pizza_Details SET name=?, receipe=?, size=?, cost=?, type=? WHERE pizza_id=?";
		return jdbcTemplate.update(sql,pizza.getName(),pizza.getReceipe(),pizza.getSize(),pizza.getCost(),pizza.getType());
	}

	@Override
	public Pizza get(Integer id) {
		String sql = "SELECT * FROM Pizza_Details WHERE id="+id;
		
		ResultSetExtractor<Pizza> extract = new ResultSetExtractor<Pizza>(){
			@Override
			public Pizza extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					String name = rs.getString("name");
					String receipe = rs.getString("receipe");
					String size = rs.getString("size");
					String cost = rs.getString("cost");
					String type = rs.getString("type");
					
					return new Pizza(id, name, receipe, size, cost, type);
				}
				return null;
			}
			
		};
		
		return jdbcTemplate.query(sql,extract);
	}

	@Override
	public int delete(Integer id) {
		String sql = "DELETE FROM Pizza_Details WHERE id="+id;
		return jdbcTemplate.update(sql);
	}

	@Override
	public List<Pizza> list() {
		String sql = "SELECT * FROM Pizza_Details";
		RowMapper<Pizza>rowMapper = new RowMapper<Pizza>() {
			@Override
			public Pizza mapRow(ResultSet rs, int rowNum) throws SQLException {
					Integer id = rs.getInt("id");
					String name = rs.getString("name");
					String receipe = rs.getString("receipe");
					String size = rs.getString("size");
					String cost = rs.getString("cost");
					String type = rs.getString("type");
					
					return new Pizza(id, name, receipe, size, cost, type);
			}			
		};
		return jdbcTemplate.query(sql, rowMapper);
	}

}
