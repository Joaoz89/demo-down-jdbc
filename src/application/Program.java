package application;



import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//this way my Program don't know the implementation just interface 
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
		
		
		System.out.println("\n========= TEST 1: seller insert =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
	

	    System.out.println("\n========= TEST 1: seller update =====");
	    seller = sellerDao.findById(1);
	    seller.setName("Martha Waine");
	    sellerDao.update(seller);
	    System.out.println("Update completed! ");
	    
		System.out.println("\n========= TEST 1: seller delete =====");
		System.out.println("ENter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deleted completed");
		
		sc.close();
		

}
	
}
