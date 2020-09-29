package edu.poly.spring.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.poly.spring.services.FoodService;

@Controller
@RequestMapping("admin/food")
@Service
public class FoodController{
	
	@Autowired
	private FoodService foodservice;	
	@GetMapping("")
	public String getFood(Model model) {
		model.addAttribute("listFood", foodservice.getAllFood());
		return "";
	}
}
