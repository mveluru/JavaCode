package com.brite.systemdesign.shoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
	static final double laptopPrice = 1245.99;
	static final double cellphonePrice = 845.99;

	Customer() {

	}

	public static void CustomerOrderProcessing(List<Product> productList) {
		if (productList.size() > 0) {
			Cart cart = new Cart();
			cart.AddToCart(productList);
		}
	}

	public static void CustomerOrderProcessing(Product product) {
		Cart cart=null;
		if (product != null) {
			cart = new Cart();
			cart.AddToCart(product);
		}
		System.out.println("Product Name: "+cart.getProductsList().get(0).getProductName() +" Cart Size:"+ cart.getcartSize()+" Quantity Size:"+ cart.getProductsList().get(0).getProductQuantity()+" Amount$ :"+cart.getTotalPrice());
	}

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		System.out.println("To Buy LAPTOP:type Laptop");
		System.out.println("To Buy Cell phone:type Cellphone");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER ITEM NAME");
		System.out.println();
		    String itemName = sc.nextLine();
		    System.out.println();
	         
			if (itemName != null) {

				if (itemName.equalsIgnoreCase("Laptop")) {
                    
					System.out.println("Enter number of Laptops to purchase");
					System.out.println();
					int itemCount =sc.nextInt();
					Product laptops = null;
					if (itemCount > 0) {
						laptops = new Laptops("LAPTOP", itemCount,
								laptopPrice);

					}
					if (laptops != null) {
						productList.add(laptops);
					}
				}
				
				
				 if(itemName.equalsIgnoreCase("CellPhone")) {
					System.out
							.println("Enter number of CellPhone(s) to purchase");
					Product CellPhones = null;
					int itemCount =sc.nextInt();
					if (itemCount > 0) {
						CellPhones = new Laptops("CellPhones", itemCount,
								cellphonePrice);
					}
					if (CellPhones != null) {
						productList.add(CellPhones);
					}
				}
			}
			sc.close();
			if (productList.size() == 2) {

				CustomerOrderProcessing(productList);
			} else if (productList.size() == 1) {
				CustomerOrderProcessing(productList.get(0));
			}
		
	}

}
