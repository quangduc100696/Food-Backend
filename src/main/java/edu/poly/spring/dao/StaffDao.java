package edu.poly.spring.dao;

import java.util.List;

import edu.poly.spring.model.StaffModel;

public interface StaffDao {
	public StaffModel create(StaffModel ct);
	public StaffModel update(StaffModel ct);
	public StaffModel findById(int id);
	public void delete(StaffModel ct);
	public List<StaffModel> listStaff(); 
}
