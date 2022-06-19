package com.greatlearning.employee;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		
		System.out.println("Please enter the first and last name");
		Scanner a = new Scanner(System.in);
		String fstname = a.next();
		String lstname = a.next();

		// creating employee obj
		Employee emp = new Employee(fstname, lstname);
		CredentialService cdsrv = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;
	
		
		//selecting Department
		System.out.print("DEPARTMENT CODES:\n1 for Technical\n2 for Admin\n3 for Human resource\n"
				+ "4 for Legal\n Please Enter Department Code: ");
			
		Scanner sc = new Scanner(System.in);
		int deptslct = sc.nextInt();
			
		if (deptslct == 1) {
				generatedEmail = cdsrv.generateEmailAddress(emp.getFirstName().toLowerCase(),
						emp.getLastName().toLowerCase(), "tech");
				generatedPassword = cdsrv.generatePassword();
				cdsrv.showCredentials(emp, generatedEmail, generatedPassword);
		}
		
		else if (deptslct == 2) {
			generatedEmail = cdsrv.generateEmailAddress(emp.getFirstName().toLowerCase(),
					emp.getLastName().toLowerCase(), "adm");
			generatedPassword = cdsrv.generatePassword();
			cdsrv.showCredentials(emp, generatedEmail, generatedPassword);
		}
		
		else if (deptslct == 3) {
			generatedEmail = cdsrv.generateEmailAddress(emp.getFirstName().toLowerCase(),
					emp.getLastName().toLowerCase(), "hr");
			generatedPassword = cdsrv.generatePassword();
			cdsrv.showCredentials(emp, generatedEmail, generatedPassword);
		}
		
		else if (deptslct == 4) {
			generatedEmail = cdsrv.generateEmailAddress(emp.getFirstName().toLowerCase(),
					emp.getLastName().toLowerCase(), "lg");
			generatedPassword = cdsrv.generatePassword();
			cdsrv.showCredentials(emp, generatedEmail, generatedPassword);
		}
		
		else
			 System.out.println("Enter valid Option");
		
	sc.close();

	}
	
}
