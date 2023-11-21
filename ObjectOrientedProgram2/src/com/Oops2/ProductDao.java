package com.Oops2;

import java.util.*;


public class ProductDao 
{

	
	public static void add(List<Product> prodList,Product newProd) throws DuplicateProduct
	{
		for(Product obj: prodList)
		{
			if(obj.getProdID()==newProd.getProdID())
				throw new DuplicateProduct();
		}
		prodList.add(newProd);
	}
	public static void display(List<Product>prodList)
	{ 
		for(Product obj : prodList)
			System.out.println("Product ID= "+obj.getProdID()+", Product Name="+obj.getProdName()+", Price ="+obj.getPrice()+", Quantity ="+obj.getQuantity()+", Discount="+obj.getDiscount());
	}
	public static List<Product> update(List<Product> prodList,int prodId,String prodName,int price,int quantity,int discount) throws ProductNOTFOUNDEXCEPTION
	{
		for(Product obj:prodList)
		{
			if(obj.getProdID()==prodId)
			{
				obj.setProdName(prodName);
				obj.setPrice(price);
				obj.setQuantity(quantity);
				obj.setDiscount(discount);
				return prodList;
			}
		}
		throw new ProductNOTFOUNDEXCEPTION();
	}
	
	
	public static List<Product> deleteProd(int prodId,List <Product> prodList)throws ProductNOTFOUNDEXCEPTION
	{
		List<Product> prodList2=new ArrayList<>();
		int flag=0;
		for(Product obj: prodList)
		{   
				if(obj.getProdID()==prodId)
					flag=1;
				else
					prodList2.add(obj);
		}
		if(flag==0)
			throw new ProductNOTFOUNDEXCEPTION();
		return prodList2;
	}
	public static boolean searchProductById(int prodId,List<Product> prodList) throws ProductNOTFOUNDEXCEPTION
	{
		
		for(Product obj:prodList)
		{
			if(obj.getProdID()==prodId-1)
			{
				return true;
			}
				
		}
		throw new ProductNOTFOUNDEXCEPTION();
	}
	public static boolean searchProductByName(String prodName,List<Product> prodList) throws ProductNOTFOUNDEXCEPTION
	{
		for(Product obj:prodList)
		{
			if(prodName.equals(obj.getProdName()))
			{
				return true;
			}		
		}
		throw new ProductNOTFOUNDEXCEPTION();
	}
	public static void displayProdByPrice(List<Product> prodList)
	{
		List<Product> newList = prodList;
		Collections.sort(newList, new Comparator<Product>() {
			public int compare(Product obj, Product obj1) {
				if(obj.getPrice()  > obj1.getPrice()) {
					return 1;
				}
				else if(obj.getPrice() == obj1.getPrice()) {
					return 0;
				}
				return -1;
 			}
		});

		for(Product obj : newList)
		System.out.println("Product ID= "+obj.getProdID()+", Product Name="+obj.getProdName()+", Price ="+obj.getPrice()+", Quantity ="+obj.getQuantity()+", Discount="+obj.getDiscount());
	}
	
	public static void displayProdByDiscount(List<Product> prodList)
	{

		
		List<Product> newList = prodList;
		Collections.sort(newList, new Comparator<Product>() {
			public int compare(Product obj, Product obj1) {
				if(obj.getDiscount()  > obj1.getDiscount()) {
					return 1;
				}
				else if(obj.getDiscount() == obj1.getDiscount()) {
					return 0;
				}
				return -1;
 			}
		});

		for(Product obj : newList)
		System.out.println("Product ID= "+obj.getProdID()+", Product Name="+obj.getProdName()+", Price ="+obj.getPrice()+", Quantity ="+obj.getQuantity()+", Discount="+obj.getDiscount());
	}

}
