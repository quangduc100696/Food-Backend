package edu.poly.spring.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.poly.spring.services.StaffService;

@Controller 
@RequestMapping("/admin/nhanvien")
public class StaffController {
	@Autowired
	public StaffService staffService;
	@GetMapping("")
	public String getFood(Model model) {
		model.addAttribute("listStaff", staffService.getAllStaff());
		return "admin/staff";
	}
}
