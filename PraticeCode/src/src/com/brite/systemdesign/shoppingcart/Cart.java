package com.brite.systemdesign.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Product> productsList;
	private double totalPrice;

	public Cart() {
		productsList = new ArrayList<>();
	}

	public void AddToCart(List<Product> productList) {
		productsList.addAll(productList);
		setTotalPrice(TotalItemsPrice());
	}

	public void AddToCart(Product product) {
		productsList.add(product);
		setTotalPrice(TotalItemsPrice());
	}

	public int getcartSize() {

		return productsList.size();
	}

	public void removeCartItem(String productName) {
		if (productsList != null && productsList.size() > 0) {
			for (Product p : this.productsList) {
				if (p.getProductName().equals(productName)) {
					productsList.remove(p);
				}
			}
			setTotalPrice(TotalItemsPrice());
		} else {
			System.out.println("No items in cart");
		}
	}

	public void removeAllItems() {
		this.productsList.clear();
		setTotalPrice(0.0);
		System.out.println("All Items has been Removed from Cart");
	}

	public double TotalItemsPrice() {
		double totalcartItemsPrice = 0.0;
		if (this.productsList != null && this.productsList.size() > 0) {
			for (Product p : this.productsList) {
				totalcartItemsPrice += p.getTotalPriceofProduct();
			}
		}
		return totalcartItemsPrice;
	}

	/**
	 * @return the totalPrice
	 */
	public double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * @param totalPrice
	 *            the totalPrice to set
	 */
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * @return the productsList
	 */
	public List<Product> getProductsList() {
		return productsList;
	}

	/**
	 * @param productsList the productsList to set
	 */
	public void setProductsList(List<Product> productsList) {
		this.productsList = productsList;
	}
}
