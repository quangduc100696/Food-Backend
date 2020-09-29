package edu.poly.spring.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.poly.spring.model.Food;
import edu.poly.spring.services.FoodService;

@Controller
@RequestMapping("/admin")
public class FoodApiController {

	@Autowired
	private FoodService foodService;
	
	@GetMapping("/food")
	public List<Food> listFood(){
		return foodService.getAllFood();
	}
	
}
