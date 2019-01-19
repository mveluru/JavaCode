package com.brite.systemdesign.shoppingcart;

public class Product {
	private String productName;
	private int productQuantity;
	private double productPrice;
	
	Product (String productName,int productQuantity , double productPrice){
		this.productName=productName;
		this.productPrice=productPrice;
		this.productQuantity=productQuantity;
		
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productQuantity
	 */
	public int getProductQuantity() {
		return productQuantity;
	}
	/**
	 * @param productQuantity the productQuantity to set
	 */
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	/**
	 * @return the productPrice
	 */
	public double getProductPrice() {
		return productPrice;
	}
	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public double getTotalPriceofProduct(){
		return this.productPrice * this.productQuantity;
	}
	
	
	
}
