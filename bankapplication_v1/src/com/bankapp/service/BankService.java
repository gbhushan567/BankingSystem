package com.bankapp.service;

import java.util.Scanner;

public class BankService {
	Scanner scanner = new Scanner(System.in);
	OTPGenerator generator = new OTPGenerator();
	int bankBalance = 1000;

	public void deposit() {
		int amount;
		System.out.println("Enter the amount to deposit...");
		amount = scanner.nextInt();
		if (amount > 0) {
			System.out.println("amount : " + amount + " is deposited successfully...");
			bankBalance = bankBalance + amount;
			System.out.println("remaining balance with bank: " + bankBalance);
		} else {
			System.out.println("enter a correct amount");
		}
	}

	public void withdraw() {
		int amount;
		System.out.println("Enter the amount to withdrawl...");
		amount = scanner.nextInt();
		if (bankBalance - amount >= 0) {
			System.out.println("amount : " + amount + " is withdraw successfully...");
			bankBalance = bankBalance - amount;
			System.out.println("remaining balance with bank: " + bankBalance);
		} else {
			System.out.println("insufficient amount");
		}
	}

	public void transfer() {
		int amount;
		int otp;
		int otpGenerated;
		int bankAccountNo;

		System.out.println("Enter opt on console");
		otpGenerated = generator.generateOtp();// 1234
		System.out.println("PL enter OTP: "+ otpGenerated);
		otp = scanner.nextInt();

		if (otp == otpGenerated) {
			System.out.println("otp verfifcation is done succesfully!!!");
			System.out.println("pl enter the amount and bankaccount no to which you want to transfer the amount");

			amount = scanner.nextInt();
			bankAccountNo = scanner.nextInt();

			if (bankBalance - amount >= 0) {
				System.out.println("amount " + amount + " tranfered successfully to account " + bankAccountNo);
				bankBalance = bankBalance - amount;
				System.out.println("remaining balance with bank: " + bankBalance);

			} else {
				System.out.println("insufficient funds");
			}

		} else {
			System.out.println("invalid otp pl try again");
		}

	}

}
