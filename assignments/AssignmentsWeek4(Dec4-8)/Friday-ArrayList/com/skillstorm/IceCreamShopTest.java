package com.skillstorm;

public class IceCreamShopTest {
	
	public static void main(String[] args) {
		IceCream vanilla = new IceCream("vanilla", 3.99);
		IceCream chocolate = new IceCream("chocolate", 4.99);
		IceCream strawberry = new IceCream("strawberry", 5.99);
		IceCreamShop iceCreamShop = new IceCreamShop("BR");
		

		iceCreamShop.addFlavor(vanilla);
		iceCreamShop.addFlavor(chocolate);
		iceCreamShop.addFlavor(strawberry);
		try {
			iceCreamShop.addFlavor(vanilla);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		Customer customer1 = new Customer(vanilla, "Gilbert");
		Customer customer2 = new Customer(chocolate, "Penelope");
		Customer customer3 = new Customer(strawberry, "Roberta");
		
		iceCreamShop.addCustomer(customer1);
		iceCreamShop.addCustomer(customer2);
		iceCreamShop.addCustomer(customer3);
		
		try {
			iceCreamShop.serviceCustomer();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(iceCreamShop);

	}

}
