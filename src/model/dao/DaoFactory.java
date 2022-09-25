package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	//will return a interface(return) but internal a will instance an implementation 
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
				
				
				
				 // instance an implementation
	}   //isto e para nao expor a implementaçao
        //internally will instance a implementation
}
