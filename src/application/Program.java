package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		
		
		//this way my Program dont know the implementation just interface 
		//it too a way of us do a dependency injection without explicit the implementation
		SellerDao sellerDao = DaoFactory.createSellerDao();


	}

}
