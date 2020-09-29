package edu.poly.spring.dao;

import java.util.List;

import edu.poly.spring.model.Food;

public interface FoodDao {
	public Food create(Food ct);
	public Food update(Food ct);
	public Food findById(int id);
	public void delete(Food ct);
	public List <Food> listFood(); 
}
