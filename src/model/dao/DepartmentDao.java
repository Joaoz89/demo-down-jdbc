package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj); 
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	//Take this id to consult in the database a obj with it id;
	
	List<Department> findAll();
	

}
