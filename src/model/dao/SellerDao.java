package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	void insert(Seller obj); 
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	//Take this id to consult in the database a obj with it id;
	
	List<Seller> findAll();
}
