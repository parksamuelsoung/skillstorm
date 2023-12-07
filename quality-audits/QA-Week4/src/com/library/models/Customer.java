package com.library.models;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String[] checkedOutBooks;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String[] getCheckedOutBooks() {
		return checkedOutBooks;
	}
	public void setCheckedOutBooks(String[] checkedOutBooks) {
		this.checkedOutBooks = checkedOutBooks;
	}
	
	

}
