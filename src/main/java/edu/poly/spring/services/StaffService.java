package edu.poly.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.poly.spring.dao.StaffDao;
import edu.poly.spring.model.StaffModel;

public class StaffService {
	@Autowired
	private StaffDao staffDao;
	
	public List<StaffModel> getAllStaff() {
		return staffDao.listStaff();
	}
}
