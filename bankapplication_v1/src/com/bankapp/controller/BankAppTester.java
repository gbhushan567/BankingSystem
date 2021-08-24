package com.bankapp.controller;

import java.util.Scanner;

import com.bankapp.model.Customer;
import com.bankapp.service.BankService;

public class BankAppTester {

	public static void main(String[] args) {
		Customer customer1 = new Customer("ravi", "5456455", "password");
		
		Scanner scanner = new Scanner(System.in);
		
		BankService banking =new BankService();
		
		String bankAccountNo;
		String password;
		System.out.println("Welcome to the login page");
		System.out.println();
		System.out.println("enter the bank account no");
		bankAccountNo = scanner.nextLine();

		System.out.println("enter the password of that accont");
		password = scanner.nextLine();

		if(customer1.getBankAccountNo().equals(bankAccountNo) 
				&& customer1.getPassword().equals(password)) {
			System.out.println("Welcome to Indian bank");
			int choice=0;
			
			do {
				System.out.println("-----------------------------------");
				System.out.println("1. Deposit");
				System.out.println("2. Withdrawn");
				System.out.println("3. Transfer");
				System.out.println("0. logout");
				System.out.println("-----------------------------------");
				
				choice=scanner.nextInt();
				
				switch (choice) {
				case 0:
					choice=0;
					break;
					
				case 1:	banking.deposit();
					break;
				
				case 2:	banking.withdraw();
					 break;
				case 3:	
						banking.transfer();
						break;	
				default:
						System.out.println("Enter valid option");
						break;
				}
				
			}while(choice!=0);
			
			System.out.println("You are logged out...");
			scanner.close();// momory leak?
			
		}else {
			System.out.println("pl enter correct password");
		}
		
	}
}
