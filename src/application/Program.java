package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		//this way my Program dont know the implementation just interface 
		//it too a way of us do a dependency injection without explicit the implementation
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("========= TEST 1: seller findbyId =====");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

		System.out.println("\n========= TEST 1: seller findbyId =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findBydepartment(department);
		for (Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println("\n========= TEST 1: seller findAll =====");
		 list = sellerDao.findAll();
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
	}

}
