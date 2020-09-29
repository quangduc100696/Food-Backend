package edu.poly.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.poly.spring.dao.FoodDao;
import edu.poly.spring.model.Food;

@Service
public class FoodService {
	
	@Autowired
	private FoodDao foodDao;
	
	public List<Food> getAllFood() {
		return foodDao.listFood();
	}
}
