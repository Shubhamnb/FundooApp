package com.bridge.commercialdataprosessing;

import java.util.Scanner;

public class CommercialStockMethods {
	Scanner sc = new Scanner(System.in);
	private StockAccount stockAccount = new StockAccount();
	
	
	public void addDetails() throws Exception {
		System.out.println("Enter Whose details you want to add\n1.Company Stock\t2.User Deatils");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			stockAccount.addStockDetails();
			break;
		case 2:
			stockAccount.addUser();
			break;
		default:
			System.err.println("Invalid choice...!!!");
			System.out.println("Do you want to enter again...(Y/N)");
			char ch = sc.next().charAt(0);
			if (ch == 'Y' || ch == 'y')
				addDetails();
		}
	}

}
