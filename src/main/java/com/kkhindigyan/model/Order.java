package com.kkhindigyan.model;

public class Order {

	private String itemName;
    private Double itemPrice;
    private String address;
    
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Order [itemName=" + itemName + ", itemPrice=" + itemPrice + ", address=" + address + "]";
	}
}
