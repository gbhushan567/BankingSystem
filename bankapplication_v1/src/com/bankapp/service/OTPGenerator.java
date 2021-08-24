package com.bankapp.service;

public class OTPGenerator {
	public int generateOtp() {
		int randomPin=(int) (Math.random()*6000)+1000;
		return randomPin;
	}
}
