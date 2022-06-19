package com.greatlearning.employee;

import java.util.Random;

public class CredentialService {

	public String generateEmailAddress(String firstName, String lastName, String departmentSlct) {
		// Combine elements to generate email
		return firstName.toLowerCase()+lastName.toLowerCase()+ "@" + departmentSlct+".abc.com";
	}

	public char[] generatePassword() {
		// generating random password
		String uprcase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lwrcase ="abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String splchar = "!@#$%^&*<+->";
		
		String concat=uprcase+lwrcase+splchar+num;
		
		int length = 10;
		char []password = new char[length];
		
		Random rnd = new Random();
			for(int i=0 ;i<length;i++) {
				password[i]=concat.charAt(rnd.nextInt(concat.length()));
				
		}
		return password;
	}

	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		System.out.println("Dear " +employee.getFirstName()+ "your generated Credentials are as follow");
		// calling other functions to get generated password and email
		System.out.println("Email:      "+ email);
		System.out.println("Password:   " + generatedPassword); 
	}

}
