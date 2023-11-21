package com.Oops2;

import java.util.*;

public class Main {

	public static void main(String[] args) throws ArrayGotFulled,ProductNOTFOUNDEXCEPTION, DuplicateProduct {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Product p1=new Product(1,"Apple",100,3,5);
		Product p2=new Product(2,"Mango",200,4,10);
		Product p3=new Product(3,"Grape",100,5,40);
		Product p4=new Product(4,"Orange",70,6,30);
		Product p5=new Product(5,"Pineapple",250,7,20);
		
		List<Product> prodList=new ArrayList<>();
		ProductDao dao=new ProductDao();
		

		
		
	// Adding products into List	
		dao.add(prodList,p1);
		dao.add(prodList,p2);
		dao.add(prodList,p3);
		dao.add(prodList,p4);
		dao.add(prodList,p5);
		
		
   //Deleting Product by using Product ID
//		prodList=dao.deleteProd(5,prodList);
			
   //Update Product by using Product ID
//		prodList=dao.update(prodList, 2, "Banana", 10, 5, 2); 
		
   //Search Product based on Product ID
//		System.out.println(dao.searchProductById(4,prodList));
		
   //Search Product based on Product ID
//	    System.out.println(dao.searchProductByName("Apple",prodList));
		
   //Display all product by ascending order of price
//		dao.displayProdByPrice(prodList);
		
    //Display all product by ascending order of Discount
//		dao.displayProdByDiscount(prodList);		
		
   // Display All Products
//		dao.display(prodList);

	}

}
